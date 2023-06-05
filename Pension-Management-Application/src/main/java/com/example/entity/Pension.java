package com.example.entity;

import javax.persistence.Entity;

@Entity
public class Pension {
        private Long aadhar;
        private String pension_amt;
        private String charge;
		/**
		 * @return the aadhar
		 */
		public Long getAadhar() {
			return aadhar;
		}
		/**
		 * @param aadhar the aadhar to set
		 */
		public void setAadhar(Long aadhar) {
			this.aadhar = aadhar;
		}
		/**
		 * @return the pension_amt
		 */
		public String getPension_amt() {
			return pension_amt;
		}
		/**
		 * @param pension_amt the pension_amt to set
		 */
		public void setPension_amt(String pension_amt) {
			this.pension_amt = pension_amt;
		}
		/**
		 * @return the charge
		 */
		public String getCharge() {
			return charge;
		}
		/**
		 * @param charge the charge to set
		 */
		public void setCharge(String charge) {
			this.charge = charge;
		}
		public Pension(Long aadhar, String pension_amt, String charge) {
			super();
			this.aadhar = aadhar;
			this.pension_amt = pension_amt;
			this.charge = charge;
		}
		public Pension() {
			super();
		}
		
        
}
