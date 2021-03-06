package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
	else
		super.countIn(in);
	}

	//Skróty alt + left/right w Intellij pozwalają na przechodzenie między otwartymi kartami.
	//Dla Eclipse pozwalają na poruszanie się między pozycjami w których był kursor
}
