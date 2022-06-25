package com.shopify.model;

public class ShopifyUpdateOrderRequest {

	private String orderId;
	private final ShopifyOrder order;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public static interface OptionalsStep {
		OptionalsStep withOrderId(final String orderId);
		OptionalsStep withNote(final String note);
		OptionalsStep withTags(final String tags);

		ShopifyUpdateOrderRequest build();
	}

	public static interface MandatoryStep {
		ShopifyUpdateOrderRequest.OptionalsStep withOrderId(final String orderId);
	}

	public static MandatoryStep newBuilder() {
		return new Steps();
	}

	public ShopifyOrder getOrder() {
		return order;
	}

	private ShopifyUpdateOrderRequest(final String orderId, final ShopifyOrder order) {
		this.orderId = orderId;
		this.order = order;
	}

	private static class Steps implements MandatoryStep, OptionalsStep {

		private String orderId;
		private final ShopifyOrder order = new ShopifyOrder();

		public Steps(){
			order.setLineItems(null);
			order.setFulfillments(null);
			order.setShippingAddress(null);
			order.setBillingAddress(null);
			order.setShippingAddress(null);
			order.setShippingLines(null);
			order.setTaxLines(null);
			order.setNoteAttributes(null);
			order.setRefunds(null);
			order.setMetafields(null);
		}

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		@Override
		public ShopifyUpdateOrderRequest build() {
			return new ShopifyUpdateOrderRequest(orderId, order);
		}

		@Override
		public OptionalsStep withNote(final String note) {
			this.order.setNote(note);
			return this;
		}

		@Override
		public OptionalsStep withTags(final String tags) {
			this.order.setTags(tags);
			return this;
		}

		@Override
		public OptionalsStep withOrderId(String orderId) {
			this.setOrderId(orderId);
			return this;
		}
	}
}
