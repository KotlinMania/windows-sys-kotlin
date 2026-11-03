package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias DHCPV6_STATELESS_PARAM_TYPE = Int

public typealias DHCP_FAILOVER_MODE = Int

public typealias DHCP_FAILOVER_SERVER = Int

public typealias DHCP_FILTER_LIST_TYPE = Int

public typealias DHCP_FORCE_FLAG = Int

public typealias DHCP_OPTION_DATA_TYPE = Int

public typealias DHCP_OPTION_SCOPE_TYPE = Int

public typealias DHCP_OPTION_SCOPE_TYPE6 = Int

public typealias DHCP_OPTION_TYPE = Int

public typealias DHCP_POLICY_FIELDS_TO_UPDATE = Int

public typealias DHCP_POL_ATTR_TYPE = Int

public typealias DHCP_POL_COMPARATOR = Int

public typealias DHCP_POL_LOGIC_OPER = Int

public typealias DHCP_PROPERTY_ID = Int

public typealias DHCP_PROPERTY_TYPE = Int

public typealias DHCP_SCAN_FLAG = Int

public typealias DHCP_SEARCH_INFO_TYPE = Int

public typealias DHCP_SEARCH_INFO_TYPE_V6 = Int

public typealias DHCP_SUBNET_ELEMENT_TYPE = Int

public typealias DHCP_SUBNET_ELEMENT_TYPE_V6 = Int

public typealias DHCP_SUBNET_STATE = Int

public typealias FSM_STATE = Int

public fun interface LPDHCP_CONTROLFn {
    public operator fun invoke(dwcontrolcode: UInt, lpreserved: Long): UInt
}

public typealias LPDHCP_CONTROL = LPDHCP_CONTROLFn?

public fun interface LPDHCP_DELETE_CLIENTFn {
    public operator fun invoke(ipaddress: UInt, hwaddress: Long, hwaddresslength: UInt, reserved: UInt, clienttype: UInt): UInt
}

public typealias LPDHCP_DELETE_CLIENT = LPDHCP_DELETE_CLIENTFn?

public fun interface LPDHCP_DROP_SENDFn {
    public operator fun invoke(packet: Long, packetsize: Long, controlcode: UInt, ipaddress: UInt, reserved: Long, pktcontext: Long): UInt
}

public typealias LPDHCP_DROP_SEND = LPDHCP_DROP_SENDFn?

public fun interface LPDHCP_ENTRY_POINT_FUNCFn {
    public operator fun invoke(chaindlls: PCWSTR, calloutversion: UInt, callouttbl: Long): UInt
}

public typealias LPDHCP_ENTRY_POINT_FUNC = LPDHCP_ENTRY_POINT_FUNCFn?

public fun interface LPDHCP_GIVE_ADDRESSFn {
    public operator fun invoke(packet: Long, packetsize: UInt, controlcode: UInt, ipaddress: UInt, altaddress: UInt, addrtype: UInt, leasetime: UInt, reserved: Long, pktcontext: Long): UInt
}

public typealias LPDHCP_GIVE_ADDRESS = LPDHCP_GIVE_ADDRESSFn?

public fun interface LPDHCP_HANDLE_OPTIONSFn {
    public operator fun invoke(packet: Long, packetsize: UInt, reserved: Long, pktcontext: Long, serveroptions: Long): UInt
}

public typealias LPDHCP_HANDLE_OPTIONS = LPDHCP_HANDLE_OPTIONSFn?

public fun interface LPDHCP_NEWPKTFn {
    public operator fun invoke(packet: Long, packetsize: Long, ipaddress: UInt, reserved: Long, pktcontext: Long, processit: Long): UInt
}

public typealias LPDHCP_NEWPKT = LPDHCP_NEWPKTFn?

public fun interface LPDHCP_PROBFn {
    public operator fun invoke(packet: Long, packetsize: UInt, controlcode: UInt, ipaddress: UInt, altaddress: UInt, reserved: Long, pktcontext: Long): UInt
}

public typealias LPDHCP_PROB = LPDHCP_PROBFn?

public typealias QuarantineStatus = Int

public typealias StatusCode = Int
