package com.app.impl.obj;

import com.app.Plan;
import com.app.impl.CommercialPlan;
import com.app.impl.DomesticPlan;
import com.app.impl.InstitutionalPlan;

public class GetPlanFactory {
	
	public Plan getPlan(String planType){
		if(planType==null){
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN"))
			return new DomesticPlan();
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
			return new CommercialPlan();
		}else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
			return new InstitutionalPlan();
		}
		return null;
		
	}

}
