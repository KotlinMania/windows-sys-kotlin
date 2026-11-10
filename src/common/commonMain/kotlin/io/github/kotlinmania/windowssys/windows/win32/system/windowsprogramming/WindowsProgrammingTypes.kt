package io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

public fun interface ApplicationRecoveryCallbackFn {
    public operator fun invoke(pvparameter: COpaquePointer?): UInt
}

public typealias ApplicationRecoveryCallback = ApplicationRecoveryCallbackFn?

public typealias DecisionLocation = Int

public fun interface EnumCallbackFn {
    public operator fun invoke(lpsurfaceinfo: COpaquePointer?, lpcontext: COpaquePointer?)
}

public typealias EnumCallback = EnumCallbackFn?

public typealias FeatureChangeTime = Int

public typealias FeatureEnabledState = Int

public typealias FeatureStateChangeSubscription = COpaquePointer?

public typealias Hwinwatch = COpaquePointer?

public fun interface PdelayloadFailureDllCallbackFn {
    public operator fun invoke(notificationreason: UInt, delayloadinfo: COpaquePointer?): COpaquePointer?
}

public typealias PdelayloadFailureDllCallback = PdelayloadFailureDllCallbackFn?

public fun interface PfeatureStateChangeCallbackFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias PfeatureStateChangeCallback = PfeatureStateChangeCallbackFn?

public fun interface PfiberCalloutRoutineFn {
    public operator fun invoke(lpparameter: COpaquePointer?): COpaquePointer?
}

public typealias PfiberCalloutRoutine = PfiberCalloutRoutineFn?

public fun interface PqueryactctxwFuncFn {
    public operator fun invoke(dwflags: UInt, hactctx: Handle, pvsubinstance: COpaquePointer?, ulinfoclass: UInt, pvbuffer: COpaquePointer?, cbbuffer: ULong, pcbwrittenorrequired: COpaquePointer?): Bool
}

public typealias PqueryactctxwFunc = PqueryactctxwFuncFn?

public fun interface PwinstationqueryinformationwFn {
    public operator fun invoke(param0: Handle, param1: UInt, param2: Winstationinfoclass, param3: COpaquePointer?, param4: UInt, param5: COpaquePointer?): Boolean
}

public typealias Pwinstationqueryinformationw = PwinstationqueryinformationwFn?

public fun interface PwldpCanexecutebufferApiFn {
    public operator fun invoke(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, buffer: COpaquePointer?, buffersize: UInt, auditinfo: Pcwstr, result: COpaquePointer?): Hresult
}

public typealias PwldpCanexecutebufferApi = PwldpCanexecutebufferApiFn?

public fun interface PwldpCanexecutefileApiFn {
    public operator fun invoke(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, filehandle: Handle, auditinfo: Pcwstr, result: COpaquePointer?): Hresult
}

public typealias PwldpCanexecutefileApi = PwldpCanexecutefileApiFn?

public fun interface PwldpCanexecutestreamApiFn {
    public operator fun invoke(host: COpaquePointer?, options: WldpExecutionEvaluationOptions, stream: COpaquePointer?, auditinfo: Pcwstr, result: COpaquePointer?): Hresult
}

public typealias PwldpCanexecutestreamApi = PwldpCanexecutestreamApiFn?

public fun interface PwldpIsappapprovedbypolicyApiFn {
    public operator fun invoke(packagefamilyname: Pcwstr, packageversion: ULong): Hresult
}

public typealias PwldpIsappapprovedbypolicyApi = PwldpIsappapprovedbypolicyApiFn?

public fun interface PwldpIsdynamiccodepolicyenabledApiFn {
    public operator fun invoke(pbenabled: COpaquePointer?): Hresult
}

public typealias PwldpIsdynamiccodepolicyenabledApi = PwldpIsdynamiccodepolicyenabledApiFn?

public fun interface PwldpIsproductionconfigurationApiFn {
    public operator fun invoke(isproductionconfiguration: COpaquePointer?): Hresult
}

public typealias PwldpIsproductionconfigurationApi = PwldpIsproductionconfigurationApiFn?

public fun interface PwldpIswcosproductionconfigurationApiFn {
    public operator fun invoke(isproductionconfiguration: COpaquePointer?): Hresult
}

public typealias PwldpIswcosproductionconfigurationApi = PwldpIswcosproductionconfigurationApiFn?

public fun interface PwldpQuerydevicesecurityinformationApiFn {
    public operator fun invoke(information: COpaquePointer?, informationlength: UInt, returnlength: COpaquePointer?): Hresult
}

public typealias PwldpQuerydevicesecurityinformationApi = PwldpQuerydevicesecurityinformationApiFn?

public fun interface PwldpQuerydynamicodetrustApiFn {
    public operator fun invoke(filehandle: Handle, baseimage: COpaquePointer?, imagesize: UInt): Hresult
}

public typealias PwldpQuerydynamicodetrustApi = PwldpQuerydynamicodetrustApiFn?

public fun interface PwldpQuerypolicysettingenabled2ApiFn {
    public operator fun invoke(setting: Pcwstr, enabled: COpaquePointer?): Hresult
}

public typealias PwldpQuerypolicysettingenabled2Api = PwldpQuerypolicysettingenabled2ApiFn?

public fun interface PwldpQuerypolicysettingenabledApiFn {
    public operator fun invoke(setting: WldpPolicySetting, enabled: COpaquePointer?): Hresult
}

public typealias PwldpQuerypolicysettingenabledApi = PwldpQuerypolicysettingenabledApiFn?

public fun interface PwldpQuerywindowslockdownmodeApiFn {
    public operator fun invoke(lockdownmode: COpaquePointer?): Hresult
}

public typealias PwldpQuerywindowslockdownmodeApi = PwldpQuerywindowslockdownmodeApiFn?

public fun interface PwldpQuerywindowslockdownrestrictionApiFn {
    public operator fun invoke(lockdownrestriction: COpaquePointer?): Hresult
}

public typealias PwldpQuerywindowslockdownrestrictionApi = PwldpQuerywindowslockdownrestrictionApiFn?

public fun interface PwldpResetproductionconfigurationApiFn {
    public operator fun invoke(): Hresult
}

public typealias PwldpResetproductionconfigurationApi = PwldpResetproductionconfigurationApiFn?

public fun interface PwldpResetwcosproductionconfigurationApiFn {
    public operator fun invoke(): Hresult
}

public typealias PwldpResetwcosproductionconfigurationApi = PwldpResetwcosproductionconfigurationApiFn?

public fun interface PwldpSetdynamiccodetrustApiFn {
    public operator fun invoke(hfilehandle: Handle): Hresult
}

public typealias PwldpSetdynamiccodetrustApi = PwldpSetdynamiccodetrustApiFn?

public fun interface PwldpSetwindowslockdownrestrictionApiFn {
    public operator fun invoke(lockdownrestriction: WldpWindowsLockdownRestriction): Hresult
}

public typealias PwldpSetwindowslockdownrestrictionApi = PwldpSetwindowslockdownrestrictionApiFn?

public fun interface ReginstallaFn {
    public operator fun invoke(hm: Hmodule, pszsection: Pcstr, psttable: COpaquePointer?): Hresult
}

public typealias Reginstalla = ReginstallaFn?

public typealias TdientityEntityType = UInt

public typealias TdiTlIoControlType = Int

public typealias Valuename = Int

public typealias Winstationinfoclass = Int

public fun interface WinwatchnotifyprocFn {
    public operator fun invoke(hww: Hwinwatch, hwnd: Hwnd, code: UInt, lparam: Lparam)
}

public typealias Winwatchnotifyproc = WinwatchnotifyprocFn?

public typealias WldpExecutionEvaluationOptions = Int

public typealias WldpExecutionPolicy = Int

public typealias WldpHost = Int

public typealias WldpHostId = Int

public typealias WldpKey = Int

public typealias WldpPolicySetting = Int

public typealias WldpWindowsLockdownMode = Int

public typealias WldpWindowsLockdownRestriction = Int
