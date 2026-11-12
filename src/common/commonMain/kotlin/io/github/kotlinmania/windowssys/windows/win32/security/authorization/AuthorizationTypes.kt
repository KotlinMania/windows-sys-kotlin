package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.AceHeader
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes

public typealias AccessMode = Int

public typealias ActrlAccessEntryAccessFlags = UInt

public typealias AuditParamType = Int

public typealias AuthzAccessCheckFlags = UInt

public typealias AuthzAccessCheckResultsHandle = MutPtr<CVoid>

public typealias AuthzAuditEventHandle = MutPtr<CVoid>

public typealias AuthzAuditEventInformationClass = Int

public typealias AuthzAuditEventTypeHandle = MutPtr<CVoid>

public typealias AuthzCapChangeSubscriptionHandle = MutPtr<CVoid>

public typealias AuthzClientContextHandle = MutPtr<CVoid>

public typealias AuthzContextInformationClass = Int

public typealias AuthzGenerateResults = UInt

public typealias AuthzInitializeObjectAccessAuditEventFlags = UInt

public typealias AuthzResourceManagerFlags = UInt

public typealias AuthzResourceManagerHandle = MutPtr<CVoid>

public typealias AuthzSecurityAttributeFlags = UInt

public typealias AuthzSecurityAttributeOperation = Int

public typealias AuthzSecurityEventProviderHandle = MutPtr<CVoid>

public typealias AuthzSidOperation = Int

public typealias AzPropConstants = Int

public fun interface FnProgressFn {
    public operator fun invoke(pobjectname: Pcwstr, status: UInt, pinvokesetting: MutPtr<ProgInvokeSetting>, args: ConstPtr<CVoid>, securityset: Bool)
}

public typealias FnProgress = FnProgressFn?

public typealias MultipleTrusteeOperation = Int

public fun interface PfnAuthzComputeDynamicGroupsFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, args: ConstPtr<CVoid>, psidattrarray: MutPtr<MutPtr<SidAndAttributes>>, psidcount: MutPtr<UInt>, prestrictedsidattrarray: MutPtr<MutPtr<SidAndAttributes>>, prestrictedsidcount: MutPtr<UInt>): Bool
}

public typealias PfnAuthzComputeDynamicGroups = PfnAuthzComputeDynamicGroupsFn?

public fun interface PfnAuthzDynamicAccessCheckFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, pace: ConstPtr<AceHeader>, pargs: ConstPtr<CVoid>, pbaceapplicable: MutPtr<Bool>): Bool
}

public typealias PfnAuthzDynamicAccessCheck = PfnAuthzDynamicAccessCheckFn?

public fun interface PfnAuthzFreeCentralAccessPolicyFn {
    public operator fun invoke(pcentralaccesspolicy: ConstPtr<CVoid>)
}

public typealias PfnAuthzFreeCentralAccessPolicy = PfnAuthzFreeCentralAccessPolicyFn?

public fun interface PfnAuthzFreeDynamicGroupsFn {
    public operator fun invoke(psidattrarray: ConstPtr<SidAndAttributes>)
}

public typealias PfnAuthzFreeDynamicGroups = PfnAuthzFreeDynamicGroupsFn?

public fun interface PfnAuthzGetCentralAccessPolicyFn {
    public operator fun invoke(hauthzclientcontext: AuthzClientContextHandle, capid: Psid, pargs: ConstPtr<CVoid>, pcentralaccesspolicyapplicable: MutPtr<Bool>, ppcentralaccesspolicy: MutPtr<MutPtr<CVoid>>): Bool
}

public typealias PfnAuthzGetCentralAccessPolicy = PfnAuthzGetCentralAccessPolicyFn?

public typealias ProgInvokeSetting = Int

public typealias SeObjectType = Int

public typealias TreeSecInfo = UInt

public typealias TrusteeForm = Int

public typealias TrusteeType = Int
