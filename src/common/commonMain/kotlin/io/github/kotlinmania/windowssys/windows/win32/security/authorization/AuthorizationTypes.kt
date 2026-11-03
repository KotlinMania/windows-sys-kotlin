package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public typealias ACCESS_MODE = Int

public typealias ACTRL_ACCESS_ENTRY_ACCESS_FLAGS = UInt

public typealias AUDIT_PARAM_TYPE = Int

public typealias AUTHZ_ACCESS_CHECK_FLAGS = UInt

public typealias AUTHZ_ACCESS_CHECK_RESULTS_HANDLE = Long

public typealias AUTHZ_AUDIT_EVENT_HANDLE = Long

public typealias AUTHZ_AUDIT_EVENT_INFORMATION_CLASS = Int

public typealias AUTHZ_AUDIT_EVENT_TYPE_HANDLE = Long

public typealias AUTHZ_CAP_CHANGE_SUBSCRIPTION_HANDLE = Long

public typealias AUTHZ_CLIENT_CONTEXT_HANDLE = Long

public typealias AUTHZ_CONTEXT_INFORMATION_CLASS = Int

public typealias AUTHZ_GENERATE_RESULTS = UInt

public typealias AUTHZ_INITIALIZE_OBJECT_ACCESS_AUDIT_EVENT_FLAGS = UInt

public typealias AUTHZ_RESOURCE_MANAGER_FLAGS = UInt

public typealias AUTHZ_RESOURCE_MANAGER_HANDLE = Long

public typealias AUTHZ_SECURITY_ATTRIBUTE_FLAGS = UInt

public typealias AUTHZ_SECURITY_ATTRIBUTE_OPERATION = Int

public typealias AUTHZ_SECURITY_EVENT_PROVIDER_HANDLE = Long

public typealias AUTHZ_SID_OPERATION = Int

public typealias AZ_PROP_CONSTANTS = Int

public fun interface FN_PROGRESSFn {
    public operator fun invoke(pobjectname: PCWSTR, status: UInt, pinvokesetting: Long, args: Long, securityset: BOOL)
}

public typealias FN_PROGRESS = FN_PROGRESSFn?

public typealias MULTIPLE_TRUSTEE_OPERATION = Int

public fun interface PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPSFn {
    public operator fun invoke(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, args: Long, psidattrarray: Long, psidcount: Long, prestrictedsidattrarray: Long, prestrictedsidcount: Long): BOOL
}

public typealias PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPS = PFN_AUTHZ_COMPUTE_DYNAMIC_GROUPSFn?

public fun interface PFN_AUTHZ_DYNAMIC_ACCESS_CHECKFn {
    public operator fun invoke(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, pace: Long, pargs: Long, pbaceapplicable: Long): BOOL
}

public typealias PFN_AUTHZ_DYNAMIC_ACCESS_CHECK = PFN_AUTHZ_DYNAMIC_ACCESS_CHECKFn?

public fun interface PFN_AUTHZ_FREE_CENTRAL_ACCESS_POLICYFn {
    public operator fun invoke(pcentralaccesspolicy: Long)
}

public typealias PFN_AUTHZ_FREE_CENTRAL_ACCESS_POLICY = PFN_AUTHZ_FREE_CENTRAL_ACCESS_POLICYFn?

public fun interface PFN_AUTHZ_FREE_DYNAMIC_GROUPSFn {
    public operator fun invoke(psidattrarray: Long)
}

public typealias PFN_AUTHZ_FREE_DYNAMIC_GROUPS = PFN_AUTHZ_FREE_DYNAMIC_GROUPSFn?

public fun interface PFN_AUTHZ_GET_CENTRAL_ACCESS_POLICYFn {
    public operator fun invoke(hauthzclientcontext: AUTHZ_CLIENT_CONTEXT_HANDLE, capid: PSID, pargs: Long, pcentralaccesspolicyapplicable: Long, ppcentralaccesspolicy: Long): BOOL
}

public typealias PFN_AUTHZ_GET_CENTRAL_ACCESS_POLICY = PFN_AUTHZ_GET_CENTRAL_ACCESS_POLICYFn?

public typealias PROG_INVOKE_SETTING = Int

public typealias SE_OBJECT_TYPE = Int

public typealias TREE_SEC_INFO = UInt

public typealias TRUSTEE_FORM = Int

public typealias TRUSTEE_TYPE = Int
