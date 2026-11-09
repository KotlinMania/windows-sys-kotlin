@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32DevicesBiometricframeworkJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioAcquireFocus(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumBiometricUnits(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumDatabases(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumServiceProviders(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioAsyncMonitorFrameworkChanges(frameworkhandle: Int, changetypes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenFramework(notificationmethod: Int, targetwindow: Long, messagecode: Int, callbackroutine: Long, userdata: Long, asynchronousopen: Int, frameworkhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenSession(factor: Int, pooltype: Int, flags: Int, unitarray: Long, unitcount: Long, databaseid: Long, notificationmethod: Int, targetwindow: Long, messagecode: Int, callbackroutine: Long, userdata: Long, asynchronousopen: Int, sessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioCancel(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioCaptureSample(sessionhandle: Int, purpose: Byte, flags: Byte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioCaptureSampleWithCallback(sessionhandle: Int, purpose: Byte, flags: Byte, capturecallback: Long, capturecallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioCloseFramework(frameworkhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioCloseSession(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioControlUnit(sessionhandle: Int, unitid: Int, component: Int, controlcode: Int, sendbuffer: Long, sendbuffersize: Long, receivebuffer: Long, receivebuffersize: Long, receivedatasize: Long, operationstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioControlUnitPrivileged(sessionhandle: Int, unitid: Int, component: Int, controlcode: Int, sendbuffer: Long, sendbuffersize: Long, receivebuffer: Long, receivebuffersize: Long, receivedatasize: Long, operationstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioDeleteTemplate(sessionhandle: Int, unitid: Int, identity: Long, subfactor: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnrollBegin(sessionhandle: Int, subfactor: Byte, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnrollCapture(sessionhandle: Int, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnrollCaptureWithCallback(sessionhandle: Int, enrollcallback: Long, enrollcallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnrollCommit(sessionhandle: Int, identity: Long, isnewtemplate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnrollDiscard(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnrollSelect(sessionhandle: Int, selectorvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnumBiometricUnits(factor: Int, unitschemaarray: Long, unitcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnumDatabases(factor: Int, storageschemaarray: Long, storagecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnumEnrollments(sessionhandle: Int, unitid: Int, identity: Long, subfactorarray: Long, subfactorcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioEnumServiceProviders(factor: Int, bspschemaarray: Long, bspcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioFree(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioGetDomainLogonSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioGetEnabledSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioGetLogonSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioGetProperty(sessionhandle: Int, propertytype: Int, propertyid: Int, unitid: Int, identity: Long, subfactor: Byte, propertybuffer: Long, propertybuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioIdentify(sessionhandle: Int, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioIdentifyWithCallback(sessionhandle: Int, identifycallback: Long, identifycallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioImproveBegin(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioImproveEnd(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioLocateSensor(sessionhandle: Int, unitid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioLocateSensorWithCallback(sessionhandle: Int, locatecallback: Long, locatecallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioLockUnit(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioLogonIdentifiedUser(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioMonitorPresence(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioOpenSession(factor: Int, pooltype: Int, flags: Int, unitarray: Long, unitcount: Long, databaseid: Long, sessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioRegisterEventMonitor(sessionhandle: Int, eventmask: Int, eventcallback: Long, eventcallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioReleaseFocus(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllCredentials(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllDomainCredentials(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioSetCredential(type: Int, credential: Long, credentialsize: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioSetProperty(sessionhandle: Int, propertytype: Int, propertyid: Int, unitid: Int, identity: Long, subfactor: Byte, propertybuffer: Long, propertybuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioUnlockUnit(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioUnregisterEventMonitor(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioVerify(sessionhandle: Int, identity: Long, subfactor: Byte, unitid: Long, match: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioVerifyWithCallback(sessionhandle: Int, identity: Long, subfactor: Byte, verifycallback: Long, verifycallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_WinBioWait(sessionhandle: Int): Int
}

public actual fun WinBioAcquireFocus(): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioAcquireFocus()

public actual fun WinBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumBiometricUnits(frameworkhandle.toInt(), factor.toInt())

public actual fun WinBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumDatabases(frameworkhandle.toInt(), factor.toInt())

public actual fun WinBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioAsyncEnumServiceProviders(frameworkhandle.toInt(), factor.toInt())

public actual fun WinBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioAsyncMonitorFrameworkChanges(frameworkhandle.toInt(), changetypes.toInt())

public actual fun WinBioAsyncOpenFramework(notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, frameworkhandle: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenFramework(notificationmethod, targetwindow, messagecode.toInt(), callbackroutine.toLong(), userdata, asynchronousopen, frameworkhandle)

public actual fun WinBioAsyncOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, notificationmethod: WINBIO_ASYNC_NOTIFICATION_METHOD, targetwindow: HWND, messagecode: UInt, callbackroutine: PWINBIO_ASYNC_COMPLETION_CALLBACK, userdata: Long, asynchronousopen: BOOL, sessionhandle: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioAsyncOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray, unitcount.toLong(), databaseid, notificationmethod, targetwindow, messagecode.toInt(), callbackroutine.toLong(), userdata, asynchronousopen, sessionhandle)

public actual fun WinBioCancel(sessionhandle: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioCancel(sessionhandle.toInt())

public actual fun WinBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioCaptureSample(sessionhandle.toInt(), purpose.toByte(), flags.toByte(), unitid, sample, samplesize, rejectdetail)

public actual fun WinBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PWINBIO_CAPTURE_CALLBACK, capturecallbackcontext: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioCaptureSampleWithCallback(sessionhandle.toInt(), purpose.toByte(), flags.toByte(), capturecallback.toLong(), capturecallbackcontext)

public actual fun WinBioCloseFramework(frameworkhandle: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioCloseFramework(frameworkhandle.toInt())

public actual fun WinBioCloseSession(sessionhandle: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioCloseSession(sessionhandle.toInt())

public actual fun WinBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioControlUnit(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer, sendbuffersize.toLong(), receivebuffer, receivebuffersize.toLong(), receivedatasize, operationstatus)

public actual fun WinBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WINBIO_COMPONENT, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioControlUnitPrivileged(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer, sendbuffersize.toLong(), receivebuffer, receivebuffersize.toLong(), receivedatasize, operationstatus)

public actual fun WinBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: Long, subfactor: UByte): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioDeleteTemplate(sessionhandle.toInt(), unitid.toInt(), identity, subfactor.toByte())

public actual fun WinBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnrollBegin(sessionhandle.toInt(), subfactor.toByte(), unitid.toInt())

public actual fun WinBioEnrollCapture(sessionhandle: UInt, rejectdetail: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCapture(sessionhandle.toInt(), rejectdetail)

public actual fun WinBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PWINBIO_ENROLL_CAPTURE_CALLBACK, enrollcallbackcontext: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCaptureWithCallback(sessionhandle.toInt(), enrollcallback.toLong(), enrollcallbackcontext)

public actual fun WinBioEnrollCommit(sessionhandle: UInt, identity: Long, isnewtemplate: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnrollCommit(sessionhandle.toInt(), identity, isnewtemplate)

public actual fun WinBioEnrollDiscard(sessionhandle: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnrollDiscard(sessionhandle.toInt())

public actual fun WinBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnrollSelect(sessionhandle.toInt(), selectorvalue.toLong())

public actual fun WinBioEnumBiometricUnits(factor: UInt, unitschemaarray: Long, unitcount: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnumBiometricUnits(factor.toInt(), unitschemaarray, unitcount)

public actual fun WinBioEnumDatabases(factor: UInt, storageschemaarray: Long, storagecount: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnumDatabases(factor.toInt(), storageschemaarray, storagecount)

public actual fun WinBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: Long, subfactorarray: Long, subfactorcount: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnumEnrollments(sessionhandle.toInt(), unitid.toInt(), identity, subfactorarray, subfactorcount)

public actual fun WinBioEnumServiceProviders(factor: UInt, bspschemaarray: Long, bspcount: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioEnumServiceProviders(factor.toInt(), bspschemaarray, bspcount)

public actual fun WinBioFree(address: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioFree(address)

public actual fun WinBioGetCredentialState(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE, credentialstate: Long): HRESULT =
    0

public actual fun WinBioGetDomainLogonSetting(value: Long, source: Long) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioGetDomainLogonSetting(value, source)
}

public actual fun WinBioGetEnabledSetting(value: Long, source: Long) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioGetEnabledSetting(value, source)
}

public actual fun WinBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioGetEnrolledFactors(accountowner, enrolledfactors)

public actual fun WinBioGetLogonSetting(value: Long, source: Long) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioGetLogonSetting(value, source)
}

public actual fun WinBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioGetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity, subfactor.toByte(), propertybuffer, propertybuffersize)

public actual fun WinBioIdentify(sessionhandle: UInt, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioIdentify(sessionhandle.toInt(), unitid, identity, subfactor, rejectdetail)

public actual fun WinBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PWINBIO_IDENTIFY_CALLBACK, identifycallbackcontext: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioIdentifyWithCallback(sessionhandle.toInt(), identifycallback.toLong(), identifycallbackcontext)

public actual fun WinBioImproveBegin(sessionhandle: UInt, unitid: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioImproveBegin(sessionhandle.toInt(), unitid.toInt())

public actual fun WinBioImproveEnd(sessionhandle: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioImproveEnd(sessionhandle.toInt())

public actual fun WinBioLocateSensor(sessionhandle: UInt, unitid: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioLocateSensor(sessionhandle.toInt(), unitid)

public actual fun WinBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PWINBIO_LOCATE_SENSOR_CALLBACK, locatecallbackcontext: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioLocateSensorWithCallback(sessionhandle.toInt(), locatecallback.toLong(), locatecallbackcontext)

public actual fun WinBioLockUnit(sessionhandle: UInt, unitid: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioLockUnit(sessionhandle.toInt(), unitid.toInt())

public actual fun WinBioLogonIdentifiedUser(sessionhandle: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioLogonIdentifiedUser(sessionhandle.toInt())

public actual fun WinBioMonitorPresence(sessionhandle: UInt, unitid: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioMonitorPresence(sessionhandle.toInt(), unitid.toInt())

public actual fun WinBioOpenSession(factor: UInt, pooltype: WINBIO_POOL, flags: UInt, unitarray: Long, unitcount: ULong, databaseid: Long, sessionhandle: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray, unitcount.toLong(), databaseid, sessionhandle)

public actual fun WinBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PWINBIO_EVENT_CALLBACK, eventcallbackcontext: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioRegisterEventMonitor(sessionhandle.toInt(), eventmask.toInt(), eventcallback.toLong(), eventcallbackcontext)

public actual fun WinBioReleaseFocus(): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioReleaseFocus()

public actual fun WinBioRemoveAllCredentials(): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllCredentials()

public actual fun WinBioRemoveAllDomainCredentials(): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioRemoveAllDomainCredentials()

public actual fun WinBioRemoveCredential(identity: WINBIO_IDENTITY, type: WINBIO_CREDENTIAL_TYPE): HRESULT =
    0

public actual fun WinBioSetCredential(type: WINBIO_CREDENTIAL_TYPE, credential: Long, credentialsize: ULong, format: WINBIO_CREDENTIAL_FORMAT): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioSetCredential(type, credential, credentialsize.toLong(), format)

public actual fun WinBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: ULong): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioSetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity, subfactor.toByte(), propertybuffer, propertybuffersize.toLong())

public actual fun WinBioUnlockUnit(sessionhandle: UInt, unitid: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioUnlockUnit(sessionhandle.toInt(), unitid.toInt())

public actual fun WinBioUnregisterEventMonitor(sessionhandle: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioUnregisterEventMonitor(sessionhandle.toInt())

public actual fun WinBioVerify(sessionhandle: UInt, identity: Long, subfactor: UByte, unitid: Long, match: Long, rejectdetail: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioVerify(sessionhandle.toInt(), identity, subfactor.toByte(), unitid, match, rejectdetail)

public actual fun WinBioVerifyWithCallback(sessionhandle: UInt, identity: Long, subfactor: UByte, verifycallback: PWINBIO_VERIFY_CALLBACK, verifycallbackcontext: Long): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioVerifyWithCallback(sessionhandle.toInt(), identity, subfactor.toByte(), verifycallback.toLong(), verifycallbackcontext)

public actual fun WinBioWait(sessionhandle: UInt): HRESULT =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_WinBioWait(sessionhandle.toInt())
