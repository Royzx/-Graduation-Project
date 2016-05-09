package com.ticket.po;



public class FlightModel {

	    //航班号
		private String fnumber;
		//航空公司
		private String fcompany;
		//航班机型
		private String ftype;
		//航班起飞地
		private String fplacefrom;
		//航班目的地
		private String fdestination;
		//航班起飞日期
		private String   fdeparturedate;
		//航班起飞时间
		private String   fdeparturetime;
		//航班降落时间
		private String   ffalltime;
		//机票价格
		private String    fprice;
		
		public String getFnumber() {
			return fnumber;
		}
		public void setFnumber(String fnumber) {
			this.fnumber = fnumber;
		}
		public String getFcompany() {
			return fcompany;
		}
		public void setFcompany(String fcompany) {
			this.fcompany = fcompany;
		}
		public String getFtype() {
			return ftype;
		}
		public void setFtype(String ftype) {
			this.ftype = ftype;
		}
		public String getFplacefrom() {
			return fplacefrom;
		}
		public void setFplacefrom(String fplacefrom) {
			this.fplacefrom = fplacefrom;
		}
		public String getFdestination() {
			return fdestination;
		}
		public void setFdestination(String fdestination) {
			this.fdestination = fdestination;
		}
		public String getFdeparturedate() {
			return fdeparturedate;
		}
		public void setFdeparturedate(String fdeparturedate) {
			this.fdeparturedate = fdeparturedate;
		}
		public String getFdeparturetime() {
			return fdeparturetime;
		}
		public void setFdeparturetime(String fdeparturetime) {
			this.fdeparturetime = fdeparturetime;
		}
		public String getFfalltime() {
			return ffalltime;
		}
		public void setFfalltime(String ffalltime) {
			this.ffalltime = ffalltime;
		}
		public String getFprice() {
			return fprice;
		}
		public void setFprice(String fprice) {
			this.fprice = fprice;
		}
		
}
