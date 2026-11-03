package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public fun interface FnCallback {
    public operator fun invoke(asyncresult: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(capturecallbackcontext: Long, operationstatus: HRESULT, unitid: UInt, sample: Long, samplesize: ULong, rejectdetail: UInt)
}

public fun interface FnCallback2 {
    public operator fun invoke(enrollcallbackcontext: Long, operationstatus: HRESULT, rejectdetail: UInt)
}

public fun interface FnCallback3 {
    public operator fun invoke(identifycallbackcontext: Long, operationstatus: HRESULT, unitid: UInt, identity: Long, subfactor: UByte, rejectdetail: UInt)
}

public fun interface FnCallback4 {
    public operator fun invoke(eventcallbackcontext: Long, operationstatus: HRESULT, event: Long)
}

public fun interface FnCallback5 {
    public operator fun invoke(verifycallbackcontext: Long, operationstatus: HRESULT, unitid: UInt, match: Boolean, rejectdetail: UInt)
}

public fun WinBioAcquireFocus(): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioAcquireFocus", longArrayOf()).toInt()
}

public fun WinBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioAsyncEnumBiometricUnits", longArrayOf(frameworkhandle.toLong(), factor.toLong())).toInt()
}

public fun WinBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioAsyncEnumDatabases", longArrayOf(frameworkhandle.toLong(), factor.toLong())).toInt()
}

public fun WinBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioAsyncEnumServiceProviders", longArrayOf(frameworkhandle.toLong(), factor.toLong())).toInt()
}

public fun WinBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioAsyncMonitorFrameworkChanges", longArrayOf(frameworkhandle.toLong(), changetypes.toLong())).toInt()
}

public fun WinBioAsyncOpenFramework(notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: Foundation.HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, frameworkhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioAsyncOpenFramework", longArrayOf(notificationmethod.toLong(), Win32DynamicFfi.objectSlot(targetwindow), messagecode.toLong(), Win32DynamicFfi.objectSlot(callbackroutine), userdata, asynchronousopen.toLong(), frameworkhandle)).toInt()
}

public fun WinBioAsyncOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: Foundation.HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, sessionhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioAsyncOpenSession", longArrayOf(factor.toLong(), pooltype.toLong(), flags.toLong(), unitarray, unitcount.toLong(), databaseid, notificationmethod.toLong(), Win32DynamicFfi.objectSlot(targetwindow), messagecode.toLong(), Win32DynamicFfi.objectSlot(callbackroutine), userdata, asynchronousopen.toLong(), sessionhandle)).toInt()
}

public fun WinBioCancel(sessionhandle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioCancel", longArrayOf(sessionhandle.toLong())).toInt()
}

public fun WinBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioCaptureSample", longArrayOf(sessionhandle.toLong(), purpose.toLong(), flags.toLong(), unitid, sample, samplesize, rejectdetail)).toInt()
}

public fun WinBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PWINBIO_CAPTURE_CALLBACK, capturecallbackcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioCaptureSampleWithCallback", longArrayOf(sessionhandle.toLong(), purpose.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(capturecallback), capturecallbackcontext)).toInt()
}

public fun WinBioCloseFramework(frameworkhandle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioCloseFramework", longArrayOf(frameworkhandle.toLong())).toInt()
}

public fun WinBioCloseSession(sessionhandle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioCloseSession", longArrayOf(sessionhandle.toLong())).toInt()
}

public fun WinBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioControlUnit", longArrayOf(sessionhandle.toLong(), unitid.toLong(), component.toLong(), controlcode.toLong(), sendbuffer, sendbuffersize.toLong(), receivebuffer, receivebuffersize.toLong(), receivedatasize, operationstatus)).toInt()
}

public fun WinBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioControlUnitPrivileged", longArrayOf(sessionhandle.toLong(), unitid.toLong(), component.toLong(), controlcode.toLong(), sendbuffer, sendbuffersize.toLong(), receivebuffer, receivebuffersize.toLong(), receivedatasize, operationstatus)).toInt()
}

public fun WinBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: Long, subfactor: UByte): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioDeleteTemplate", longArrayOf(sessionhandle.toLong(), unitid.toLong(), identity, subfactor.toLong())).toInt()
}

public fun WinBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnrollBegin", longArrayOf(sessionhandle.toLong(), subfactor.toLong(), unitid.toLong())).toInt()
}

public fun WinBioEnrollCapture(sessionhandle: UInt, rejectdetail: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnrollCapture", longArrayOf(sessionhandle.toLong(), rejectdetail)).toInt()
}

public fun WinBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PWINBIO_ENROLL_CAPTURE_CALLBACK, enrollcallbackcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnrollCaptureWithCallback", longArrayOf(sessionhandle.toLong(), Win32DynamicFfi.objectSlot(enrollcallback), enrollcallbackcontext)).toInt()
}

public fun WinBioEnrollCommit(sessionhandle: UInt, identity: Long, isnewtemplate: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnrollCommit", longArrayOf(sessionhandle.toLong(), identity, isnewtemplate)).toInt()
}

public fun WinBioEnrollDiscard(sessionhandle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnrollDiscard", longArrayOf(sessionhandle.toLong())).toInt()
}

public fun WinBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnrollSelect", longArrayOf(sessionhandle.toLong(), selectorvalue.toLong())).toInt()
}

public fun WinBioEnumBiometricUnits(factor: UInt, unitschemaarray: Long, unitcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnumBiometricUnits", longArrayOf(factor.toLong(), unitschemaarray, unitcount)).toInt()
}

public fun WinBioEnumDatabases(factor: UInt, storageschemaarray: Long, storagecount: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnumDatabases", longArrayOf(factor.toLong(), storageschemaarray, storagecount)).toInt()
}

public fun WinBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: Long, subfactorarray: Long, subfactorcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnumEnrollments", longArrayOf(sessionhandle.toLong(), unitid.toLong(), identity, subfactorarray, subfactorcount)).toInt()
}

public fun WinBioEnumServiceProviders(factor: UInt, bspschemaarray: Long, bspcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioEnumServiceProviders", longArrayOf(factor.toLong(), bspschemaarray, bspcount)).toInt()
}

public fun WinBioFree(address: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioFree", longArrayOf(address)).toInt()
}

public fun WinBioGetCredentialState(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE, credentialstate: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioGetCredentialState", longArrayOf(Win32DynamicFfi.objectSlot(identity), type.toLong(), credentialstate)).toInt()
}

public fun WinBioGetDomainLogonSetting(value: Long, source: Long) {
    Win32DynamicFfi.invoke("winbio.dll", "WinBioGetDomainLogonSetting", longArrayOf(value, source))
}

public fun WinBioGetEnabledSetting(value: Long, source: Long) {
    Win32DynamicFfi.invoke("winbio.dll", "WinBioGetEnabledSetting", longArrayOf(value, source))
}

public fun WinBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioGetEnrolledFactors", longArrayOf(accountowner, enrolledfactors)).toInt()
}

public fun WinBioGetLogonSetting(value: Long, source: Long) {
    Win32DynamicFfi.invoke("winbio.dll", "WinBioGetLogonSetting", longArrayOf(value, source))
}

public fun WinBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioGetProperty", longArrayOf(sessionhandle.toLong(), propertytype.toLong(), propertyid.toLong(), unitid.toLong(), identity, subfactor.toLong(), propertybuffer, propertybuffersize)).toInt()
}

public fun WinBioIdentify(sessionhandle: UInt, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioIdentify", longArrayOf(sessionhandle.toLong(), unitid, identity, subfactor, rejectdetail)).toInt()
}

public fun WinBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PWINBIO_IDENTIFY_CALLBACK, identifycallbackcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioIdentifyWithCallback", longArrayOf(sessionhandle.toLong(), Win32DynamicFfi.objectSlot(identifycallback), identifycallbackcontext)).toInt()
}

public fun WinBioImproveBegin(sessionhandle: UInt, unitid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioImproveBegin", longArrayOf(sessionhandle.toLong(), unitid.toLong())).toInt()
}

public fun WinBioImproveEnd(sessionhandle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioImproveEnd", longArrayOf(sessionhandle.toLong())).toInt()
}

public fun WinBioLocateSensor(sessionhandle: UInt, unitid: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioLocateSensor", longArrayOf(sessionhandle.toLong(), unitid)).toInt()
}

public fun WinBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PWINBIO_LOCATE_SENSOR_CALLBACK, locatecallbackcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioLocateSensorWithCallback", longArrayOf(sessionhandle.toLong(), Win32DynamicFfi.objectSlot(locatecallback), locatecallbackcontext)).toInt()
}

public fun WinBioLockUnit(sessionhandle: UInt, unitid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioLockUnit", longArrayOf(sessionhandle.toLong(), unitid.toLong())).toInt()
}

public fun WinBioLogonIdentifiedUser(sessionhandle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioLogonIdentifiedUser", longArrayOf(sessionhandle.toLong())).toInt()
}

public fun WinBioMonitorPresence(sessionhandle: UInt, unitid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioMonitorPresence", longArrayOf(sessionhandle.toLong(), unitid.toLong())).toInt()
}

public fun WinBioOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, sessionhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioOpenSession", longArrayOf(factor.toLong(), pooltype.toLong(), flags.toLong(), unitarray, unitcount.toLong(), databaseid, sessionhandle)).toInt()
}

public fun WinBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PWINBIO_EVENT_CALLBACK, eventcallbackcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioRegisterEventMonitor", longArrayOf(sessionhandle.toLong(), eventmask.toLong(), Win32DynamicFfi.objectSlot(eventcallback), eventcallbackcontext)).toInt()
}

public fun WinBioReleaseFocus(): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioReleaseFocus", longArrayOf()).toInt()
}

public fun WinBioRemoveAllCredentials(): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioRemoveAllCredentials", longArrayOf()).toInt()
}

public fun WinBioRemoveAllDomainCredentials(): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioRemoveAllDomainCredentials", longArrayOf()).toInt()
}

public fun WinBioRemoveCredential(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioRemoveCredential", longArrayOf(Win32DynamicFfi.objectSlot(identity), type.toLong())).toInt()
}

public fun WinBioSetCredential(type: WINBIO_CREDENTIAL_TYPE, credential: Long, credentialsize: ULong, format: WINBIO_CREDENTIAL_FORMAT): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioSetCredential", longArrayOf(type.toLong(), credential, credentialsize.toLong(), format.toLong())).toInt()
}

public fun WinBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: ULong): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioSetProperty", longArrayOf(sessionhandle.toLong(), propertytype.toLong(), propertyid.toLong(), unitid.toLong(), identity, subfactor.toLong(), propertybuffer, propertybuffersize.toLong())).toInt()
}

public fun WinBioUnlockUnit(sessionhandle: UInt, unitid: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioUnlockUnit", longArrayOf(sessionhandle.toLong(), unitid.toLong())).toInt()
}

public fun WinBioUnregisterEventMonitor(sessionhandle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioUnregisterEventMonitor", longArrayOf(sessionhandle.toLong())).toInt()
}

public fun WinBioVerify(sessionhandle: UInt, identity: Long, subfactor: UByte, unitid: Long, match: Long, rejectdetail: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioVerify", longArrayOf(sessionhandle.toLong(), identity, subfactor.toLong(), unitid, match, rejectdetail)).toInt()
}

public fun WinBioVerifyWithCallback(sessionhandle: UInt, identity: Long, subfactor: UByte, verifycallback: PWINBIO_VERIFY_CALLBACK, verifycallbackcontext: Long): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioVerifyWithCallback", longArrayOf(sessionhandle.toLong(), identity, subfactor.toLong(), Win32DynamicFfi.objectSlot(verifycallback), verifycallbackcontext)).toInt()
}

public fun WinBioWait(sessionhandle: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winbio.dll", "WinBioWait", longArrayOf(sessionhandle.toLong())).toInt()
}
