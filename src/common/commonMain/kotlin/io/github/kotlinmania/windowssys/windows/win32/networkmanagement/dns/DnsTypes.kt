package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

public typealias DNS_CHARSET = Int

public typealias DNS_CONFIG_TYPE = Int

public typealias DNS_CONNECTION_POLICY_TAG = Int

public typealias DNS_CONNECTION_PROXY_INFO_SWITCH = Int

public typealias DNS_CONNECTION_PROXY_TYPE = Int

public typealias DNS_FREE_TYPE = Int

public typealias DNS_NAME_FORMAT = Int

public fun interface DNS_PROXY_COMPLETION_ROUTINEFn {
    public operator fun invoke(completioncontext: Long, status: Int)
}

public typealias DNS_PROXY_COMPLETION_ROUTINE = DNS_PROXY_COMPLETION_ROUTINEFn?

public typealias DNS_PROXY_INFORMATION_TYPE = Int

public typealias DNS_QUERY_OPTIONS = UInt

public fun interface DNS_QUERY_RAW_COMPLETION_ROUTINEFn {
    public operator fun invoke(querycontext: Long, queryresults: Long)
}

public typealias DNS_QUERY_RAW_COMPLETION_ROUTINE = DNS_QUERY_RAW_COMPLETION_ROUTINEFn?

public typealias DNS_SECTION = Int

public typealias DNS_SVCB_PARAM_TYPE = Int

public typealias DNS_TYPE = UShort

public fun interface PDNS_QUERY_COMPLETION_ROUTINEFn {
    public operator fun invoke(pquerycontext: Long, pqueryresults: Long)
}

public typealias PDNS_QUERY_COMPLETION_ROUTINE = PDNS_QUERY_COMPLETION_ROUTINEFn?

public fun interface PDNS_SERVICE_BROWSE_CALLBACKFn {
    public operator fun invoke(status: UInt, pquerycontext: Long, pdnsrecord: Long)
}

public typealias PDNS_SERVICE_BROWSE_CALLBACK = PDNS_SERVICE_BROWSE_CALLBACKFn?

public fun interface PDNS_SERVICE_REGISTER_COMPLETEFn {
    public operator fun invoke(status: UInt, pquerycontext: Long, pinstance: Long)
}

public typealias PDNS_SERVICE_REGISTER_COMPLETE = PDNS_SERVICE_REGISTER_COMPLETEFn?

public fun interface PDNS_SERVICE_RESOLVE_COMPLETEFn {
    public operator fun invoke(status: UInt, pquerycontext: Long, pinstance: Long)
}

public typealias PDNS_SERVICE_RESOLVE_COMPLETE = PDNS_SERVICE_RESOLVE_COMPLETEFn?

public fun interface PMDNS_QUERY_CALLBACKFn {
    public operator fun invoke(pquerycontext: Long, pqueryhandle: Long, pqueryresults: Long)
}

public typealias PMDNS_QUERY_CALLBACK = PMDNS_QUERY_CALLBACKFn?
