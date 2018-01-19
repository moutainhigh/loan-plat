package com.pingxun.biz.pay.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AliPayResultDto {

    private Long resultId;

    private Long id;

    private String notify_time;

    private String notify_type;

    private String notify_id;

    private String app_id;

    private String charset;

    private String sign_type;

    private String sign;

    private String trade_no;

    private String out_trade_no;

    private String buyer_id;

    private String buyer_logon_id;

    private String seller_id;

    private String seller_email;

    private String trade_status;

    private String total_amount;

    private String receipt_amount;

    private String invoice_amount;

    private String buyer_pay_amount;

    private String subject;

    private String body;

    private String gmt_create;

    private String gmt_payment;

    private String gmt_close;

    private String fund_bill_list;

    private String passback_params;

}
