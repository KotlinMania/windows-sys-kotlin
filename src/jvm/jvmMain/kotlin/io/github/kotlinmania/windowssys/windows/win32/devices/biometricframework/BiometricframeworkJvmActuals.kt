@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DevicesBiometricframeworkJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32DevicesBiometricframeworkJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(frameworkhandle: Int, factor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(frameworkhandle: Int, changetypes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework(notificationmethod: Int, targetwindow: Long, messagecode: Int, callbackroutine: Long, userdata: Long, asynchronousopen: Int, frameworkhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession(factor: Int, pooltype: Int, flags: Int, unitarray: Long, unitcount: Long, databaseid: Long, notificationmethod: Int, targetwindow: Long, messagecode: Int, callbackroutine: Long, userdata: Long, asynchronousopen: Int, sessionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample(sessionhandle: Int, purpose: Byte, flags: Byte, unitid: Long, sample: Long, samplesize: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback(sessionhandle: Int, purpose: Byte, flags: Byte, capturecallback: Long, capturecallbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(frameworkhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit(sessionhandle: Int, unitid: Int, component: Int, controlcode: Int, sendbuffer: Long, sendbuffersize: Long, receivebuffer: Long, receivebuffersize: Long, receivedatasize: Long, operationstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged(sessionhandle: Int, unitid: Int, component: Int, controlcode: Int, sendbuffer: Long, sendbuffersize: Long, receivebuffer: Long, receivebuffersize: Long, receivedatasize: Long, operationstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate(sessionhandle: Int, unitid: Int, identity: Long, subfactor: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(sessionhandle: Int, subfactor: Byte, unitid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture(sessionhandle: Int, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback(sessionhandle: Int, enrollcallback: Long, enrollcallbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit(sessionhandle: Int, identity: Long, isnewtemplate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(sessionhandle: Int, selectorvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits(factor: Int, unitschemaarray: Long, unitcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases(factor: Int, storageschemaarray: Long, storagecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments(sessionhandle: Int, unitid: Int, identity: Long, subfactorarray: Long, subfactorcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders(factor: Int, bspschemaarray: Long, bspcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioFree(address: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors(accountowner: Long, enrolledfactors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting(value: Long, source: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty(sessionhandle: Int, propertytype: Int, propertyid: Int, unitid: Int, identity: Long, subfactor: Byte, propertybuffer: Long, propertybuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify(sessionhandle: Int, unitid: Long, identity: Long, subfactor: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback(sessionhandle: Int, identifycallback: Long, identifycallbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor(sessionhandle: Int, unitid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback(sessionhandle: Int, locatecallback: Long, locatecallbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession(factor: Int, pooltype: Int, flags: Int, unitarray: Long, unitcount: Long, databaseid: Long, sessionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor(sessionhandle: Int, eventmask: Int, eventcallback: Long, eventcallbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential(type: Int, credential: Long, credentialsize: Long, format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty(sessionhandle: Int, propertytype: Int, propertyid: Int, unitid: Int, identity: Long, subfactor: Byte, propertybuffer: Long, propertybuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(sessionhandle: Int, unitid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(sessionhandle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioVerify(sessionhandle: Int, identity: Long, subfactor: Byte, unitid: Long, match: Long, rejectdetail: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback(sessionhandle: Int, identity: Long, subfactor: Byte, verifycallback: Long, verifycallbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBiometricframeworkWinBioWait(sessionhandle: Int): Int
}

public actual fun winBioAcquireFocus(): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus()

public actual fun winBioAsyncEnumBiometricUnits(frameworkhandle: UInt, factor: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(frameworkhandle.toInt(), factor.toInt())

public actual fun winBioAsyncEnumDatabases(frameworkhandle: UInt, factor: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(frameworkhandle.toInt(), factor.toInt())

public actual fun winBioAsyncEnumServiceProviders(frameworkhandle: UInt, factor: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(frameworkhandle.toInt(), factor.toInt())

public actual fun winBioAsyncMonitorFrameworkChanges(frameworkhandle: UInt, changetypes: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(frameworkhandle.toInt(), changetypes.toInt())

public actual fun winBioAsyncOpenFramework(notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr, asynchronousopen: Bool, frameworkhandle: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework(notificationmethod, targetwindow.rawAddress, messagecode.toInt(), 0L, userdata.rawAddress, asynchronousopen, frameworkhandle.rawAddress)

public actual fun winBioAsyncOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr, unitcount: ULong, databaseid: ConstPtr, notificationmethod: WinbioAsyncNotificationMethod, targetwindow: Hwnd, messagecode: UInt, callbackroutine: PwinbioAsyncCompletionCallback, userdata: ConstPtr, asynchronousopen: Bool, sessionhandle: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray.rawAddress, unitcount.toLong(), databaseid.rawAddress, notificationmethod, targetwindow.rawAddress, messagecode.toInt(), 0L, userdata.rawAddress, asynchronousopen, sessionhandle.rawAddress)

public actual fun winBioCancel(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(sessionhandle.toInt())

public actual fun winBioCaptureSample(sessionhandle: UInt, purpose: UByte, flags: UByte, unitid: MutPtr, sample: MutPtr, samplesize: MutPtr, rejectdetail: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample(sessionhandle.toInt(), purpose.toByte(), flags.toByte(), unitid.rawAddress, sample.rawAddress, samplesize.rawAddress, rejectdetail.rawAddress)

public actual fun winBioCaptureSampleWithCallback(sessionhandle: UInt, purpose: UByte, flags: UByte, capturecallback: PwinbioCaptureCallback, capturecallbackcontext: ConstPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback(sessionhandle.toInt(), purpose.toByte(), flags.toByte(), 0L, capturecallbackcontext.rawAddress)

public actual fun winBioCloseFramework(frameworkhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(frameworkhandle.toInt())

public actual fun winBioCloseSession(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(sessionhandle.toInt())

public actual fun winBioControlUnit(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr, sendbuffersize: ULong, receivebuffer: MutPtr, receivebuffersize: ULong, receivedatasize: MutPtr, operationstatus: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer.rawAddress, sendbuffersize.toLong(), receivebuffer.rawAddress, receivebuffersize.toLong(), receivedatasize.rawAddress, operationstatus.rawAddress)

public actual fun winBioControlUnitPrivileged(sessionhandle: UInt, unitid: UInt, component: WinbioComponent, controlcode: UInt, sendbuffer: ConstPtr, sendbuffersize: ULong, receivebuffer: MutPtr, receivebuffersize: ULong, receivedatasize: MutPtr, operationstatus: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged(sessionhandle.toInt(), unitid.toInt(), component.toInt(), controlcode.toInt(), sendbuffer.rawAddress, sendbuffersize.toLong(), receivebuffer.rawAddress, receivebuffersize.toLong(), receivedatasize.rawAddress, operationstatus.rawAddress)

public actual fun winBioDeleteTemplate(sessionhandle: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate(sessionhandle.toInt(), unitid.toInt(), identity.rawAddress, subfactor.toByte())

public actual fun winBioEnrollBegin(sessionhandle: UInt, subfactor: UByte, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(sessionhandle.toInt(), subfactor.toByte(), unitid.toInt())

public actual fun winBioEnrollCapture(sessionhandle: UInt, rejectdetail: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture(sessionhandle.toInt(), rejectdetail.rawAddress)

public actual fun winBioEnrollCaptureWithCallback(sessionhandle: UInt, enrollcallback: PwinbioEnrollCaptureCallback, enrollcallbackcontext: ConstPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback(sessionhandle.toInt(), 0L, enrollcallbackcontext.rawAddress)

public actual fun winBioEnrollCommit(sessionhandle: UInt, identity: MutPtr, isnewtemplate: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit(sessionhandle.toInt(), identity.rawAddress, isnewtemplate.rawAddress)

public actual fun winBioEnrollDiscard(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(sessionhandle.toInt())

public actual fun winBioEnrollSelect(sessionhandle: UInt, selectorvalue: ULong): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(sessionhandle.toInt(), selectorvalue.toLong())

public actual fun winBioEnumBiometricUnits(factor: UInt, unitschemaarray: MutPtr, unitcount: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits(factor.toInt(), unitschemaarray.rawAddress, unitcount.rawAddress)

public actual fun winBioEnumDatabases(factor: UInt, storageschemaarray: MutPtr, storagecount: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases(factor.toInt(), storageschemaarray.rawAddress, storagecount.rawAddress)

public actual fun winBioEnumEnrollments(sessionhandle: UInt, unitid: UInt, identity: ConstPtr, subfactorarray: MutPtr, subfactorcount: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments(sessionhandle.toInt(), unitid.toInt(), identity.rawAddress, subfactorarray.rawAddress, subfactorcount.rawAddress)

public actual fun winBioEnumServiceProviders(factor: UInt, bspschemaarray: MutPtr, bspcount: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders(factor.toInt(), bspschemaarray.rawAddress, bspcount.rawAddress)

public actual fun winBioFree(address: ConstPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioFree(address.rawAddress)

public actual fun winBioGetCredentialState(identity: WinbioIdentity, type: WinbioCredentialType, credentialstate: MutPtr): Hresult =
    0

public actual fun winBioGetDomainLogonSetting(value: MutPtr, source: MutPtr) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting(value.rawAddress, source.rawAddress)
}

public actual fun winBioGetEnabledSetting(value: MutPtr, source: MutPtr) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting(value.rawAddress, source.rawAddress)
}

public actual fun winBioGetEnrolledFactors(accountowner: ConstPtr, enrolledfactors: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors(accountowner.rawAddress, enrolledfactors.rawAddress)

public actual fun winBioGetLogonSetting(value: MutPtr, source: MutPtr) {
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting(value.rawAddress, source.rawAddress)
}

public actual fun winBioGetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte, propertybuffer: MutPtr, propertybuffersize: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity.rawAddress, subfactor.toByte(), propertybuffer.rawAddress, propertybuffersize.rawAddress)

public actual fun winBioIdentify(sessionhandle: UInt, unitid: MutPtr, identity: MutPtr, subfactor: MutPtr, rejectdetail: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify(sessionhandle.toInt(), unitid.rawAddress, identity.rawAddress, subfactor.rawAddress, rejectdetail.rawAddress)

public actual fun winBioIdentifyWithCallback(sessionhandle: UInt, identifycallback: PwinbioIdentifyCallback, identifycallbackcontext: ConstPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback(sessionhandle.toInt(), 0L, identifycallbackcontext.rawAddress)

public actual fun winBioImproveBegin(sessionhandle: UInt, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioImproveEnd(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(sessionhandle.toInt())

public actual fun winBioLocateSensor(sessionhandle: UInt, unitid: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor(sessionhandle.toInt(), unitid.rawAddress)

public actual fun winBioLocateSensorWithCallback(sessionhandle: UInt, locatecallback: PwinbioLocateSensorCallback, locatecallbackcontext: ConstPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback(sessionhandle.toInt(), 0L, locatecallbackcontext.rawAddress)

public actual fun winBioLockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioLogonIdentifiedUser(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(sessionhandle.toInt())

public actual fun winBioMonitorPresence(sessionhandle: UInt, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioOpenSession(factor: UInt, pooltype: WinbioPool, flags: UInt, unitarray: ConstPtr, unitcount: ULong, databaseid: ConstPtr, sessionhandle: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession(factor.toInt(), pooltype.toInt(), flags.toInt(), unitarray.rawAddress, unitcount.toLong(), databaseid.rawAddress, sessionhandle.rawAddress)

public actual fun winBioRegisterEventMonitor(sessionhandle: UInt, eventmask: UInt, eventcallback: PwinbioEventCallback, eventcallbackcontext: ConstPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor(sessionhandle.toInt(), eventmask.toInt(), 0L, eventcallbackcontext.rawAddress)

public actual fun winBioReleaseFocus(): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus()

public actual fun winBioRemoveAllCredentials(): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials()

public actual fun winBioRemoveAllDomainCredentials(): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials()

public actual fun winBioRemoveCredential(identity: WinbioIdentity, type: WinbioCredentialType): Hresult =
    0

public actual fun winBioSetCredential(type: WinbioCredentialType, credential: ConstPtr, credentialsize: ULong, format: WinbioCredentialFormat): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential(type, credential.rawAddress, credentialsize.toLong(), format)

public actual fun winBioSetProperty(sessionhandle: UInt, propertytype: UInt, propertyid: UInt, unitid: UInt, identity: ConstPtr, subfactor: UByte, propertybuffer: ConstPtr, propertybuffersize: ULong): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty(sessionhandle.toInt(), propertytype.toInt(), propertyid.toInt(), unitid.toInt(), identity.rawAddress, subfactor.toByte(), propertybuffer.rawAddress, propertybuffersize.toLong())

public actual fun winBioUnlockUnit(sessionhandle: UInt, unitid: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(sessionhandle.toInt(), unitid.toInt())

public actual fun winBioUnregisterEventMonitor(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(sessionhandle.toInt())

public actual fun winBioVerify(sessionhandle: UInt, identity: ConstPtr, subfactor: UByte, unitid: MutPtr, match: MutPtr, rejectdetail: MutPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioVerify(sessionhandle.toInt(), identity.rawAddress, subfactor.toByte(), unitid.rawAddress, match.rawAddress, rejectdetail.rawAddress)

public actual fun winBioVerifyWithCallback(sessionhandle: UInt, identity: ConstPtr, subfactor: UByte, verifycallback: PwinbioVerifyCallback, verifycallbackcontext: ConstPtr): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback(sessionhandle.toInt(), identity.rawAddress, subfactor.toByte(), 0L, verifycallbackcontext.rawAddress)

public actual fun winBioWait(sessionhandle: UInt): Hresult =
    WindowsWin32DevicesBiometricframeworkJniBridge.windowssysWindowsWin32DevicesBiometricframeworkWinBioWait(sessionhandle.toInt())
