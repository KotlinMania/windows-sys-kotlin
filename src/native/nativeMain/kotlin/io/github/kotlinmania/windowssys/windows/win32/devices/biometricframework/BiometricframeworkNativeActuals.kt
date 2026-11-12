@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioCancel
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioFree
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioVerify
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssysWindowsWin32DevicesBiometricframeworkWinBioWait
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun winBioAcquireFocus(): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus()

public actual fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(frameworkhandle, factor)

public actual fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(frameworkhandle, factor)

public actual fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(frameworkhandle, factor)

public actual fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(frameworkhandle, changetypes)

public actual fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr<CVoid>, asynchronousopen: Bool, frameworkhandle: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework(notificationmethod, targetwindow.rawAddress.toCPointer<ByteVar>(), messagecode, 0L.toCPointer<ByteVar>(), userdata.rawAddress.toCPointer<ByteVar>(), asynchronousopen, frameworkhandle.rawAddress.toCPointer<ByteVar>())

public actual fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr<UInt>, unitcount: ULong, databaseid: ConstPtr<Guid>, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr<CVoid>, asynchronousopen: Bool, sessionhandle: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession(factor, pooltype, flags, unitarray.rawAddress.toCPointer<ByteVar>(), unitcount, databaseid.rawAddress.toCPointer<ByteVar>(), notificationmethod, targetwindow.rawAddress.toCPointer<ByteVar>(), messagecode, 0L.toCPointer<ByteVar>(), userdata.rawAddress.toCPointer<ByteVar>(), asynchronousopen, sessionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun winBioCancel(sessionhandle: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(sessionhandle)

public actual fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: MutPtr<UInt>, sample: MutPtr<MutPtr<WinbioBir>>, samplesize: MutPtr<ULong>, rejectdetail: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample(sessionhandle, purpose, flags, unitid.rawAddress.toCPointer<ByteVar>(), sample.rawAddress.toCPointer<ByteVar>(), samplesize.rawAddress.toCPointer<ByteVar>(), rejectdetail.rawAddress.toCPointer<ByteVar>())

public actual fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback(sessionhandle, purpose, flags, 0L.toCPointer<ByteVar>(), capturecallbackcontext.rawAddress.toCPointer<ByteVar>())

public actual fun winBioCloseFramework(frameworkhandle: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(frameworkhandle)

public actual fun winBioCloseSession(sessionhandle: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(sessionhandle)

public actual fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit(sessionhandle, unitid, component, controlcode, sendbuffer.rawAddress.toCPointer<ByteVar>(), sendbuffersize, receivebuffer.rawAddress.toCPointer<ByteVar>(), receivebuffersize, receivedatasize.rawAddress.toCPointer<ByteVar>(), operationstatus.rawAddress.toCPointer<ByteVar>())

public actual fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged(sessionhandle, unitid, component, controlcode, sendbuffer.rawAddress.toCPointer<ByteVar>(), sendbuffersize, receivebuffer.rawAddress.toCPointer<ByteVar>(), receivebuffersize, receivedatasize.rawAddress.toCPointer<ByteVar>(), operationstatus.rawAddress.toCPointer<ByteVar>())

public actual fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate(sessionhandle, unitid, identity.rawAddress.toCPointer<ByteVar>(), subfactor)

public actual fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(sessionhandle, subfactor, unitid)

public actual fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture(sessionhandle, rejectdetail.rawAddress.toCPointer<ByteVar>())

public actual fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback(sessionhandle, 0L.toCPointer<ByteVar>(), enrollcallbackcontext.rawAddress.toCPointer<ByteVar>())

public actual fun winBioEnrollCommit(sessionhandle: UInt, identity: MutPtr<WinbioIdentity>, isnewtemplate: MutPtr<UByte>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit(sessionhandle, identity.rawAddress.toCPointer<ByteVar>(), isnewtemplate.rawAddress.toCPointer<ByteVar>())

public actual fun winBioEnrollDiscard(sessionhandle: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(sessionhandle)

public actual fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(sessionhandle, selectorvalue)

public actual fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: MutPtr<MutPtr<WinbioUnitSchema>>, unitcount: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits(factor, unitschemaarray.rawAddress.toCPointer<ByteVar>(), unitcount.rawAddress.toCPointer<ByteVar>())

public actual fun winBioEnumDatabases(factor: UInt, storageschemaarray: MutPtr<MutPtr<WinbioStorageSchema>>, storagecount: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases(factor, storageschemaarray.rawAddress.toCPointer<ByteVar>(), storagecount.rawAddress.toCPointer<ByteVar>())

public actual fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactorarray: MutPtr<MutPtr<UByte>>, subfactorcount: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments(sessionhandle, unitid, identity.rawAddress.toCPointer<ByteVar>(), subfactorarray.rawAddress.toCPointer<ByteVar>(), subfactorcount.rawAddress.toCPointer<ByteVar>())

public actual fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: MutPtr<MutPtr<WinbioBspSchema>>, bspcount: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders(factor, bspschemaarray.rawAddress.toCPointer<ByteVar>(), bspcount.rawAddress.toCPointer<ByteVar>())

public actual fun winBioFree(address: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioFree(address.rawAddress.toCPointer<ByteVar>())

public actual fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: MutPtr<WinbioCredentialState>): Hresult =
    0

public actual fun winBioGetDomainLogonSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>) {
    windowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting(value.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>())
}

public actual fun winBioGetEnabledSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>) {
    windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting(value.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>())
}

public actual fun winBioGetEnrolledFactors(accountowner: ConstPtr<WinbioIdentity>, enrolledfactors: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors(accountowner.rawAddress.toCPointer<ByteVar>(), enrolledfactors.rawAddress.toCPointer<ByteVar>())

public actual fun winBioGetLogonSetting(value: MutPtr<UByte>, source: MutPtr<WinbioSettingSource>) {
    windowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting(value.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>())
}

public actual fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, propertybuffer: MutPtr<MutPtr<CVoid>>, propertybuffersize: MutPtr<ULong>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty(sessionhandle, propertytype, propertyid, unitid, identity.rawAddress.toCPointer<ByteVar>(), subfactor, propertybuffer.rawAddress.toCPointer<ByteVar>(), propertybuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun winBioIdentify(sessionhandle: UInt, unitid: MutPtr<UInt>, identity: MutPtr<WinbioIdentity>, subfactor: MutPtr<UByte>, rejectdetail: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify(sessionhandle, unitid.rawAddress.toCPointer<ByteVar>(), identity.rawAddress.toCPointer<ByteVar>(), subfactor.rawAddress.toCPointer<ByteVar>(), rejectdetail.rawAddress.toCPointer<ByteVar>())

public actual fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback(sessionhandle, 0L.toCPointer<ByteVar>(), identifycallbackcontext.rawAddress.toCPointer<ByteVar>())

public actual fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(sessionhandle, unitid)

public actual fun winBioImproveEnd(sessionhandle: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(sessionhandle)

public actual fun winBioLocateSensor(sessionhandle: UInt, unitid: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor(sessionhandle, unitid.rawAddress.toCPointer<ByteVar>())

public actual fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback(sessionhandle, 0L.toCPointer<ByteVar>(), locatecallbackcontext.rawAddress.toCPointer<ByteVar>())

public actual fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(sessionhandle, unitid)

public actual fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(sessionhandle)

public actual fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(sessionhandle, unitid)

public actual fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr<UInt>, unitcount: ULong, databaseid: ConstPtr<Guid>, sessionhandle: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession(factor, pooltype, flags, unitarray.rawAddress.toCPointer<ByteVar>(), unitcount, databaseid.rawAddress.toCPointer<ByteVar>(), sessionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor(sessionhandle, eventmask, 0L.toCPointer<ByteVar>(), eventcallbackcontext.rawAddress.toCPointer<ByteVar>())

public actual fun winBioReleaseFocus(): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus()

public actual fun winBioRemoveAllCredentials(): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials()

public actual fun winBioRemoveAllDomainCredentials(): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials()

public actual fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult =
    0

public actual fun winBioSetCredential(type: WinbioCredentialType, credential: ConstPtr<UByte>, credentialsize: ULong, format: WinbioCredentialFormat): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential(type, credential.rawAddress.toCPointer<ByteVar>(), credentialsize, format)

public actual fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, propertybuffer: ConstPtr<CVoid>, propertybuffersize: ULong): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty(sessionhandle, propertytype, propertyid, unitid, identity.rawAddress.toCPointer<ByteVar>(), subfactor, propertybuffer.rawAddress.toCPointer<ByteVar>(), propertybuffersize)

public actual fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(sessionhandle, unitid)

public actual fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(sessionhandle)

public actual fun winBioVerify(sessionhandle: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, unitid: MutPtr<UInt>, match: MutPtr<UByte>, rejectdetail: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioVerify(sessionhandle, identity.rawAddress.toCPointer<ByteVar>(), subfactor, unitid.rawAddress.toCPointer<ByteVar>(), match.rawAddress.toCPointer<ByteVar>(), rejectdetail.rawAddress.toCPointer<ByteVar>())

public actual fun winBioVerifyWithCallback(sessionhandle: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback(sessionhandle, identity.rawAddress.toCPointer<ByteVar>(), subfactor, 0L.toCPointer<ByteVar>(), verifycallbackcontext.rawAddress.toCPointer<ByteVar>())

public actual fun winBioWait(sessionhandle: UInt): Hresult =
    windowssysWindowsWin32DevicesBiometricframeworkWinBioWait(sessionhandle)
