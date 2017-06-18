package com.zf.repository.impl;

import com.zf.repository.DaoIn;

public class DaoImpl implements DaoIn{

	@Override
	public void say() {
		System.out.println("dao say...");
	}

}
