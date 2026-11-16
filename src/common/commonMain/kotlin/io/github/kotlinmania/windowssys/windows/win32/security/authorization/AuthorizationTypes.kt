package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public typealias AccessMode = Int

public typealias ActrlAccessEntryAccessFlags = UInt

public typealias AuditParamType = Int

public typealias AuthzAccessCheckFlags = UInt

public typealias AuthzAccessCheckResultsHandle = MutPtr

public typealias AuthzAuditEventHandle = MutPtr

public typealias AuthzAuditEventInformationClass = Int

public typealias AuthzAuditEventTypeHandle = MutPtr

public typealias AuthzCapChangeSubscriptionHandle = MutPtr

public typealias AuthzClientContextHandle = MutPtr

public typealias AuthzContextInformationClass = Int

public typealias AuthzGenerateResults = UInt

public typealias AuthzInitializeObjectAccessAuditEventFlags = UInt

public typealias AuthzResourceManagerFlags = UInt

public typealias AuthzResourceManagerHandle = MutPtr

public typealias AuthzSecurityAttributeFlags = UInt

public typealias AuthzSecurityAttributeOperation = Int

public typealias AuthzSecurityEventProviderHandle = MutPtr

public typealias AuthzSidOperation = Int

public typealias AzPropConstants = Int

public fun interface FnProgressFn {
    public operator fun invoke(pobjectname: Pcwstr, status: UInt, pinvokesetting: MutPtr, args: ConstPtr, securityset: Bool)
}

public typealias FnProgress = FnProgressFn?

public typealias MultipleTrusteeOperation = Int

public fun interface PfnAuthzComputeDynamicGroupsFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, args: ConstPtr, psidattrarray: MutPtr, psidcount: MutPtr, prestrictedsidattrarray: MutPtr, prestrictedsidcount: MutPtr): Bool
}

public typealias PfnAuthzComputeDynamicGroups = PfnAuthzComputeDynamicGroupsFn?

public fun interface PfnAuthzDynamicAccessCheckFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, pace: ConstPtr, pargs: ConstPtr, pbaceapplicable: MutPtr): Bool
}

public typealias PfnAuthzDynamicAccessCheck = PfnAuthzDynamicAccessCheckFn?

public fun interface PfnAuthzFreeCentralAccessPolicyFn {
    public operator fun invoke(pcentralaccesspolicy: ConstPtr)
}

public typealias PfnAuthzFreeCentralAccessPolicy = PfnAuthzFreeCentralAccessPolicyFn?

public fun interface PfnAuthzFreeDynamicGroupsFn {
    public operator fun invoke(psidattrarray: ConstPtr)
}

public typealias PfnAuthzFreeDynamicGroups = PfnAuthzFreeDynamicGroupsFn?

public fun interface PfnAuthzGetCentralAccessPolicyFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, capid: Psid, pargs: ConstPtr, pcentralaccesspolicyapplicable: MutPtr, ppcentralaccesspolicy: MutPtr): Bool
}

public typealias PfnAuthzGetCentralAccessPolicy = PfnAuthzGetCentralAccessPolicyFn?

public typealias ProgInvokeSetting = Int

public typealias SeObjectType = Int

public typealias TreeSecInfo = UInt

public typealias TrusteeForm = Int

public typealias TrusteeType = Int
