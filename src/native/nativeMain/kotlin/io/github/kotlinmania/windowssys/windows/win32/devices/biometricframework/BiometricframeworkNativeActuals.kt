@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun WinBioAcquireFocus(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioAcquireFocus()

public actual fun WinBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumBiometricUnits(frameworkhandle, factor)

public actual fun WinBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumDatabases(frameworkhandle, factor)

public actual fun WinBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumServiceProviders(frameworkhandle, factor)

public actual fun WinBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioAsyncMonitorFrameworkChanges(frameworkhandle, changetypes)

public actual fun WinBioAsyncOpenFramework(notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, frameworkhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenFramework(notificationmethod, targetwindow.toCPointer<ByteVar>(), messagecode, callbackroutine.toLong().toCPointer<ByteVar>(), userdata.toCPointer<ByteVar>(), asynchronousopen, frameworkhandle.toCPointer<ByteVar>())

public actual fun WinBioAsyncOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, sessionhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenSession(factor, pooltype, flags, unitarray.toCPointer<ByteVar>(), unitcount, databaseid.toCPointer<ByteVar>(), notificationmethod, targetwindow.toCPointer<ByteVar>(), messagecode, callbackroutine.toLong().toCPointer<ByteVar>(), userdata.toCPointer<ByteVar>(), asynchronousopen, sessionhandle.toCPointer<ByteVar>())

public actual fun WinBioCancel(sessionhandle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioCancel(sessionhandle)

public actual fun WinBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioCaptureSample(sessionhandle, purpose, flags, unitid.toCPointer<ByteVar>(), sample.toCPointer<ByteVar>(), samplesize.toCPointer<ByteVar>(), rejectdetail.toCPointer<ByteVar>())

public actual fun WinBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PWINBIO_CAPTURE_CALLBACK, capturecallbackcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioCaptureSampleWithCallback(sessionhandle, purpose, flags, capturecallback.toLong().toCPointer<ByteVar>(), capturecallbackcontext.toCPointer<ByteVar>())

public actual fun WinBioCloseFramework(frameworkhandle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioCloseFramework(frameworkhandle)

public actual fun WinBioCloseSession(sessionhandle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioCloseSession(sessionhandle)

public actual fun WinBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioControlUnit(sessionhandle, unitid, component, controlcode, sendbuffer.toCPointer<ByteVar>(), sendbuffersize, receivebuffer.toCPointer<ByteVar>(), receivebuffersize, receivedatasize.toCPointer<ByteVar>(), operationstatus.toCPointer<ByteVar>())

public actual fun WinBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioControlUnitPrivileged(sessionhandle, unitid, component, controlcode, sendbuffer.toCPointer<ByteVar>(), sendbuffersize, receivebuffer.toCPointer<ByteVar>(), receivebuffersize, receivedatasize.toCPointer<ByteVar>(), operationstatus.toCPointer<ByteVar>())

public actual fun WinBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: Long, subfactor: UByte): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioDeleteTemplate(sessionhandle, unitid, identity.toCPointer<ByteVar>(), subfactor)

public actual fun WinBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnrollBegin(sessionhandle, subfactor, unitid)

public actual fun WinBioEnrollCapture(sessionhandle: UInt, rejectdetail: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCapture(sessionhandle, rejectdetail.toCPointer<ByteVar>())

public actual fun WinBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PWINBIO_ENROLL_CAPTURE_CALLBACK, enrollcallbackcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCaptureWithCallback(sessionhandle, enrollcallback.toLong().toCPointer<ByteVar>(), enrollcallbackcontext.toCPointer<ByteVar>())

public actual fun WinBioEnrollCommit(sessionhandle: UInt, identity: Long, isnewtemplate: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCommit(sessionhandle, identity.toCPointer<ByteVar>(), isnewtemplate.toCPointer<ByteVar>())

public actual fun WinBioEnrollDiscard(sessionhandle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnrollDiscard(sessionhandle)

public actual fun WinBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnrollSelect(sessionhandle, selectorvalue)

public actual fun WinBioEnumBiometricUnits(factor: UInt, unitschemaarray: Long, unitcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnumBiometricUnits(factor, unitschemaarray.toCPointer<ByteVar>(), unitcount.toCPointer<ByteVar>())

public actual fun WinBioEnumDatabases(factor: UInt, storageschemaarray: Long, storagecount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnumDatabases(factor, storageschemaarray.toCPointer<ByteVar>(), storagecount.toCPointer<ByteVar>())

public actual fun WinBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: Long, subfactorarray: Long, subfactorcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnumEnrollments(sessionhandle, unitid, identity.toCPointer<ByteVar>(), subfactorarray.toCPointer<ByteVar>(), subfactorcount.toCPointer<ByteVar>())

public actual fun WinBioEnumServiceProviders(factor: UInt, bspschemaarray: Long, bspcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioEnumServiceProviders(factor, bspschemaarray.toCPointer<ByteVar>(), bspcount.toCPointer<ByteVar>())

public actual fun WinBioFree(address: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioFree(address.toCPointer<ByteVar>())

public actual fun WinBioGetCredentialState(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE, credentialstate: Long): HRESULT =
    0

public actual fun WinBioGetDomainLogonSetting(value: Long, source: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioGetDomainLogonSetting(value.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())
}

public actual fun WinBioGetEnabledSetting(value: Long, source: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioGetEnabledSetting(value.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())
}

public actual fun WinBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioGetEnrolledFactors(accountowner.toCPointer<ByteVar>(), enrolledfactors.toCPointer<ByteVar>())

public actual fun WinBioGetLogonSetting(value: Long, source: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioGetLogonSetting(value.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())
}

public actual fun WinBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioGetProperty(sessionhandle, propertytype, propertyid, unitid, identity.toCPointer<ByteVar>(), subfactor, propertybuffer.toCPointer<ByteVar>(), propertybuffersize.toCPointer<ByteVar>())

public actual fun WinBioIdentify(sessionhandle: UInt, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioIdentify(sessionhandle, unitid.toCPointer<ByteVar>(), identity.toCPointer<ByteVar>(), subfactor.toCPointer<ByteVar>(), rejectdetail.toCPointer<ByteVar>())

public actual fun WinBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PWINBIO_IDENTIFY_CALLBACK, identifycallbackcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioIdentifyWithCallback(sessionhandle, identifycallback.toLong().toCPointer<ByteVar>(), identifycallbackcontext.toCPointer<ByteVar>())

public actual fun WinBioImproveBegin(sessionhandle: UInt, unitid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioImproveBegin(sessionhandle, unitid)

public actual fun WinBioImproveEnd(sessionhandle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioImproveEnd(sessionhandle)

public actual fun WinBioLocateSensor(sessionhandle: UInt, unitid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioLocateSensor(sessionhandle, unitid.toCPointer<ByteVar>())

public actual fun WinBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PWINBIO_LOCATE_SENSOR_CALLBACK, locatecallbackcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioLocateSensorWithCallback(sessionhandle, locatecallback.toLong().toCPointer<ByteVar>(), locatecallbackcontext.toCPointer<ByteVar>())

public actual fun WinBioLockUnit(sessionhandle: UInt, unitid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioLockUnit(sessionhandle, unitid)

public actual fun WinBioLogonIdentifiedUser(sessionhandle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioLogonIdentifiedUser(sessionhandle)

public actual fun WinBioMonitorPresence(sessionhandle: UInt, unitid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioMonitorPresence(sessionhandle, unitid)

public actual fun WinBioOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, sessionhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioOpenSession(factor, pooltype, flags, unitarray.toCPointer<ByteVar>(), unitcount, databaseid.toCPointer<ByteVar>(), sessionhandle.toCPointer<ByteVar>())

public actual fun WinBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PWINBIO_EVENT_CALLBACK, eventcallbackcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioRegisterEventMonitor(sessionhandle, eventmask, eventcallback.toLong().toCPointer<ByteVar>(), eventcallbackcontext.toCPointer<ByteVar>())

public actual fun WinBioReleaseFocus(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioReleaseFocus()

public actual fun WinBioRemoveAllCredentials(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllCredentials()

public actual fun WinBioRemoveAllDomainCredentials(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllDomainCredentials()

public actual fun WinBioRemoveCredential(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE): HRESULT =
    0

public actual fun WinBioSetCredential(type: WINBIO_CREDENTIAL_TYPE, credential: Long, credentialsize: ULong, format: WINBIO_CREDENTIAL_FORMAT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioSetCredential(type, credential.toCPointer<ByteVar>(), credentialsize, format)

public actual fun WinBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioSetProperty(sessionhandle, propertytype, propertyid, unitid, identity.toCPointer<ByteVar>(), subfactor, propertybuffer.toCPointer<ByteVar>(), propertybuffersize)

public actual fun WinBioUnlockUnit(sessionhandle: UInt, unitid: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioUnlockUnit(sessionhandle, unitid)

public actual fun WinBioUnregisterEventMonitor(sessionhandle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioUnregisterEventMonitor(sessionhandle)

public actual fun WinBioVerify(sessionhandle: UInt, identity: Long, subfactor: UByte, unitid: Long, match: Long, rejectdetail: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioVerify(sessionhandle, identity.toCPointer<ByteVar>(), subfactor, unitid.toCPointer<ByteVar>(), match.toCPointer<ByteVar>(), rejectdetail.toCPointer<ByteVar>())

public actual fun WinBioVerifyWithCallback(sessionhandle: UInt, identity: Long, subfactor: UByte, verifycallback: PWINBIO_VERIFY_CALLBACK, verifycallbackcontext: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioVerifyWithCallback(sessionhandle, identity.toCPointer<ByteVar>(), subfactor, verifycallback.toLong().toCPointer<ByteVar>(), verifycallbackcontext.toCPointer<ByteVar>())

public actual fun WinBioWait(sessionhandle: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework.cinterop.windowssys_windows_win32_devices_biometricframework_WinBioWait(sessionhandle)
