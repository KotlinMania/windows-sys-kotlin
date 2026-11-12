package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias DnsCharset = Int

public typealias DnsConfigType = Int

public typealias DnsConnectionPolicyTag = Int

public typealias DnsConnectionProxyInfoSwitch = Int

public typealias DnsConnectionProxyType = Int

public typealias DnsFreeType = Int

public typealias DnsNameFormat = Int

public fun interface DnsProxyCompletionRoutineFn {
    public operator fun invoke(completioncontext: ConstPtr<CVoid>, status: Int)
}

public typealias DnsProxyCompletionRoutine = DnsProxyCompletionRoutineFn?

public typealias DnsProxyInformationType = Int

public typealias DnsQueryOptions = UInt

public fun interface DnsQueryRawCompletionRoutineFn {
    public operator fun invoke(querycontext: ConstPtr<CVoid>, queryresults: ConstPtr<DnsQueryRawResult>)
}

public typealias DnsQueryRawCompletionRoutine = DnsQueryRawCompletionRoutineFn?

public typealias DnsSection = Int

public typealias DnsSvcbParamType = Int

public typealias DnsType = UShort

public fun interface PdnsQueryCompletionRoutineFn {
    public operator fun invoke(pquerycontext: ConstPtr<CVoid>, pqueryresults: MutPtr<DnsQueryResult>)
}

public typealias PdnsQueryCompletionRoutine = PdnsQueryCompletionRoutineFn?

public fun interface PdnsServiceBrowseCallbackFn {
    public operator fun invoke(status: UInt, pquerycontext: ConstPtr<CVoid>, pdnsrecord: ConstPtr<DnsRecordw>)
}

public typealias PdnsServiceBrowseCallback = PdnsServiceBrowseCallbackFn?

public fun interface PdnsServiceRegisterCompleteFn {
    public operator fun invoke(status: UInt, pquerycontext: ConstPtr<CVoid>, pinstance: ConstPtr<DnsServiceInstance>)
}

public typealias PdnsServiceRegisterComplete = PdnsServiceRegisterCompleteFn?

public fun interface PdnsServiceResolveCompleteFn {
    public operator fun invoke(status: UInt, pquerycontext: ConstPtr<CVoid>, pinstance: ConstPtr<DnsServiceInstance>)
}

public typealias PdnsServiceResolveComplete = PdnsServiceResolveCompleteFn?

public fun interface PmdnsQueryCallbackFn {
    public operator fun invoke(pquerycontext: ConstPtr<CVoid>, pqueryhandle: MutPtr<MdnsQueryHandle>, pqueryresults: MutPtr<DnsQueryResult>)
}

public typealias PmdnsQueryCallback = PmdnsQueryCallbackFn?
