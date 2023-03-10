package com.isep.items.progressToken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgressTokens {

	public static final List<ProgressToken> TOKENS = createTokenList();
	
	// there is 1 token of each type, and 2 tokens of the same 'Culture' type

	/**
	 * @return La liste de toutes les ProgressToken
	 */
	private static List<ProgressToken> createTokenList() {
		List<ProgressToken> res = new ArrayList<ProgressToken>();
		res.addAll(Arrays.asList(ProgressToken.values()));
		res.add(ProgressToken.Culture);
		// trie sur la liste
		Collections.shuffle(res);
		return res;
	}

}
