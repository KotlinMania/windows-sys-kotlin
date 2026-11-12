@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

private object WindowsWin32SystemSysteminformationJniBridge {
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
        val stream = WindowsWin32SystemSysteminformationJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW(hostname: Long, computername: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables(firmwaretableprovidersignature: Int, pfirmwaretableenumbuffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetComputerNameExA(nametype: Int, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetComputerNameExW(nametype: Int, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetFirmwareType(firmwaretype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize(sizeininches: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetLocalTime(lpsystemtime: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation(buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx(relationshiptype: Int, buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo(lpsysteminfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode(pbenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode(flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime(group: Short, buffer: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetProductInfo(dwosmajorversion: Int, dwosminorversion: Int, dwspmajorversion: Int, dwspminorversion: Int, pdwreturnedproducttype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation(information: Long, bufferlength: Int, returnedlength: Long, process: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable(firmwaretableprovidersignature: Int, firmwaretableid: Int, pfirmwaretablebuffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemInfo(lpsysteminfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation(enabled: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemTime(lpsystemtime: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise(lptimeadjustment: Long, lptimeincrement: Long, lptimeadjustmentdisabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime(lpsystemtimeasfiletime: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A(lpbuffer: Long, usize: Int, imagefilemachinetype: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W(lpbuffer: Long, usize: Int, imagefilemachinetype: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetTickCount(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetTickCount64(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetVersion(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetVersionExA(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetVersionExW(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW(lpbuffer: Long, usize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus(lpbuffer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx(lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(usercetenvironment: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported(wowguestmachine: Short, machineissupported: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: Long, puldeviceformbuffersize: Long, devicefamily: Long, deviceform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum(pulluapinfo: Long, puldevicefamily: Long, puldeviceform: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationRtlGetProductInfo(osmajorversion: Int, osminorversion: Int, spmajorversion: Int, spminorversion: Int, returnedproducttype: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData(dataid: Int, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI(versioninfo: Long, typemask: Int, conditionmask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetComputerNameA(lpcomputername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W(nametype: Int, flags: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetComputerNameExA(nametype: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetComputerNameExW(nametype: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetComputerNameW(lpcomputername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetLocalTime(lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetSystemTime(lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(dwtimeadjustment: Int, btimeadjustmentdisabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(dwtimeadjustment: Long, btimeadjustmentdisabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationVerSetConditionMask(conditionmask: Long, typemask: Int, condition: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA(lpversioninformation: Long, dwtypemask: Int, dwlconditionmask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW(lpversioninformation: Long, dwtypemask: Int, dwlconditionmask: Long): Int
}

public actual fun dnsHostnameToComputerNameExW(hostname: Pcwstr, computername: Pwstr, nsize: MutPtr<UInt>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationDnsHostnameToComputerNameExW(hostname.rawAddress, computername.rawAddress, nsize.rawAddress)

public actual fun enumSystemFirmwareTables(firmwaretableprovidersignature: FirmwareTableProvider, pfirmwaretableenumbuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationEnumSystemFirmwareTables(firmwaretableprovidersignature.toInt(), pfirmwaretableenumbuffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun getComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pstr, nsize: MutPtr<UInt>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetComputerNameExA(nametype, lpbuffer.rawAddress, nsize.rawAddress)

public actual fun getComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetComputerNameExW(nametype, lpbuffer.rawAddress, nsize.rawAddress)

public actual fun getDeveloperDriveEnablementState(): DeveloperDriveEnablementState =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetDeveloperDriveEnablementState()

public actual fun getFirmwareType(firmwaretype: MutPtr<FirmwareType>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetFirmwareType(firmwaretype.rawAddress)

public actual fun getIntegratedDisplaySize(sizeininches: MutPtr<Double>): Hresult =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetIntegratedDisplaySize(sizeininches.rawAddress)

public actual fun getLocalTime(lpsystemtime: MutPtr<Systemtime>) {
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetLocalTime(lpsystemtime.rawAddress)
}

public actual fun getLogicalProcessorInformation(buffer: MutPtr<SystemLogicalProcessorInformation>, returnedlength: MutPtr<UInt>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformation(buffer.rawAddress, returnedlength.rawAddress)

public actual fun getLogicalProcessorInformationEx(relationshiptype: LogicalProcessorRelationship, buffer: MutPtr<SystemLogicalProcessorInformationEx>, returnedlength: MutPtr<UInt>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetLogicalProcessorInformationEx(relationshiptype, buffer.rawAddress, returnedlength.rawAddress)

public actual fun getNativeSystemInfo(lpsysteminfo: MutPtr<SystemInfo>) {
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetNativeSystemInfo(lpsysteminfo.rawAddress)
}

public actual fun getOsManufacturingMode(pbenabled: MutPtr<Bool>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetOsManufacturingMode(pbenabled.rawAddress)

public actual fun getOsSafeBootMode(flags: MutPtr<UInt>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetOsSafeBootMode(flags.rawAddress)

public actual fun getPhysicallyInstalledSystemMemory(totalmemoryinkilobytes: MutPtr<ULong>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetPhysicallyInstalledSystemMemory(totalmemoryinkilobytes.rawAddress)

public actual fun getProcessorSystemCycleTime(group: UShort, buffer: MutPtr<SystemProcessorCycleTimeInformation>, returnedlength: MutPtr<UInt>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetProcessorSystemCycleTime(group.toShort(), buffer.rawAddress, returnedlength.rawAddress)

public actual fun getProductInfo(dwosmajorversion: UInt, dwosminorversion: UInt, dwspmajorversion: UInt, dwspminorversion: UInt, pdwreturnedproducttype: MutPtr<OsProductType>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetProductInfo(dwosmajorversion.toInt(), dwosminorversion.toInt(), dwspmajorversion.toInt(), dwspminorversion.toInt(), pdwreturnedproducttype.rawAddress)

public actual fun getSystemCpuSetInformation(information: MutPtr<SystemCpuSetInformation>, bufferlength: UInt, returnedlength: MutPtr<UInt>, process: Handle, flags: UInt): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemCpuSetInformation(information.rawAddress, bufferlength.toInt(), returnedlength.rawAddress, process.rawAddress, flags.toInt())

public actual fun getSystemDEPPolicy(): DepSystemPolicyType =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemDEPPolicy()

public actual fun getSystemDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryA(lpbuffer.rawAddress, usize.toInt()).toUInt()

public actual fun getSystemDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemDirectoryW(lpbuffer.rawAddress, usize.toInt()).toUInt()

public actual fun getSystemFirmwareTable(firmwaretableprovidersignature: FirmwareTableProvider, firmwaretableid: UInt, pfirmwaretablebuffer: MutPtr<UByte>, buffersize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), pfirmwaretablebuffer.rawAddress, buffersize.toInt()).toUInt()

public actual fun getSystemInfo(lpsysteminfo: MutPtr<SystemInfo>) {
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemInfo(lpsysteminfo.rawAddress)
}

public actual fun getSystemLeapSecondInformation(enabled: MutPtr<Bool>, flags: MutPtr<UInt>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemLeapSecondInformation(enabled.rawAddress, flags.rawAddress)

public actual fun getSystemTime(lpsystemtime: MutPtr<Systemtime>) {
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemTime(lpsystemtime.rawAddress)
}

public actual fun getSystemTimeAdjustment(lptimeadjustment: MutPtr<UInt>, lptimeincrement: MutPtr<UInt>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustment(lptimeadjustment.rawAddress, lptimeincrement.rawAddress, lptimeadjustmentdisabled.rawAddress)

public actual fun getSystemTimeAdjustmentPrecise(lptimeadjustment: MutPtr<ULong>, lptimeincrement: MutPtr<ULong>, lptimeadjustmentdisabled: MutPtr<Bool>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAdjustmentPrecise(lptimeadjustment.rawAddress, lptimeincrement.rawAddress, lptimeadjustmentdisabled.rawAddress)

public actual fun getSystemTimeAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>) {
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemTimeAsFileTime(lpsystemtimeasfiletime.rawAddress)
}

public actual fun getSystemTimePreciseAsFileTime(lpsystemtimeasfiletime: MutPtr<Filetime>) {
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemTimePreciseAsFileTime(lpsystemtimeasfiletime.rawAddress)
}

public actual fun getSystemWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryA(lpbuffer.rawAddress, usize.toInt()).toUInt()

public actual fun getSystemWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemWindowsDirectoryW(lpbuffer.rawAddress, usize.toInt()).toUInt()

public actual fun getSystemWow64Directory2A(lpbuffer: Pstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2A(lpbuffer.rawAddress, usize.toInt(), imagefilemachinetype.toShort()).toUInt()

public actual fun getSystemWow64Directory2W(lpbuffer: Pwstr, usize: UInt, imagefilemachinetype: ImageFileMachine): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemWow64Directory2W(lpbuffer.rawAddress, usize.toInt(), imagefilemachinetype.toShort()).toUInt()

public actual fun getSystemWow64DirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryA(lpbuffer.rawAddress, usize.toInt()).toUInt()

public actual fun getSystemWow64DirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetSystemWow64DirectoryW(lpbuffer.rawAddress, usize.toInt()).toUInt()

public actual fun getTickCount(): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetTickCount().toUInt()

public actual fun getTickCount64(): ULong =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetTickCount64().toULong()

public actual fun getVersion(): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetVersion().toUInt()

public actual fun getVersionExA(lpversioninformation: MutPtr<Osversioninfoa>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetVersionExA(lpversioninformation.rawAddress)

public actual fun getVersionExW(lpversioninformation: MutPtr<Osversioninfow>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetVersionExW(lpversioninformation.rawAddress)

public actual fun getWindowsDirectoryA(lpbuffer: Pstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryA(lpbuffer.rawAddress, usize.toInt()).toUInt()

public actual fun getWindowsDirectoryW(lpbuffer: Pwstr, usize: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGetWindowsDirectoryW(lpbuffer.rawAddress, usize.toInt()).toUInt()

public actual fun globalMemoryStatus(lpbuffer: MutPtr<Memorystatus>) {
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatus(lpbuffer.rawAddress)
}

public actual fun globalMemoryStatusEx(lpbuffer: MutPtr<Memorystatusex>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationGlobalMemoryStatusEx(lpbuffer.rawAddress)

public actual fun isUserCetAvailableInEnvironment(usercetenvironment: UserCetEnvironment): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationIsUserCetAvailableInEnvironment(usercetenvironment.toInt())

public actual fun isWow64GuestMachineSupported(wowguestmachine: ImageFileMachine, machineissupported: MutPtr<Bool>): Hresult =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationIsWow64GuestMachineSupported(wowguestmachine.toShort(), machineissupported.rawAddress)

public actual fun rtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize: MutPtr<UInt>, puldeviceformbuffersize: MutPtr<UInt>, devicefamily: Pwstr, deviceform: Pwstr): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationRtlConvertDeviceFamilyInfoToString(puldevicefamilybuffersize.rawAddress, puldeviceformbuffersize.rawAddress, devicefamily.rawAddress, deviceform.rawAddress).toUInt()

public actual fun rtlGetDeviceFamilyInfoEnum(pulluapinfo: MutPtr<ULong>, puldevicefamily: MutPtr<Devicefamilyinfoenum>, puldeviceform: MutPtr<Devicefamilydeviceform>) {
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationRtlGetDeviceFamilyInfoEnum(pulluapinfo.rawAddress, puldevicefamily.rawAddress, puldeviceform.rawAddress)
}

public actual fun rtlGetProductInfo(osmajorversion: UInt, osminorversion: UInt, spmajorversion: UInt, spminorversion: UInt, returnedproducttype: MutPtr<UInt>): Boolean =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationRtlGetProductInfo(osmajorversion.toInt(), osminorversion.toInt(), spmajorversion.toInt(), spminorversion.toInt(), returnedproducttype.rawAddress)

public actual fun rtlGetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: MutPtr<CVoid>, size: UInt): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationRtlGetSystemGlobalData(dataid, buffer.rawAddress, size.toInt()).toUInt()

public actual fun rtlOsDeploymentState(flags: UInt): OsDeployementStateValues =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationRtlOsDeploymentState(flags.toInt())

public actual fun rtlSwitchedVVI(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): UInt =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationRtlSwitchedVVI(versioninfo.rawAddress, typemask.toInt(), conditionmask.toLong()).toUInt()

public actual fun setComputerNameA(lpcomputername: Pcstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetComputerNameA(lpcomputername.rawAddress)

public actual fun setComputerNameEx2W(nametype: ComputerNameFormat, flags: UInt, lpbuffer: Pcwstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetComputerNameEx2W(nametype, flags.toInt(), lpbuffer.rawAddress)

public actual fun setComputerNameExA(nametype: ComputerNameFormat, lpbuffer: Pcstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetComputerNameExA(nametype, lpbuffer.rawAddress)

public actual fun setComputerNameExW(nametype: ComputerNameFormat, lpbuffer: Pcwstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetComputerNameExW(nametype, lpbuffer.rawAddress)

public actual fun setComputerNameW(lpcomputername: Pcwstr): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetComputerNameW(lpcomputername.rawAddress)

public actual fun setLocalTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetLocalTime(lpsystemtime.rawAddress)

public actual fun setSystemTime(lpsystemtime: ConstPtr<Systemtime>): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetSystemTime(lpsystemtime.rawAddress)

public actual fun setSystemTimeAdjustment(dwtimeadjustment: UInt, btimeadjustmentdisabled: Bool): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustment(dwtimeadjustment.toInt(), btimeadjustmentdisabled)

public actual fun setSystemTimeAdjustmentPrecise(dwtimeadjustment: ULong, btimeadjustmentdisabled: Bool): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationSetSystemTimeAdjustmentPrecise(dwtimeadjustment.toLong(), btimeadjustmentdisabled)

public actual fun verSetConditionMask(conditionmask: ULong, typemask: VerFlags, condition: UByte): ULong =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationVerSetConditionMask(conditionmask.toLong(), typemask.toInt(), condition.toByte()).toULong()

public actual fun verifyVersionInfoA(lpversioninformation: MutPtr<Osversioninfoexa>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoA(lpversioninformation.rawAddress, dwtypemask.toInt(), dwlconditionmask.toLong())

public actual fun verifyVersionInfoW(lpversioninformation: MutPtr<Osversioninfoexw>, dwtypemask: VerFlags, dwlconditionmask: ULong): Bool =
    WindowsWin32SystemSysteminformationJniBridge.windowssysWindowsWin32SystemSysteminformationVerifyVersionInfoW(lpversioninformation.rawAddress, dwtypemask.toInt(), dwlconditionmask.toLong())
