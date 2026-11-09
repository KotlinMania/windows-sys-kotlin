@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun WinBioAcquireFocus(): HRESULT =
    0

public actual fun WinBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): HRESULT =
    0

public actual fun WinBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): HRESULT =
    0

public actual fun WinBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): HRESULT =
    0

public actual fun WinBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): HRESULT =
    0

public actual fun WinBioAsyncOpenFramework(notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, frameworkhandle: Long): HRESULT =
    0

public actual fun WinBioAsyncOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, sessionhandle: Long): HRESULT =
    0

public actual fun WinBioCancel(sessionhandle: UInt): HRESULT =
    0

public actual fun WinBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): HRESULT =
    0

public actual fun WinBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PWINBIO_CAPTURE_CALLBACK, capturecallbackcontext: Long): HRESULT =
    0

public actual fun WinBioCloseFramework(frameworkhandle: UInt): HRESULT =
    0

public actual fun WinBioCloseSession(sessionhandle: UInt): HRESULT =
    0

public actual fun WinBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT =
    0

public actual fun WinBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT =
    0

public actual fun WinBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: Long, subfactor: UByte): HRESULT =
    0

public actual fun WinBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): HRESULT =
    0

public actual fun WinBioEnrollCapture(sessionhandle: UInt, rejectdetail: Long): HRESULT =
    0

public actual fun WinBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PWINBIO_ENROLL_CAPTURE_CALLBACK, enrollcallbackcontext: Long): HRESULT =
    0

public actual fun WinBioEnrollCommit(sessionhandle: UInt, identity: Long, isnewtemplate: Long): HRESULT =
    0

public actual fun WinBioEnrollDiscard(sessionhandle: UInt): HRESULT =
    0

public actual fun WinBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): HRESULT =
    0

public actual fun WinBioEnumBiometricUnits(factor: UInt, unitschemaarray: Long, unitcount: Long): HRESULT =
    0

public actual fun WinBioEnumDatabases(factor: UInt, storageschemaarray: Long, storagecount: Long): HRESULT =
    0

public actual fun WinBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: Long, subfactorarray: Long, subfactorcount: Long): HRESULT =
    0

public actual fun WinBioEnumServiceProviders(factor: UInt, bspschemaarray: Long, bspcount: Long): HRESULT =
    0

public actual fun WinBioFree(address: Long): HRESULT =
    0

public actual fun WinBioGetCredentialState(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE, credentialstate: Long): HRESULT =
    0

public actual fun WinBioGetDomainLogonSetting(value: Long, source: Long) {
}

public actual fun WinBioGetEnabledSetting(value: Long, source: Long) {
}

public actual fun WinBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): HRESULT =
    0

public actual fun WinBioGetLogonSetting(value: Long, source: Long) {
}

public actual fun WinBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: Long): HRESULT =
    0

public actual fun WinBioIdentify(sessionhandle: UInt, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): HRESULT =
    0

public actual fun WinBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PWINBIO_IDENTIFY_CALLBACK, identifycallbackcontext: Long): HRESULT =
    0

public actual fun WinBioImproveBegin(sessionhandle: UInt, unitid: UInt): HRESULT =
    0

public actual fun WinBioImproveEnd(sessionhandle: UInt): HRESULT =
    0

public actual fun WinBioLocateSensor(sessionhandle: UInt, unitid: Long): HRESULT =
    0

public actual fun WinBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PWINBIO_LOCATE_SENSOR_CALLBACK, locatecallbackcontext: Long): HRESULT =
    0

public actual fun WinBioLockUnit(sessionhandle: UInt, unitid: UInt): HRESULT =
    0

public actual fun WinBioLogonIdentifiedUser(sessionhandle: UInt): HRESULT =
    0

public actual fun WinBioMonitorPresence(sessionhandle: UInt, unitid: UInt): HRESULT =
    0

public actual fun WinBioOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, sessionhandle: Long): HRESULT =
    0

public actual fun WinBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PWINBIO_EVENT_CALLBACK, eventcallbackcontext: Long): HRESULT =
    0

public actual fun WinBioReleaseFocus(): HRESULT =
    0

public actual fun WinBioRemoveAllCredentials(): HRESULT =
    0

public actual fun WinBioRemoveAllDomainCredentials(): HRESULT =
    0

public actual fun WinBioRemoveCredential(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE): HRESULT =
    0

public actual fun WinBioSetCredential(type: WINBIO_CREDENTIAL_TYPE, credential: Long, credentialsize: ULong, format: WINBIO_CREDENTIAL_FORMAT): HRESULT =
    0

public actual fun WinBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: ULong): HRESULT =
    0

public actual fun WinBioUnlockUnit(sessionhandle: UInt, unitid: UInt): HRESULT =
    0

public actual fun WinBioUnregisterEventMonitor(sessionhandle: UInt): HRESULT =
    0

public actual fun WinBioVerify(sessionhandle: UInt, identity: Long, subfactor: UByte, unitid: Long, match: Long, rejectdetail: Long): HRESULT =
    0

public actual fun WinBioVerifyWithCallback(sessionhandle: UInt, identity: Long, subfactor: UByte, verifycallback: PWINBIO_VERIFY_CALLBACK, verifycallbackcontext: Long): HRESULT =
    0

public actual fun WinBioWait(sessionhandle: UInt): HRESULT =
    0
