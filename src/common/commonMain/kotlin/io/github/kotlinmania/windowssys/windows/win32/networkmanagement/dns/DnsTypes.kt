package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias DnsCharset = Int

public typealias DnsConfigType = Int

public typealias DnsConnectionPolicyTag = Int

public typealias DnsConnectionProxyInfoSwitch = Int

public typealias DnsConnectionProxyType = Int

public typealias DnsFreeType = Int

public typealias DnsNameFormat = Int

public fun interface DnsProxyCompletionRoutineFn {
    public operator fun invoke(completioncontext: COpaquePointer?, status: Int)
}

public typealias DnsProxyCompletionRoutine = DnsProxyCompletionRoutineFn?

public typealias DnsProxyInformationType = Int

public typealias DnsQueryOptions = UInt

public fun interface DnsQueryRawCompletionRoutineFn {
    public operator fun invoke(querycontext: COpaquePointer?, queryresults: COpaquePointer?)
}

public typealias DnsQueryRawCompletionRoutine = DnsQueryRawCompletionRoutineFn?

public typealias DnsSection = Int

public typealias DnsSvcbParamType = Int

public typealias DnsType = UShort

public fun interface PdnsQueryCompletionRoutineFn {
    public operator fun invoke(pquerycontext: COpaquePointer?, pqueryresults: COpaquePointer?)
}

public typealias PdnsQueryCompletionRoutine = PdnsQueryCompletionRoutineFn?

public fun interface PdnsServiceBrowseCallbackFn {
    public operator fun invoke(status: UInt, pquerycontext: COpaquePointer?, pdnsrecord: COpaquePointer?)
}

public typealias PdnsServiceBrowseCallback = PdnsServiceBrowseCallbackFn?

public fun interface PdnsServiceRegisterCompleteFn {
    public operator fun invoke(status: UInt, pquerycontext: COpaquePointer?, pinstance: COpaquePointer?)
}

public typealias PdnsServiceRegisterComplete = PdnsServiceRegisterCompleteFn?

public fun interface PdnsServiceResolveCompleteFn {
    public operator fun invoke(status: UInt, pquerycontext: COpaquePointer?, pinstance: COpaquePointer?)
}

public typealias PdnsServiceResolveComplete = PdnsServiceResolveCompleteFn?

public fun interface PmdnsQueryCallbackFn {
    public operator fun invoke(pquerycontext: COpaquePointer?, pqueryhandle: COpaquePointer?, pqueryresults: COpaquePointer?)
}

public typealias PmdnsQueryCallback = PmdnsQueryCallbackFn?
