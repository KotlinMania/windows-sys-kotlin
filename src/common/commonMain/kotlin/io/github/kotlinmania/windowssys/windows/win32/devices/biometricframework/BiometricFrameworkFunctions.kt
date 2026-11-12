package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun winBioAcquireFocus(): Hresult

public expect fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult

public expect fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult

public expect fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr<CVoid>, asynchronousopen: Bool, frameworkhandle: MutPtr<UInt>): Hresult

public expect fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr<UInt>, unitcount: ULong, databaseid: ConstPtr<Guid>, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr<CVoid>, asynchronousopen: Bool, sessionhandle: MutPtr<UInt>): Hresult

public expect fun winBioCancel(sessionhandle: UInt): Hresult

public expect fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: MutPtr<UInt>, sample: MutPtr<MutPtr<WinbioBir>>, samplesize: MutPtr<ULong>, rejectdetail: MutPtr<UInt>): Hresult

public expect fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: ConstPtr<CVoid>): Hresult

public expect fun winBioCloseFramework(frameworkhandle: UInt): Hresult

public expect fun winBioCloseSession(sessionhandle: UInt): Hresult

public expect fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult

public expect fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult

public expect fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte): Hresult

public expect fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult

public expect fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: MutPtr<UInt>): Hresult

public expect fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: ConstPtr<CVoid>): Hresult

public expect fun winBioEnrollCommit(sessionhandle: UInt, identity: MutPtr<WinbioIdentity>, isnewtemplate: MutPtr<UByte>): Hresult

public expect fun winBioEnrollDiscard(sessionhandle: UInt): Hresult

public expect fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult

public expect fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: MutPtr<MutPtr<WinbioUnitSchema>>, unitcount: MutPtr<ULong>): Hresult

public expect fun winBioEnumDatabases(factor: UInt, storageschemaarray: MutPtr<MutPtr<WinbioStorageSchema>>, storagecount: MutPtr<ULong>): Hresult

public expect fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactorarray: MutPtr<MutPtr<UByte>>, subfactorcount: MutPtr<ULong>): Hresult

public expect fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: MutPtr<MutPtr<WinbioBspSchema>>, bspcount: MutPtr<ULong>): Hresult

public expect fun winBioFree(address: ConstPtr<CVoid>): Hresult

public expect fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: MutPtr<WinbioCredentialState>): Hresult

public expect fun winBioGetDomainLogonSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>)

public expect fun winBioGetEnabledSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>)

public expect fun winBioGetEnrolledFactors(accountowner: ConstPtr<WinbioIdentity>, enrolledfactors: MutPtr<UInt>): Hresult

public expect fun winBioGetLogonSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>)

public expect fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, propertybuffer: MutPtr<MutPtr<CVoid>>, propertybuffersize: MutPtr<ULong>): Hresult

public expect fun winBioIdentify(sessionhandle: UInt, unitid: MutPtr<UInt>, identity: MutPtr<WinbioIdentity>, subfactor: MutPtr<UByte>, rejectdetail: MutPtr<UInt>): Hresult

public expect fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: ConstPtr<CVoid>): Hresult

public expect fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioImproveEnd(sessionhandle: UInt): Hresult

public expect fun winBioLocateSensor(sessionhandle: UInt, unitid: MutPtr<UInt>): Hresult

public expect fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: ConstPtr<CVoid>): Hresult

public expect fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult

public expect fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr<UInt>, unitcount: ULong, databaseid: ConstPtr<Guid>, sessionhandle: MutPtr<UInt>): Hresult

public expect fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: ConstPtr<CVoid>): Hresult

public expect fun winBioReleaseFocus(): Hresult

public expect fun winBioRemoveAllCredentials(): Hresult

public expect fun winBioRemoveAllDomainCredentials(): Hresult

public expect fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult

public expect fun winBioSetCredential(type: WinbioCredentialType, credential: ConstPtr<UByte>, credentialsize: ULong, format: WinbioCredentialFormat): Hresult

public expect fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, propertybuffer: ConstPtr<CVoid>, propertybuffersize: ULong): Hresult

public expect fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult

public expect fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult

public expect fun winBioVerify(sessionhandle: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, unitid: MutPtr<UInt>, match: MutPtr<UByte>, rejectdetail: MutPtr<UInt>): Hresult

public expect fun winBioVerifyWithCallback(sessionhandle: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: ConstPtr<CVoid>): Hresult

public expect fun winBioWait(sessionhandle: UInt): Hresult
