package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun WinBioAcquireFocus(): HRESULT

public expect fun WinBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): HRESULT

public expect fun WinBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): HRESULT

public expect fun WinBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): HRESULT

public expect fun WinBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): HRESULT

public expect fun WinBioAsyncOpenFramework(notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, frameworkhandle: Long): HRESULT

public expect fun WinBioAsyncOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, sessionhandle: Long): HRESULT

public expect fun WinBioCancel(sessionhandle: UInt): HRESULT

public expect fun WinBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): HRESULT

public expect fun WinBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PWINBIO_CAPTURE_CALLBACK, capturecallbackcontext: Long): HRESULT

public expect fun WinBioCloseFramework(frameworkhandle: UInt): HRESULT

public expect fun WinBioCloseSession(sessionhandle: UInt): HRESULT

public expect fun WinBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT

public expect fun WinBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT

public expect fun WinBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: Long, subfactor: UByte): HRESULT

public expect fun WinBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): HRESULT

public expect fun WinBioEnrollCapture(sessionhandle: UInt, rejectdetail: Long): HRESULT

public expect fun WinBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PWINBIO_ENROLL_CAPTURE_CALLBACK, enrollcallbackcontext: Long): HRESULT

public expect fun WinBioEnrollCommit(sessionhandle: UInt, identity: Long, isnewtemplate: Long): HRESULT

public expect fun WinBioEnrollDiscard(sessionhandle: UInt): HRESULT

public expect fun WinBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): HRESULT

public expect fun WinBioEnumBiometricUnits(factor: UInt, unitschemaarray: Long, unitcount: Long): HRESULT

public expect fun WinBioEnumDatabases(factor: UInt, storageschemaarray: Long, storagecount: Long): HRESULT

public expect fun WinBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: Long, subfactorarray: Long, subfactorcount: Long): HRESULT

public expect fun WinBioEnumServiceProviders(factor: UInt, bspschemaarray: Long, bspcount: Long): HRESULT

public expect fun WinBioFree(address: Long): HRESULT

public expect fun WinBioGetCredentialState(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE, credentialstate: Long): HRESULT

public expect fun WinBioGetDomainLogonSetting(value: Long, source: Long)

public expect fun WinBioGetEnabledSetting(value: Long, source: Long)

public expect fun WinBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): HRESULT

public expect fun WinBioGetLogonSetting(value: Long, source: Long)

public expect fun WinBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: Long): HRESULT

public expect fun WinBioIdentify(sessionhandle: UInt, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): HRESULT

public expect fun WinBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PWINBIO_IDENTIFY_CALLBACK, identifycallbackcontext: Long): HRESULT

public expect fun WinBioImproveBegin(sessionhandle: UInt, unitid: UInt): HRESULT

public expect fun WinBioImproveEnd(sessionhandle: UInt): HRESULT

public expect fun WinBioLocateSensor(sessionhandle: UInt, unitid: Long): HRESULT

public expect fun WinBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PWINBIO_LOCATE_SENSOR_CALLBACK, locatecallbackcontext: Long): HRESULT

public expect fun WinBioLockUnit(sessionhandle: UInt, unitid: UInt): HRESULT

public expect fun WinBioLogonIdentifiedUser(sessionhandle: UInt): HRESULT

public expect fun WinBioMonitorPresence(sessionhandle: UInt, unitid: UInt): HRESULT

public expect fun WinBioOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, sessionhandle: Long): HRESULT

public expect fun WinBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PWINBIO_EVENT_CALLBACK, eventcallbackcontext: Long): HRESULT

public expect fun WinBioReleaseFocus(): HRESULT

public expect fun WinBioRemoveAllCredentials(): HRESULT

public expect fun WinBioRemoveAllDomainCredentials(): HRESULT

public expect fun WinBioRemoveCredential(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE): HRESULT

public expect fun WinBioSetCredential(type: WINBIO_CREDENTIAL_TYPE, credential: Long, credentialsize: ULong, format: WINBIO_CREDENTIAL_FORMAT): HRESULT

public expect fun WinBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: ULong): HRESULT

public expect fun WinBioUnlockUnit(sessionhandle: UInt, unitid: UInt): HRESULT

public expect fun WinBioUnregisterEventMonitor(sessionhandle: UInt): HRESULT

public expect fun WinBioVerify(sessionhandle: UInt, identity: Long, subfactor: UByte, unitid: Long, match: Long, rejectdetail: Long): HRESULT

public expect fun WinBioVerifyWithCallback(sessionhandle: UInt, identity: Long, subfactor: UByte, verifycallback: PWINBIO_VERIFY_CALLBACK, verifycallbackcontext: Long): HRESULT

public expect fun WinBioWait(sessionhandle: UInt): HRESULT
