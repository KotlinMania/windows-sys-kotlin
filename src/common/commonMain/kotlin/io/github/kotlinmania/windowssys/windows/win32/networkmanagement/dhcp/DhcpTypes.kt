package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias Dhcpv6StatelessParamType = Int

public typealias DhcpFailoverMode = Int

public typealias DhcpFailoverServer = Int

public typealias DhcpFilterListType = Int

public typealias DhcpForceFlag = Int

public typealias DhcpOptionDataType = Int

public typealias DhcpOptionScopeType = Int

public typealias DhcpOptionScopeType6 = Int

public typealias DhcpOptionType = Int

public typealias DhcpPolicyFieldsToUpdate = Int

public typealias DhcpPolAttrType = Int

public typealias DhcpPolComparator = Int

public typealias DhcpPolLogicOper = Int

public typealias DhcpPropertyId = Int

public typealias DhcpPropertyType = Int

public typealias DhcpScanFlag = Int

public typealias DhcpSearchInfoType = Int

public typealias DhcpSearchInfoTypeV6 = Int

public typealias DhcpSubnetElementType = Int

public typealias DhcpSubnetElementTypeV6 = Int

public typealias DhcpSubnetState = Int

public typealias FsmState = Int

public fun interface LpdhcpControlFn {
    public operator fun invoke(dwcontrolcode: UInt, lpreserved: COpaquePointer?): UInt
}

public typealias LpdhcpControl = LpdhcpControlFn?

public fun interface LpdhcpDeleteClientFn {
    public operator fun invoke(ipaddress: UInt, hwaddress: COpaquePointer?, hwaddresslength: UInt, reserved: UInt, clienttype: UInt): UInt
}

public typealias LpdhcpDeleteClient = LpdhcpDeleteClientFn?

public fun interface LpdhcpDropSendFn {
    public operator fun invoke(packet: COpaquePointer?, packetsize: COpaquePointer?, controlcode: UInt, ipaddress: UInt, reserved: COpaquePointer?, pktcontext: COpaquePointer?): UInt
}

public typealias LpdhcpDropSend = LpdhcpDropSendFn?

public fun interface LpdhcpEntryPointFuncFn {
    public operator fun invoke(chaindlls: Pcwstr, calloutversion: UInt, callouttbl: COpaquePointer?): UInt
}

public typealias LpdhcpEntryPointFunc = LpdhcpEntryPointFuncFn?

public fun interface LpdhcpGiveAddressFn {
    public operator fun invoke(packet: COpaquePointer?, packetsize: UInt, controlcode: UInt, ipaddress: UInt, altaddress: UInt, addrtype: UInt, leasetime: UInt, reserved: COpaquePointer?, pktcontext: COpaquePointer?): UInt
}

public typealias LpdhcpGiveAddress = LpdhcpGiveAddressFn?

public fun interface LpdhcpHandleOptionsFn {
    public operator fun invoke(packet: COpaquePointer?, packetsize: UInt, reserved: COpaquePointer?, pktcontext: COpaquePointer?, serveroptions: COpaquePointer?): UInt
}

public typealias LpdhcpHandleOptions = LpdhcpHandleOptionsFn?

public fun interface LpdhcpNewpktFn {
    public operator fun invoke(packet: COpaquePointer?, packetsize: COpaquePointer?, ipaddress: UInt, reserved: COpaquePointer?, pktcontext: COpaquePointer?, processit: COpaquePointer?): UInt
}

public typealias LpdhcpNewpkt = LpdhcpNewpktFn?

public fun interface LpdhcpProbFn {
    public operator fun invoke(packet: COpaquePointer?, packetsize: UInt, controlcode: UInt, ipaddress: UInt, altaddress: UInt, reserved: COpaquePointer?, pktcontext: COpaquePointer?): UInt
}

public typealias LpdhcpProb = LpdhcpProbFn?

public typealias QuarantineStatus = Int

public typealias StatusCode = Int
