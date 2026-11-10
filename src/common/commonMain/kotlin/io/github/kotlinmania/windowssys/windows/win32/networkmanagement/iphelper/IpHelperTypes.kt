package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlNetworkConnectivityHint

public typealias DnsServerPropertyType = Int

public typealias GetAdaptersAddressesFlags = UInt

public typealias GlobalFilter = Int

public typealias Hiftimestampchange = COpaquePointer?

public typealias Icmp4Type = Int

public typealias Icmp6Type = Int

public typealias IfAccessType = Int

public typealias InternalIfOperStatus = Int

public typealias MibIfEntryLevel = Int

public typealias MibIfTableLevel = Int

public typealias MibIpforwardType = Int

public typealias MibIpnetType = Int

public typealias MibIpstatsForwarding = Int

public typealias MibNotificationType = Int

public typealias MibTcpState = Int

public typealias NetAddressFormat = Int

public typealias Pfaddresstype = Int

public typealias PfforwardAction = Int

public typealias Pfframetype = Int

public fun interface PinterfaceTimestampConfigChangeCallbackFn {
    public operator fun invoke(callercontext: COpaquePointer?)
}

public typealias PinterfaceTimestampConfigChangeCallback = PinterfaceTimestampConfigChangeCallbackFn?

public fun interface PipforwardChangeCallbackFn {
    public operator fun invoke(callercontext: COpaquePointer?, row: COpaquePointer?, notificationtype: MibNotificationType)
}

public typealias PipforwardChangeCallback = PipforwardChangeCallbackFn?

public fun interface PipinterfaceChangeCallbackFn {
    public operator fun invoke(callercontext: COpaquePointer?, row: COpaquePointer?, notificationtype: MibNotificationType)
}

public typealias PipinterfaceChangeCallback = PipinterfaceChangeCallbackFn?

public fun interface PnetworkConnectivityHintChangeCallbackFn {
    public operator fun invoke(callercontext: COpaquePointer?, connectivityhint: NlNetworkConnectivityHint)
}

public typealias PnetworkConnectivityHintChangeCallback = PnetworkConnectivityHintChangeCallbackFn?

public fun interface PstableUnicastIpaddressTableCallbackFn {
    public operator fun invoke(callercontext: COpaquePointer?, addresstable: COpaquePointer?)
}

public typealias PstableUnicastIpaddressTableCallback = PstableUnicastIpaddressTableCallbackFn?

public fun interface PteredoPortChangeCallbackFn {
    public operator fun invoke(callercontext: COpaquePointer?, port: UShort, notificationtype: MibNotificationType)
}

public typealias PteredoPortChangeCallback = PteredoPortChangeCallbackFn?

public fun interface PunicastIpaddressChangeCallbackFn {
    public operator fun invoke(callercontext: COpaquePointer?, row: COpaquePointer?, notificationtype: MibNotificationType)
}

public typealias PunicastIpaddressChangeCallback = PunicastIpaddressChangeCallbackFn?

public typealias TcpipOwnerModuleInfoClass = Int

public typealias TcpBooleanOptional = Int

public typealias TcpConnectionOffloadState = Int

public typealias TcpEstatsType = Int

public typealias TcpRtoAlgorithm = Int

public typealias TcpSoftError = Int

public typealias TcpTableClass = Int

public typealias UdpTableClass = Int
