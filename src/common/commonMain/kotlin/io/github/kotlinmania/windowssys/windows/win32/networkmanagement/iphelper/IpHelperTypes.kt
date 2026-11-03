package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

public typealias DNS_SERVER_PROPERTY_TYPE = Int

public typealias GET_ADAPTERS_ADDRESSES_FLAGS = UInt

public typealias GLOBAL_FILTER = Int

public typealias HIFTIMESTAMPCHANGE = Long

public typealias ICMP4_TYPE = Int

public typealias ICMP6_TYPE = Int

public typealias IF_ACCESS_TYPE = Int

public typealias INTERNAL_IF_OPER_STATUS = Int

public typealias MIB_IF_ENTRY_LEVEL = Int

public typealias MIB_IF_TABLE_LEVEL = Int

public typealias MIB_IPFORWARD_TYPE = Int

public typealias MIB_IPNET_TYPE = Int

public typealias MIB_IPSTATS_FORWARDING = Int

public typealias MIB_NOTIFICATION_TYPE = Int

public typealias MIB_TCP_STATE = Int

public typealias NET_ADDRESS_FORMAT = Int

public typealias PFADDRESSTYPE = Int

public typealias PFFORWARD_ACTION = Int

public typealias PFFRAMETYPE = Int

public fun interface PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACKFn {
    public operator fun invoke(callercontext: Long)
}

public typealias PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK = PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACKFn?

public fun interface PIPFORWARD_CHANGE_CALLBACKFn {
    public operator fun invoke(callercontext: Long, row: Long, notificationtype: MIB_NOTIFICATION_TYPE)
}

public typealias PIPFORWARD_CHANGE_CALLBACK = PIPFORWARD_CHANGE_CALLBACKFn?

public fun interface PIPINTERFACE_CHANGE_CALLBACKFn {
    public operator fun invoke(callercontext: Long, row: Long, notificationtype: MIB_NOTIFICATION_TYPE)
}

public typealias PIPINTERFACE_CHANGE_CALLBACK = PIPINTERFACE_CHANGE_CALLBACKFn?

public fun interface PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACKFn {
    public operator fun invoke(callercontext: Long, connectivityhint: Networking.WinSock.NL_NETWORK_CONNECTIVITY_HINT)
}

public typealias PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK = PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACKFn?

public fun interface PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACKFn {
    public operator fun invoke(callercontext: Long, addresstable: Long)
}

public typealias PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK = PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACKFn?

public fun interface PTEREDO_PORT_CHANGE_CALLBACKFn {
    public operator fun invoke(callercontext: Long, port: UShort, notificationtype: MIB_NOTIFICATION_TYPE)
}

public typealias PTEREDO_PORT_CHANGE_CALLBACK = PTEREDO_PORT_CHANGE_CALLBACKFn?

public fun interface PUNICAST_IPADDRESS_CHANGE_CALLBACKFn {
    public operator fun invoke(callercontext: Long, row: Long, notificationtype: MIB_NOTIFICATION_TYPE)
}

public typealias PUNICAST_IPADDRESS_CHANGE_CALLBACK = PUNICAST_IPADDRESS_CHANGE_CALLBACKFn?

public typealias TCPIP_OWNER_MODULE_INFO_CLASS = Int

public typealias TCP_BOOLEAN_OPTIONAL = Int

public typealias TCP_CONNECTION_OFFLOAD_STATE = Int

public typealias TCP_ESTATS_TYPE = Int

public typealias TCP_RTO_ALGORITHM = Int

public typealias TCP_SOFT_ERROR = Int

public typealias TCP_TABLE_CLASS = Int

public typealias UDP_TABLE_CLASS = Int
