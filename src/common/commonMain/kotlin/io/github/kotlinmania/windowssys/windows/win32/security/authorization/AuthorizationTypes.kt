package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public typealias AccessMode = Int

public typealias ActrlAccessEntryAccessFlags = UInt

public typealias AuditParamType = Int

public typealias AuthzAccessCheckFlags = UInt

public typealias AuthzAccessCheckResultsHandle = COpaquePointer?

public typealias AuthzAuditEventHandle = COpaquePointer?

public typealias AuthzAuditEventInformationClass = Int

public typealias AuthzAuditEventTypeHandle = COpaquePointer?

public typealias AuthzCapChangeSubscriptionHandle = COpaquePointer?

public typealias AuthzClientContextHandle = COpaquePointer?

public typealias AuthzContextInformationClass = Int

public typealias AuthzGenerateResults = UInt

public typealias AuthzInitializeObjectAccessAuditEventFlags = UInt

public typealias AuthzResourceManagerFlags = UInt

public typealias AuthzResourceManagerHandle = COpaquePointer?

public typealias AuthzSecurityAttributeFlags = UInt

public typealias AuthzSecurityAttributeOperation = Int

public typealias AuthzSecurityEventProviderHandle = COpaquePointer?

public typealias AuthzSidOperation = Int

public typealias AzPropConstants = Int

public fun interface FnProgressFn {
    public operator fun invoke(pobjectname: Pcwstr, status: UInt, pinvokesetting: COpaquePointer?, args: COpaquePointer?, securityset: Bool)
}

public typealias FnProgress = FnProgressFn?

public typealias MultipleTrusteeOperation = Int

public fun interface PfnAuthzComputeDynamicGroupsFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, args: COpaquePointer?, psidattrarray: COpaquePointer?, psidcount: COpaquePointer?, prestrictedsidattrarray: COpaquePointer?, prestrictedsidcount: COpaquePointer?): Bool
}

public typealias PfnAuthzComputeDynamicGroups = PfnAuthzComputeDynamicGroupsFn?

public fun interface PfnAuthzDynamicAccessCheckFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, pace: COpaquePointer?, pargs: COpaquePointer?, pbaceapplicable: COpaquePointer?): Bool
}

public typealias PfnAuthzDynamicAccessCheck = PfnAuthzDynamicAccessCheckFn?

public fun interface PfnAuthzFreeCentralAccessPolicyFn {
    public operator fun invoke(pcentralaccesspolicy: COpaquePointer?)
}

public typealias PfnAuthzFreeCentralAccessPolicy = PfnAuthzFreeCentralAccessPolicyFn?

public fun interface PfnAuthzFreeDynamicGroupsFn {
    public operator fun invoke(psidattrarray: COpaquePointer?)
}

public typealias PfnAuthzFreeDynamicGroups = PfnAuthzFreeDynamicGroupsFn?

public fun interface PfnAuthzGetCentralAccessPolicyFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, capid: Psid, pargs: COpaquePointer?, pcentralaccesspolicyapplicable: COpaquePointer?, ppcentralaccesspolicy: COpaquePointer?): Bool
}

public typealias PfnAuthzGetCentralAccessPolicy = PfnAuthzGetCentralAccessPolicyFn?

public typealias ProgInvokeSetting = Int

public typealias SeObjectType = Int

public typealias TreeSecInfo = UInt

public typealias TrusteeForm = Int

public typealias TrusteeType = Int
