package mumbai.d360.searchdata;

/**
 * Copyright (C) 2015 Ari C.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context;
import android.widget.Filter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mumbai.d360.model.Station;

public class DataHelper {

    private static final String COLORS_FILE_NAME = "colors.json";


    private static List<SearchSuggestion> sSearchSuggestions =
            new ArrayList<>(Arrays.asList(
                    new SearchSuggestion("green","CST"),
                    new SearchSuggestion("blue","CST"),
                    new SearchSuggestion("pink","CST"),
                    new SearchSuggestion("purple","CST"),
                    new SearchSuggestion("brown","CST"),
                    new SearchSuggestion("gray","CST"),
                    new SearchSuggestion("Granny Smith Apple","CST"),
                    new SearchSuggestion("Indigo","CST"),
                    new SearchSuggestion("Periwinkle","CST"),
                    new SearchSuggestion("Mahogany","CST"),
                    new SearchSuggestion("Maize","CST"),
                    new SearchSuggestion("Mahogany","CST"),
                    new SearchSuggestion("Outer Space","CST"),
                    new SearchSuggestion("Melon","CST"),
                    new SearchSuggestion("Yellow","CST"),
                    new SearchSuggestion("Orange","CST"),
                    new SearchSuggestion("Red","CST"),
                    new SearchSuggestion("Orchid","CST")));

//    public interface OnFindColorsListener {
//        void onResults(List<ColorWrapper> results);
//    }

    public interface OnFindSuggestionsListener {
        void onResults(List<Station> results);
    }

    public static List<SearchSuggestion> getHistory(Context context, int count) {

        List<SearchSuggestion> suggestionList = new ArrayList<>();
        SearchSuggestion searchSuggestion;
        for (int i = 0; i < sSearchSuggestions.size(); i++) {
            searchSuggestion = sSearchSuggestions.get(i);
            searchSuggestion.setIsHistory(true);
            suggestionList.add(searchSuggestion);
            if (suggestionList.size() == count) {
                break;
            }
        }
        return suggestionList;
    }

    public static void resetSuggestionsHistory() {
        for (SearchSuggestion searchSuggestion : sSearchSuggestions) {
            searchSuggestion.setIsHistory(false);
        }
    }

    public static void findSuggestions(Context context, String query, final int limit, final long simulatedDelay,
                                       final OnFindSuggestionsListener listener) {
        new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                try {
                    Thread.sleep(simulatedDelay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                DataHelper.resetSuggestionsHistory();
                List<SearchSuggestion> suggestionList = new ArrayList<>();
                if (!(constraint == null || constraint.length() == 0)) {

                    for (SearchSuggestion suggestion : sSearchSuggestions) {
                        if (suggestion.getBody().toUpperCase()
                                .startsWith(constraint.toString().toUpperCase())) {

                            suggestionList.add(suggestion);
                            if (limit != -1 && suggestionList.size() == limit) {
                                break;
                            }
                        }
                    }
                }

                FilterResults results = new FilterResults();
                Collections.sort(suggestionList, new Comparator<SearchSuggestion>() {
                    @Override
                    public int compare(SearchSuggestion lhs, SearchSuggestion rhs) {
                        return lhs.getIsHistory() ? -1 : 0;
                    }
                });
                results.values = suggestionList;
                results.count = suggestionList.size();

                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

                if (listener != null) {
                    listener.onResults((List<Station>) results.values);
                }
            }
        }.filter(query);

    }



}