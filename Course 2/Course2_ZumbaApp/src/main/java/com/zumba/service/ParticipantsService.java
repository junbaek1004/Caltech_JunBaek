package com.zumba.service;

import java.util.List;


import com.zumba.bean.Participants;
import com.zumba.dao.ParticipantsDao;

public class ParticipantsService {

	ParticipantsDao pd = new ParticipantsDao();
	
	public List<Participants> viewAllParticipantsDetails() {
		return pd.viewAllParticipants();
	}
	
	public void addParticipant(Participants pa) {
		pd.addParticipant(pa);
	}
}
