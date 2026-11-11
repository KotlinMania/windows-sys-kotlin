@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioAcquireFocus
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumBiometricUnits
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumDatabases
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumServiceProviders
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioAsyncMonitorFrameworkChanges
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenFramework
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenSession
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioCancel
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioCaptureSample
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioCaptureSampleWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioCloseFramework
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioCloseSession
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioControlUnit
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioControlUnitPrivileged
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioDeleteTemplate
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnrollBegin
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnrollCapture
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnrollCaptureWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnrollCommit
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnrollDiscard
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnrollSelect
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnumBiometricUnits
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnumDatabases
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnumEnrollments
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioEnumServiceProviders
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioFree
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioGetDomainLogonSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioGetEnabledSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioGetEnrolledFactors
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioGetLogonSetting
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioGetProperty
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioIdentify
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioIdentifyWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioImproveBegin
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioImproveEnd
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioLocateSensor
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioLocateSensorWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioLockUnit
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioLogonIdentifiedUser
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioMonitorPresence
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioOpenSession
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioRegisterEventMonitor
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioReleaseFocus
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioRemoveAllCredentials
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioRemoveAllDomainCredentials
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioSetCredential
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioSetProperty
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioUnlockUnit
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioUnregisterEventMonitor
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioVerify
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioVerifyWithCallback
import io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_winBioWait
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun winBioAcquireFocus(): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioAcquireFocus()

public actual fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumBiometricUnits(frameworkhandle, factor)

public actual fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumDatabases(frameworkhandle, factor)

public actual fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumServiceProviders(frameworkhandle, factor)

public actual fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioAsyncMonitorFrameworkChanges(frameworkhandle, changetypes)

public actual fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: COpaquePointer?, asynchronousopen: Bool, frameworkhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenFramework(notificationmethod, targetwindow?.value?.toCPointer<ByteVar>(), messagecode, 0L.toCPointer<ByteVar>(), userdata?.value?.toCPointer<ByteVar>(), asynchronousopen, frameworkhandle?.value?.toCPointer<ByteVar>())

public actual fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: COpaquePointer?, unitcount: ULong, databaseid: COpaquePointer?, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: COpaquePointer?, asynchronousopen: Bool, sessionhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenSession(factor, pooltype, flags, unitarray?.value?.toCPointer<ByteVar>(), unitcount, databaseid?.value?.toCPointer<ByteVar>(), notificationmethod, targetwindow?.value?.toCPointer<ByteVar>(), messagecode, 0L.toCPointer<ByteVar>(), userdata?.value?.toCPointer<ByteVar>(), asynchronousopen, sessionhandle?.value?.toCPointer<ByteVar>())

public actual fun winBioCancel(sessionhandle: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioCancel(sessionhandle)

public actual fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: COpaquePointer?, sample: COpaquePointer?, samplesize: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioCaptureSample(sessionhandle, purpose, flags, unitid?.value?.toCPointer<ByteVar>(), sample?.value?.toCPointer<ByteVar>(), samplesize?.value?.toCPointer<ByteVar>(), rejectdetail?.value?.toCPointer<ByteVar>())

public actual fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioCaptureSampleWithCallback(sessionhandle, purpose, flags, 0L.toCPointer<ByteVar>(), capturecallbackcontext?.value?.toCPointer<ByteVar>())

public actual fun winBioCloseFramework(frameworkhandle: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioCloseFramework(frameworkhandle)

public actual fun winBioCloseSession(sessionhandle: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioCloseSession(sessionhandle)

public actual fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioControlUnit(sessionhandle, unitid, component, controlcode, sendbuffer?.value?.toCPointer<ByteVar>(), sendbuffersize, receivebuffer?.value?.toCPointer<ByteVar>(), receivebuffersize, receivedatasize?.value?.toCPointer<ByteVar>(), operationstatus?.value?.toCPointer<ByteVar>())

public actual fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioControlUnitPrivileged(sessionhandle, unitid, component, controlcode, sendbuffer?.value?.toCPointer<ByteVar>(), sendbuffersize, receivebuffer?.value?.toCPointer<ByteVar>(), receivebuffersize, receivedatasize?.value?.toCPointer<ByteVar>(), operationstatus?.value?.toCPointer<ByteVar>())

public actual fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioDeleteTemplate(sessionhandle, unitid, identity?.value?.toCPointer<ByteVar>(), subfactor)

public actual fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnrollBegin(sessionhandle, subfactor, unitid)

public actual fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnrollCapture(sessionhandle, rejectdetail?.value?.toCPointer<ByteVar>())

public actual fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnrollCaptureWithCallback(sessionhandle, 0L.toCPointer<ByteVar>(), enrollcallbackcontext?.value?.toCPointer<ByteVar>())

public actual fun winBioEnrollCommit(sessionhandle: UInt, identity: COpaquePointer?, isnewtemplate: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnrollCommit(sessionhandle, identity?.value?.toCPointer<ByteVar>(), isnewtemplate?.value?.toCPointer<ByteVar>())

public actual fun winBioEnrollDiscard(sessionhandle: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnrollDiscard(sessionhandle)

public actual fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnrollSelect(sessionhandle, selectorvalue)

public actual fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: COpaquePointer?, unitcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnumBiometricUnits(factor, unitschemaarray?.value?.toCPointer<ByteVar>(), unitcount?.value?.toCPointer<ByteVar>())

public actual fun winBioEnumDatabases(factor: UInt, storageschemaarray: COpaquePointer?, storagecount: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnumDatabases(factor, storageschemaarray?.value?.toCPointer<ByteVar>(), storagecount?.value?.toCPointer<ByteVar>())

public actual fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: COpaquePointer?, subfactorarray: COpaquePointer?, subfactorcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnumEnrollments(sessionhandle, unitid, identity?.value?.toCPointer<ByteVar>(), subfactorarray?.value?.toCPointer<ByteVar>(), subfactorcount?.value?.toCPointer<ByteVar>())

public actual fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: COpaquePointer?, bspcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioEnumServiceProviders(factor, bspschemaarray?.value?.toCPointer<ByteVar>(), bspcount?.value?.toCPointer<ByteVar>())

public actual fun winBioFree(address: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioFree(address?.value?.toCPointer<ByteVar>())

public actual fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: COpaquePointer?): Hresult =
    0

public actual fun winBioGetDomainLogonSetting(value: COpaquePointer?, source: COpaquePointer?) {
    windowssys_windows_win32_devices_biometricframework_winBioGetDomainLogonSetting(value?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())
}

public actual fun winBioGetEnabledSetting(value: COpaquePointer?, source: COpaquePointer?) {
    windowssys_windows_win32_devices_biometricframework_winBioGetEnabledSetting(value?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())
}

public actual fun winBioGetEnrolledFactors(accountowner: COpaquePointer?, enrolledfactors: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioGetEnrolledFactors(accountowner?.value?.toCPointer<ByteVar>(), enrolledfactors?.value?.toCPointer<ByteVar>())

public actual fun winBioGetLogonSetting(value: COpaquePointer?, source: COpaquePointer?) {
    windowssys_windows_win32_devices_biometricframework_winBioGetLogonSetting(value?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())
}

public actual fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioGetProperty(sessionhandle, propertytype, propertyid, unitid, identity?.value?.toCPointer<ByteVar>(), subfactor, propertybuffer?.value?.toCPointer<ByteVar>(), propertybuffersize?.value?.toCPointer<ByteVar>())

public actual fun winBioIdentify(sessionhandle: UInt, unitid: COpaquePointer?, identity: COpaquePointer?, subfactor: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioIdentify(sessionhandle, unitid?.value?.toCPointer<ByteVar>(), identity?.value?.toCPointer<ByteVar>(), subfactor?.value?.toCPointer<ByteVar>(), rejectdetail?.value?.toCPointer<ByteVar>())

public actual fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioIdentifyWithCallback(sessionhandle, 0L.toCPointer<ByteVar>(), identifycallbackcontext?.value?.toCPointer<ByteVar>())

public actual fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioImproveBegin(sessionhandle, unitid)

public actual fun winBioImproveEnd(sessionhandle: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioImproveEnd(sessionhandle)

public actual fun winBioLocateSensor(sessionhandle: UInt, unitid: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioLocateSensor(sessionhandle, unitid?.value?.toCPointer<ByteVar>())

public actual fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioLocateSensorWithCallback(sessionhandle, 0L.toCPointer<ByteVar>(), locatecallbackcontext?.value?.toCPointer<ByteVar>())

public actual fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioLockUnit(sessionhandle, unitid)

public actual fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioLogonIdentifiedUser(sessionhandle)

public actual fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioMonitorPresence(sessionhandle, unitid)

public actual fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: COpaquePointer?, unitcount: ULong, databaseid: COpaquePointer?, sessionhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioOpenSession(factor, pooltype, flags, unitarray?.value?.toCPointer<ByteVar>(), unitcount, databaseid?.value?.toCPointer<ByteVar>(), sessionhandle?.value?.toCPointer<ByteVar>())

public actual fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioRegisterEventMonitor(sessionhandle, eventmask, 0L.toCPointer<ByteVar>(), eventcallbackcontext?.value?.toCPointer<ByteVar>())

public actual fun winBioReleaseFocus(): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioReleaseFocus()

public actual fun winBioRemoveAllCredentials(): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioRemoveAllCredentials()

public actual fun winBioRemoveAllDomainCredentials(): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioRemoveAllDomainCredentials()

public actual fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult =
    0

public actual fun winBioSetCredential(type: WinbioCredentialType, credential: COpaquePointer?, credentialsize: ULong, format: WinbioCredentialFormat): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioSetCredential(type, credential?.value?.toCPointer<ByteVar>(), credentialsize, format)

public actual fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: ULong): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioSetProperty(sessionhandle, propertytype, propertyid, unitid, identity?.value?.toCPointer<ByteVar>(), subfactor, propertybuffer?.value?.toCPointer<ByteVar>(), propertybuffersize)

public actual fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioUnlockUnit(sessionhandle, unitid)

public actual fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioUnregisterEventMonitor(sessionhandle)

public actual fun winBioVerify(sessionhandle: UInt, identity: COpaquePointer?, subfactor: UByte, unitid: COpaquePointer?, match: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioVerify(sessionhandle, identity?.value?.toCPointer<ByteVar>(), subfactor, unitid?.value?.toCPointer<ByteVar>(), match?.value?.toCPointer<ByteVar>(), rejectdetail?.value?.toCPointer<ByteVar>())

public actual fun winBioVerifyWithCallback(sessionhandle: UInt, identity: COpaquePointer?, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: COpaquePointer?): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioVerifyWithCallback(sessionhandle, identity?.value?.toCPointer<ByteVar>(), subfactor, 0L.toCPointer<ByteVar>(), verifycallbackcontext?.value?.toCPointer<ByteVar>())

public actual fun winBioWait(sessionhandle: UInt): Hresult =
    windowssys_windows_win32_devices_biometricframework_winBioWait(sessionhandle)
