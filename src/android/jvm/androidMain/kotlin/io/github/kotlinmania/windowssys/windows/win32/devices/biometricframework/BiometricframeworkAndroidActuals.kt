@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DevicesBiometricframeworkJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioAcquireFocus(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumBiometricUnits(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumDatabases(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumServiceProviders(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioAsyncMonitorFrameworkChanges(frameworkhandle: Int, changetypes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenFramework(notificationmethod: Int, targetwindow: Long, messagecode: Int, callbackroutine: Long, userdata: Long, asynchronousopen: Int, frameworkhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenSession(factor: Int, pooltype: Int, flags: Int, unitarray: Long, unitcount: Long, databaseid: Long, notificationmethod: Int, targetwindow: Long, messagecode: Int, callbackroutine: Long, userdata: Long, asynchronousopen: Int, sessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioCancel(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioCaptureSample(sessionhandle: Int, purpose: Byte, flags: Byte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioCaptureSampleWithCallback(sessionhandle: Int, purpose: Byte, flags: Byte, capturecallback: Long, capturecallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioCloseFramework(frameworkhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioCloseSession(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioControlUnit(sessionhandle: Int, unitid: Int, component: Int, controlcode: Int, sendbuffer: Long, sendbuffersize: Long, receivebuffer: Long, receivebuffersize: Long, receivedatasize: Long, operationstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioControlUnitPrivileged(sessionhandle: Int, unitid: Int, component: Int, controlcode: Int, sendbuffer: Long, sendbuffersize: Long, receivebuffer: Long, receivebuffersize: Long, receivedatasize: Long, operationstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioDeleteTemplate(sessionhandle: Int, unitid: Int, identity: Long, subfactor: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnrollBegin(sessionhandle: Int, subfactor: Byte, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnrollCapture(sessionhandle: Int, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnrollCaptureWithCallback(sessionhandle: Int, enrollcallback: Long, enrollcallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnrollCommit(sessionhandle: Int, identity: Long, isnewtemplate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnrollDiscard(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnrollSelect(sessionhandle: Int, selectorvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnumBiometricUnits(factor: Int, unitschemaarray: Long, unitcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnumDatabases(factor: Int, storageschemaarray: Long, storagecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnumEnrollments(sessionhandle: Int, unitid: Int, identity: Long, subfactorarray: Long, subfactorcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioEnumServiceProviders(factor: Int, bspschemaarray: Long, bspcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioFree(address: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioGetDomainLogonSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioGetEnabledSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioGetLogonSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioGetProperty(sessionhandle: Int, propertytype: Int, propertyid: Int, unitid: Int, identity: Long, subfactor: Byte, propertybuffer: Long, propertybuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioIdentify(sessionhandle: Int, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioIdentifyWithCallback(sessionhandle: Int, identifycallback: Long, identifycallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioImproveBegin(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioImproveEnd(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioLocateSensor(sessionhandle: Int, unitid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioLocateSensorWithCallback(sessionhandle: Int, locatecallback: Long, locatecallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioLockUnit(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioLogonIdentifiedUser(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioMonitorPresence(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioOpenSession(factor: Int, pooltype: Int, flags: Int, unitarray: Long, unitcount: Long, databaseid: Long, sessionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioRegisterEventMonitor(sessionhandle: Int, eventmask: Int, eventcallback: Long, eventcallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioReleaseFocus(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioRemoveAllCredentials(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioRemoveAllDomainCredentials(): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioSetCredential(type: Int, credential: Long, credentialsize: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioSetProperty(sessionhandle: Int, propertytype: Int, propertyid: Int, unitid: Int, identity: Long, subfactor: Byte, propertybuffer: Long, propertybuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioUnlockUnit(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioUnregisterEventMonitor(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioVerify(sessionhandle: Int, identity: Long, subfactor: Byte, unitid: Long, match: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioVerifyWithCallback(sessionhandle: Int, identity: Long, subfactor: Byte, verifycallback: Long, verifycallbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_biometricframework_winBioWait(sessionhandle: Int): Int
}

public actual fun winBioAcquireFocus(): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioAcquireFocus()

public actual fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumBiometricUnits(frameworkhandle.toInt(), factor.toInt())

public actual fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumDatabases(frameworkhandle.toInt(), factor.toInt())

public actual fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioAsyncEnumServiceProviders(frameworkhandle.toInt(), factor.toInt())

public actual fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioAsyncMonitorFrameworkChanges(frameworkhandle.toInt(), changetypes.toInt())

public actual fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: COpaquePointer?, asynchronousopen: Bool, frameworkhandle: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenFramework(notificationmethod, (targetwindow?.value ?: 0L), messagecode.toInt(), 0L, (userdata?.value ?: 0L), asynchronousopen, (frameworkhandle?.value ?: 0L))

public actual fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: COpaquePointer?, unitcount: ULong, databaseid: COpaquePointer?, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: COpaquePointer?, asynchronousopen: Bool, sessionhandle: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioAsyncOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), (unitarray?.value ?: 0L), unitcount.toLong(), (databaseid?.value ?: 0L), notificationmethod, (targetwindow?.value ?: 0L), messagecode.toInt(), 0L, (userdata?.value ?: 0L), asynchronousopen, (sessionhandle?.value ?: 0L))

public actual fun winBioCancel(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioCancel(sessionhandle.toInt())

public actual fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: COpaquePointer?, sample: COpaquePointer?, samplesize: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioCaptureSample(sessionhandle.toInt(), purpose.toByte(), flags.toByte(), (unitid?.value ?: 0L), (sample?.value ?: 0L), (samplesize?.value ?: 0L), (rejectdetail?.value ?: 0L))

public actual fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioCaptureSampleWithCallback(sessionhandle.toInt(), purpose.toByte(), flags.toByte(), 0L, (capturecallbackcontext?.value ?: 0L))

public actual fun winBioCloseFramework(frameworkhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioCloseFramework(frameworkhandle.toInt())

public actual fun winBioCloseSession(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioCloseSession(sessionhandle.toInt())

public actual fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioControlUnit(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), (sendbuffer?.value ?: 0L), sendbuffersize.toLong(), (receivebuffer?.value ?: 0L), receivebuffersize.toLong(), (receivedatasize?.value ?: 0L), (operationstatus?.value ?: 0L))

public actual fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioControlUnitPrivileged(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), (sendbuffer?.value ?: 0L), sendbuffersize.toLong(), (receivebuffer?.value ?: 0L), receivebuffersize.toLong(), (receivedatasize?.value ?: 0L), (operationstatus?.value ?: 0L))

public actual fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioDeleteTemplate(sessionhandle.toInt(), unitid.toInt(), (identity?.value ?: 0L), subfactor.toByte())

public actual fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnrollBegin(sessionhandle.toInt(), subfactor.toByte(), unitid.toInt())

public actual fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnrollCapture(sessionhandle.toInt(), (rejectdetail?.value ?: 0L))

public actual fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnrollCaptureWithCallback(sessionhandle.toInt(), 0L, (enrollcallbackcontext?.value ?: 0L))

public actual fun winBioEnrollCommit(sessionhandle: UInt, identity: COpaquePointer?, isnewtemplate: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnrollCommit(sessionhandle.toInt(), (identity?.value ?: 0L), (isnewtemplate?.value ?: 0L))

public actual fun winBioEnrollDiscard(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnrollDiscard(sessionhandle.toInt())

public actual fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnrollSelect(sessionhandle.toInt(), selectorvalue.toLong())

public actual fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: COpaquePointer?, unitcount: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnumBiometricUnits(factor.toInt(), (unitschemaarray?.value ?: 0L), (unitcount?.value ?: 0L))

public actual fun winBioEnumDatabases(factor: UInt, storageschemaarray: COpaquePointer?, storagecount: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnumDatabases(factor.toInt(), (storageschemaarray?.value ?: 0L), (storagecount?.value ?: 0L))

public actual fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: COpaquePointer?, subfactorarray: COpaquePointer?, subfactorcount: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnumEnrollments(sessionhandle.toInt(), unitid.toInt(), (identity?.value ?: 0L), (subfactorarray?.value ?: 0L), (subfactorcount?.value ?: 0L))

public actual fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: COpaquePointer?, bspcount: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioEnumServiceProviders(factor.toInt(), (bspschemaarray?.value ?: 0L), (bspcount?.value ?: 0L))

public actual fun winBioFree(address: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioFree((address?.value ?: 0L))

public actual fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: COpaquePointer?): Hresult =
    0

public actual fun winBioGetDomainLogonSetting(value: COpaquePointer?, source: COpaquePointer?) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioGetDomainLogonSetting((value?.value ?: 0L), (source?.value ?: 0L))
}

public actual fun winBioGetEnabledSetting(value: COpaquePointer?, source: COpaquePointer?) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioGetEnabledSetting((value?.value ?: 0L), (source?.value ?: 0L))
}

public actual fun winBioGetEnrolledFactors(accountowner: COpaquePointer?, enrolledfactors: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioGetEnrolledFactors((accountowner?.value ?: 0L), (enrolledfactors?.value ?: 0L))

public actual fun winBioGetLogonSetting(value: COpaquePointer?, source: COpaquePointer?) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioGetLogonSetting((value?.value ?: 0L), (source?.value ?: 0L))
}

public actual fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioGetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), (identity?.value ?: 0L), subfactor.toByte(), (propertybuffer?.value ?: 0L), (propertybuffersize?.value ?: 0L))

public actual fun winBioIdentify(sessionhandle: UInt, unitid: COpaquePointer?, identity: COpaquePointer?, subfactor: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioIdentify(sessionhandle.toInt(), (unitid?.value ?: 0L), (identity?.value ?: 0L), (subfactor?.value ?: 0L), (rejectdetail?.value ?: 0L))

public actual fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioIdentifyWithCallback(sessionhandle.toInt(), 0L, (identifycallbackcontext?.value ?: 0L))

public actual fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioImproveBegin(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioImproveEnd(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioImproveEnd(sessionhandle.toInt())

public actual fun winBioLocateSensor(sessionhandle: UInt, unitid: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioLocateSensor(sessionhandle.toInt(), (unitid?.value ?: 0L))

public actual fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioLocateSensorWithCallback(sessionhandle.toInt(), 0L, (locatecallbackcontext?.value ?: 0L))

public actual fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioLockUnit(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioLogonIdentifiedUser(sessionhandle.toInt())

public actual fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioMonitorPresence(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: COpaquePointer?, unitcount: ULong, databaseid: COpaquePointer?, sessionhandle: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), (unitarray?.value ?: 0L), unitcount.toLong(), (databaseid?.value ?: 0L), (sessionhandle?.value ?: 0L))

public actual fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioRegisterEventMonitor(sessionhandle.toInt(), eventmask.toInt(), 0L, (eventcallbackcontext?.value ?: 0L))

public actual fun winBioReleaseFocus(): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioReleaseFocus()

public actual fun winBioRemoveAllCredentials(): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioRemoveAllCredentials()

public actual fun winBioRemoveAllDomainCredentials(): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioRemoveAllDomainCredentials()

public actual fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult =
    0

public actual fun winBioSetCredential(type: WinbioCredentialType, credential: COpaquePointer?, credentialsize: ULong, format: WinbioCredentialFormat): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioSetCredential(type, (credential?.value ?: 0L), credentialsize.toLong(), format)

public actual fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: ULong): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioSetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), (identity?.value ?: 0L), subfactor.toByte(), (propertybuffer?.value ?: 0L), propertybuffersize.toLong())

public actual fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioUnlockUnit(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioUnregisterEventMonitor(sessionhandle.toInt())

public actual fun winBioVerify(sessionhandle: UInt, identity: COpaquePointer?, subfactor: UByte, unitid: COpaquePointer?, match: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioVerify(sessionhandle.toInt(), (identity?.value ?: 0L), subfactor.toByte(), (unitid?.value ?: 0L), (match?.value ?: 0L), (rejectdetail?.value ?: 0L))

public actual fun winBioVerifyWithCallback(sessionhandle: UInt, identity: COpaquePointer?, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: COpaquePointer?): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioVerifyWithCallback(sessionhandle.toInt(), (identity?.value ?: 0L), subfactor.toByte(), 0L, (verifycallbackcontext?.value ?: 0L))

public actual fun winBioWait(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssys_windows_win32_devices_biometricframework_winBioWait(sessionhandle.toInt())
