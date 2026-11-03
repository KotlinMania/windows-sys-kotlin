package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

public typealias DL_ADDRESS_TYPE = Int

public typealias FWPM_APPC_NETWORK_CAPABILITY_TYPE = Int

public fun interface FWPM_CALLOUT_CHANGE_CALLBACK0Fn {
    public operator fun invoke(context: Long, change: Long)
}

public typealias FWPM_CALLOUT_CHANGE_CALLBACK0 = FWPM_CALLOUT_CHANGE_CALLBACK0Fn?

public typealias FWPM_CHANGE_TYPE = Int

public fun interface FWPM_CONNECTION_CALLBACK0Fn {
    public operator fun invoke(context: Long, eventtype: FWPM_CONNECTION_EVENT_TYPE, connection: Long)
}

public typealias FWPM_CONNECTION_CALLBACK0 = FWPM_CONNECTION_CALLBACK0Fn?

public typealias FWPM_CONNECTION_EVENT_TYPE = Int

public fun interface FWPM_DYNAMIC_KEYWORD_CALLBACK0Fn {
    public operator fun invoke(notification: Long, context: Long)
}

public typealias FWPM_DYNAMIC_KEYWORD_CALLBACK0 = FWPM_DYNAMIC_KEYWORD_CALLBACK0Fn?

public typealias FWPM_ENGINE_OPTION = Int

public typealias FWPM_FIELD_TYPE = Int

public fun interface FWPM_FILTER_CHANGE_CALLBACK0Fn {
    public operator fun invoke(context: Long, change: Long)
}

public typealias FWPM_FILTER_CHANGE_CALLBACK0 = FWPM_FILTER_CHANGE_CALLBACK0Fn?

public typealias FWPM_FILTER_FLAGS = UInt

public fun interface FWPM_NET_EVENT_CALLBACK0Fn {
    public operator fun invoke(context: Long, event: Long)
}

public typealias FWPM_NET_EVENT_CALLBACK0 = FWPM_NET_EVENT_CALLBACK0Fn?

public fun interface FWPM_NET_EVENT_CALLBACK1Fn {
    public operator fun invoke(context: Long, event: Long)
}

public typealias FWPM_NET_EVENT_CALLBACK1 = FWPM_NET_EVENT_CALLBACK1Fn?

public fun interface FWPM_NET_EVENT_CALLBACK2Fn {
    public operator fun invoke(context: Long, event: Long)
}

public typealias FWPM_NET_EVENT_CALLBACK2 = FWPM_NET_EVENT_CALLBACK2Fn?

public fun interface FWPM_NET_EVENT_CALLBACK3Fn {
    public operator fun invoke(context: Long, event: Long)
}

public typealias FWPM_NET_EVENT_CALLBACK3 = FWPM_NET_EVENT_CALLBACK3Fn?

public fun interface FWPM_NET_EVENT_CALLBACK4Fn {
    public operator fun invoke(context: Long, event: Long)
}

public typealias FWPM_NET_EVENT_CALLBACK4 = FWPM_NET_EVENT_CALLBACK4Fn?

public typealias FWPM_NET_EVENT_TYPE = Int

public fun interface FWPM_PROVIDER_CHANGE_CALLBACK0Fn {
    public operator fun invoke(context: Long, change: Long)
}

public typealias FWPM_PROVIDER_CHANGE_CALLBACK0 = FWPM_PROVIDER_CHANGE_CALLBACK0Fn?

public fun interface FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0Fn {
    public operator fun invoke(context: Long, change: Long)
}

public typealias FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0 = FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0Fn?

public typealias FWPM_PROVIDER_CONTEXT_TYPE = Int

public typealias FWPM_SERVICE_STATE = Int

public fun interface FWPM_SUBLAYER_CHANGE_CALLBACK0Fn {
    public operator fun invoke(context: Long, change: Long)
}

public typealias FWPM_SUBLAYER_CHANGE_CALLBACK0 = FWPM_SUBLAYER_CHANGE_CALLBACK0Fn?

public typealias FWPM_SUBSCRIPTION_FLAGS = UInt

public fun interface FWPM_SYSTEM_PORTS_CALLBACK0Fn {
    public operator fun invoke(context: Long, sysports: Long)
}

public typealias FWPM_SYSTEM_PORTS_CALLBACK0 = FWPM_SYSTEM_PORTS_CALLBACK0Fn?

public typealias FWPM_SYSTEM_PORT_TYPE = Int

public fun interface FWPM_VSWITCH_EVENT_CALLBACK0Fn {
    public operator fun invoke(context: Long, vswitchevent: Long): UInt
}

public typealias FWPM_VSWITCH_EVENT_CALLBACK0 = FWPM_VSWITCH_EVENT_CALLBACK0Fn?

public typealias FWPM_VSWITCH_EVENT_TYPE = Int

public typealias FWP_ACTION_TYPE = UInt

public typealias FWP_AF = Int

public typealias FWP_CLASSIFY_OPTION_TYPE = Int

public typealias FWP_DATA_TYPE = Int

public typealias FWP_DIRECTION = Int

public typealias FWP_ETHER_ENCAP_METHOD = Int

public typealias FWP_FILTER_ENUM_TYPE = Int

public typealias FWP_IP_VERSION = Int

public typealias FWP_MATCH_TYPE = Int

public typealias FWP_NETWORK_CONNECTION_POLICY_SETTING_TYPE = Int

public typealias FWP_VSWITCH_NETWORK_TYPE = Int

public typealias IKEEXT_AUTHENTICATION_IMPERSONATION_TYPE = Int

public typealias IKEEXT_AUTHENTICATION_METHOD_TYPE = Int

public typealias IKEEXT_CERT_AUTH = UInt

public typealias IKEEXT_CERT_CONFIG_TYPE = Int

public typealias IKEEXT_CERT_CRITERIA_NAME_TYPE = Int

public typealias IKEEXT_CERT_FLAGS = UInt

public typealias IKEEXT_CIPHER_TYPE = Int

public typealias IKEEXT_DH_GROUP = Int

public typealias IKEEXT_EAP_AUTHENTICATION_FLAGS = UInt

public typealias IKEEXT_EM_SA_STATE = Int

public typealias IKEEXT_INTEGRITY_TYPE = Int

public typealias IKEEXT_KERBEROS_AUTHENTICATION_FLAGS = UInt

public typealias IKEEXT_KEY_MODULE_TYPE = Int

public typealias IKEEXT_MM_SA_STATE = Int

public typealias IKEEXT_POLICY_FLAG = UInt

public typealias IKEEXT_PRESHARED_KEY_AUTHENTICATION_FLAGS = UInt

public typealias IKEEXT_QM_SA_STATE = Int

public typealias IKEEXT_RESERVED_AUTHENTICATION_FLAGS = UInt

public typealias IKEEXT_SA_ROLE = Int

public typealias IPSEC_AUTH_TYPE = Int

public typealias IPSEC_CIPHER_TYPE = Int

public typealias IPSEC_DOSP_FLAGS = UInt

public typealias IPSEC_FAILURE_POINT = Int

public fun interface IPSEC_KEY_MANAGER_DICTATE_KEY0Fn {
    public operator fun invoke(inboundsadetails: Long, outboundsadetails: Long, keyingmodulegenkey: Long): UInt
}

public typealias IPSEC_KEY_MANAGER_DICTATE_KEY0 = IPSEC_KEY_MANAGER_DICTATE_KEY0Fn?

public fun interface IPSEC_KEY_MANAGER_KEY_DICTATION_CHECK0Fn {
    public operator fun invoke(iketraffic: Long, willdictatekey: Long, weight: Long)
}

public typealias IPSEC_KEY_MANAGER_KEY_DICTATION_CHECK0 = IPSEC_KEY_MANAGER_KEY_DICTATION_CHECK0Fn?

public fun interface IPSEC_KEY_MANAGER_NOTIFY_KEY0Fn {
    public operator fun invoke(inboundsa: Long, outboundsa: Long)
}

public typealias IPSEC_KEY_MANAGER_NOTIFY_KEY0 = IPSEC_KEY_MANAGER_NOTIFY_KEY0Fn?

public typealias IPSEC_PFS_GROUP = Int

public typealias IPSEC_POLICY_FLAG = UInt

public typealias IPSEC_SA_BUNDLE_FLAGS = UInt

public fun interface IPSEC_SA_CONTEXT_CALLBACK0Fn {
    public operator fun invoke(context: Long, change: Long)
}

public typealias IPSEC_SA_CONTEXT_CALLBACK0 = IPSEC_SA_CONTEXT_CALLBACK0Fn?

public typealias IPSEC_SA_CONTEXT_EVENT_TYPE0 = Int

public typealias IPSEC_TOKEN_MODE = Int

public typealias IPSEC_TOKEN_PRINCIPAL = Int

public typealias IPSEC_TOKEN_TYPE = Int

public typealias IPSEC_TRAFFIC_TYPE = Int

public typealias IPSEC_TRANSFORM_TYPE = Int
