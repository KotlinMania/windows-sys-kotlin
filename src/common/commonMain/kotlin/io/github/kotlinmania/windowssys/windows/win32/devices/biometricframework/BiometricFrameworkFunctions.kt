package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun winBioAcquireFocus(): Hresult

public expect fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult

public expect fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: COpaquePointer?, asynchronousopen: Bool, frameworkhandle: COpaquePointer?): Hresult

public expect fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: COpaquePointer?, unitcount: ULong, databaseid: COpaquePointer?, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: COpaquePointer?, asynchronousopen: Bool, sessionhandle: COpaquePointer?): Hresult

public expect fun winBioCancel(sessionhandle: UInt): Hresult

public expect fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: COpaquePointer?, sample: COpaquePointer?, samplesize: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult

public expect fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: COpaquePointer?): Hresult

public expect fun winBioCloseFramework(frameworkhandle: UInt): Hresult

public expect fun winBioCloseSession(sessionhandle: UInt): Hresult

public expect fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult

public expect fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult

public expect fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte): Hresult

public expect fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult

public expect fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: COpaquePointer?): Hresult

public expect fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: COpaquePointer?): Hresult

public expect fun winBioEnrollCommit(sessionhandle: UInt, identity: COpaquePointer?, isnewtemplate: COpaquePointer?): Hresult

public expect fun winBioEnrollDiscard(sessionhandle: UInt): Hresult

public expect fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult

public expect fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: COpaquePointer?, unitcount: COpaquePointer?): Hresult

public expect fun winBioEnumDatabases(factor: UInt, storageschemaarray: COpaquePointer?, storagecount: COpaquePointer?): Hresult

public expect fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: COpaquePointer?, subfactorarray: COpaquePointer?, subfactorcount: COpaquePointer?): Hresult

public expect fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: COpaquePointer?, bspcount: COpaquePointer?): Hresult

public expect fun winBioFree(address: COpaquePointer?): Hresult

public expect fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: COpaquePointer?): Hresult

public expect fun winBioGetDomainLogonSetting(value: COpaquePointer?, source: COpaquePointer?)

public expect fun winBioGetEnabledSetting(value: COpaquePointer?, source: COpaquePointer?)

public expect fun winBioGetEnrolledFactors(accountowner: COpaquePointer?, enrolledfactors: COpaquePointer?): Hresult

public expect fun winBioGetLogonSetting(value: COpaquePointer?, source: COpaquePointer?)

public expect fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?): Hresult

public expect fun winBioIdentify(sessionhandle: UInt, unitid: COpaquePointer?, identity: COpaquePointer?, subfactor: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult

public expect fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: COpaquePointer?): Hresult

public expect fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioImproveEnd(sessionhandle: UInt): Hresult

public expect fun winBioLocateSensor(sessionhandle: UInt, unitid: COpaquePointer?): Hresult

public expect fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: COpaquePointer?): Hresult

public expect fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult

public expect fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: COpaquePointer?, unitcount: ULong, databaseid: COpaquePointer?, sessionhandle: COpaquePointer?): Hresult

public expect fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: COpaquePointer?): Hresult

public expect fun winBioReleaseFocus(): Hresult

public expect fun winBioRemoveAllCredentials(): Hresult

public expect fun winBioRemoveAllDomainCredentials(): Hresult

public expect fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult

public expect fun winBioSetCredential(type: WinbioCredentialType, credential: COpaquePointer?, credentialsize: ULong, format: WinbioCredentialFormat): Hresult

public expect fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: ULong): Hresult

public expect fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult

public expect fun winBioVerify(sessionhandle: UInt, identity: COpaquePointer?, subfactor: UByte, unitid: COpaquePointer?, match: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult

public expect fun winBioVerifyWithCallback(sessionhandle: UInt, identity: COpaquePointer?, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: COpaquePointer?): Hresult

public expect fun winBioWait(sessionhandle: UInt): Hresult
