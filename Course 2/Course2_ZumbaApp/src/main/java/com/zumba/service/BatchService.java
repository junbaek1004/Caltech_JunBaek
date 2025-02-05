package com.zumba.service;

import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.dao.BatchDao;

public class BatchService {

	BatchDao bd = new BatchDao();
	
	public List<Batch> viewAllBatchDetails() {
		return bd.viewAllBatch();
	}
	
	public void addBatch(Batch ba) {
		bd.addBatch(ba);
	}
}
