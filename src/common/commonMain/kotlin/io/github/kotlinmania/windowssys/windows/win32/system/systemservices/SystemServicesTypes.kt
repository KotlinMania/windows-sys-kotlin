package io.github.kotlinmania.windowssys.windows.win32.system.systemservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public typealias AccessReasonType = Int

public typealias ActivationContextInfoClass = Int

public typealias AlertSystemSev = UInt

public typealias AppcommandId = UInt

public typealias Arm64FnpdataCr = Int

public typealias Arm64FnpdataFlags = Int

public typealias AtfFlags = UInt

public typealias CfeUnderline = UInt

public typealias EnlistmentInformationClass = Int

public typealias GestureconfigFlags = UInt

public typealias HiberfileBucketSize = Int

public typealias IgpId = UInt

public typealias ImageAuxSymbolType = Int

public typealias ImagePolicyEntryType = Int

public typealias ImagePolicyId = Int

public typealias ImportObjectNameType = Int

public typealias ImportObjectType = Int

public typealias KtmobjectType = Int

public typealias ModifierkeysFlags = UInt

public typealias MonitorDisplayState = Int

public fun interface PexceptionFilterFn {
    public operator fun invoke(exceptionpointers: MutPtr, establisherframe: ConstPtr): Int
}

public typealias PexceptionFilter = PexceptionFilterFn?

public fun interface PimageTlsCallbackFn {
    public operator fun invoke(dllhandle: MutPtr, reason: UInt, reserved: MutPtr)
}

public typealias PimageTlsCallback = PimageTlsCallbackFn?

public fun interface PoutOfProcessFunctionTableCallbackFn {
    public operator fun invoke(process: Handle, tableaddress: ConstPtr, entries: MutPtr, functions: MutPtr): UInt
}

public typealias PoutOfProcessFunctionTableCallback = PoutOfProcessFunctionTableCallbackFn?

public fun interface PterminationHandlerFn {
    public operator fun invoke(abnormalTermination: Boolean, establisherframe: MutPtr)
}

public typealias PterminationHandler = PterminationHandlerFn?

public fun interface PumsSchedulerEntryPointFn {
    public operator fun invoke(reason: RtlUmsSchedulerReason, activationpayload: ULong, schedulerparam: ConstPtr)
}

public typealias PumsSchedulerEntryPoint = PumsSchedulerEntryPointFn?

public typealias RecoFlags = UInt

public typealias ResourcemanagerInformationClass = Int

public typealias RtlUmsSchedulerReason = Int

public typealias ReplacesCorHdrNumericDefines = Int

public typealias ServersiloState = Int

public typealias ServiceErrorType = Int

public typealias ServiceLoadType = Int

public typealias ServiceNodeType = Int

public typealias SeImageSignatureType = Int

public typealias SfgaoFlags = UInt

public typealias StaticStyles = UInt

public typealias SharedVirtualDiskHandleState = Int

public typealias SharedVirtualDiskSupportType = Int

public typealias TapeDriveProblemType = Int

public typealias TapeGetDriveParametersFeaturesHigh = UInt

public typealias TransactionmanagerInformationClass = Int

public typealias TransactionInformationClass = Int

public typealias TransactionState = Int

public typealias WordWheelOpenFlags = UInt
