package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun winBioAcquireFocus(): Hresult

public expect fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult

public expect fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr, asynchronousopen: Bool, frameworkhandle: MutPtr): Hresult

public expect fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr, unitcount: ULong, databaseid: ConstPtr, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr, asynchronousopen: Bool, sessionhandle: MutPtr): Hresult

public expect fun winBioCancel(sessionhandle: UInt): Hresult

public expect fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: MutPtr, sample: MutPtr, samplesize: MutPtr, rejectdetail: MutPtr): Hresult

public expect fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: ConstPtr): Hresult

public expect fun winBioCloseFramework(frameworkhandle: UInt): Hresult

public expect fun winBioCloseSession(sessionhandle: UInt): Hresult

public expect fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr, sendbuffersize: ULong, receivebuffer: MutPtr, receivebuffersize: ULong, receivedatasize: MutPtr, operationstatus: MutPtr): Hresult

public expect fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr, sendbuffersize: ULong, receivebuffer: MutPtr, receivebuffersize: ULong, receivedatasize: MutPtr, operationstatus: MutPtr): Hresult

public expect fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte): Hresult

public expect fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult

public expect fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: MutPtr): Hresult

public expect fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: ConstPtr): Hresult

public expect fun winBioEnrollCommit(sessionhandle: UInt, identity: MutPtr, isnewtemplate: MutPtr): Hresult

public expect fun winBioEnrollDiscard(sessionhandle: UInt): Hresult

public expect fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult

public expect fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: MutPtr, unitcount: MutPtr): Hresult

public expect fun winBioEnumDatabases(factor: UInt, storageschemaarray: MutPtr, storagecount: MutPtr): Hresult

public expect fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: ConstPtr, subfactorarray: MutPtr, subfactorcount: MutPtr): Hresult

public expect fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: MutPtr, bspcount: MutPtr): Hresult

public expect fun winBioFree(address: ConstPtr): Hresult

public expect fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: MutPtr): Hresult

public expect fun winBioGetDomainLogonSetting(value: MutPtr, source: MutPtr)

public expect fun winBioGetEnabledSetting(value: MutPtr, source: MutPtr)

public expect fun winBioGetEnrolledFactors(accountowner: ConstPtr, enrolledfactors: MutPtr): Hresult

public expect fun winBioGetLogonSetting(value: MutPtr, source: MutPtr)

public expect fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte, propertybuffer: MutPtr, propertybuffersize: MutPtr): Hresult

public expect fun winBioIdentify(sessionhandle: UInt, unitid: MutPtr, identity: MutPtr, subfactor: MutPtr, rejectdetail: MutPtr): Hresult

public expect fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: ConstPtr): Hresult

public expect fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioImproveEnd(sessionhandle: UInt): Hresult

public expect fun winBioLocateSensor(sessionhandle: UInt, unitid: MutPtr): Hresult

public expect fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: ConstPtr): Hresult

public expect fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult

public expect fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr, unitcount: ULong, databaseid: ConstPtr, sessionhandle: MutPtr): Hresult

public expect fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: ConstPtr): Hresult

public expect fun winBioReleaseFocus(): Hresult

public expect fun winBioRemoveAllCredentials(): Hresult

public expect fun winBioRemoveAllDomainCredentials(): Hresult

public expect fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult

public expect fun winBioSetCredential(type: WinbioCredentialType, credential: ConstPtr, credentialsize: ULong, format: WinbioCredentialFormat): Hresult

public expect fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte, propertybuffer: ConstPtr, propertybuffersize: ULong): Hresult

public expect fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult

public expect fun winBioVerify(sessionhandle: UInt, identity: ConstPtr, subfactor: UByte, unitid: MutPtr, match: MutPtr, rejectdetail: MutPtr): Hresult

public expect fun winBioVerifyWithCallback(sessionhandle: UInt, identity: ConstPtr, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: ConstPtr): Hresult

public expect fun winBioWait(sessionhandle: UInt): Hresult
