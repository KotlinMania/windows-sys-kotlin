@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemEnvironmentJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_callEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: Int, lpreturnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_createEnclave(hprocess: Long, lpaddress: Long, dwsize: Long, dwinitialcommitment: Long, flenclavetype: Int, lpenclaveinformation: Long, dwinfolength: Int, lpenclaveerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_createEnvironmentBlock(lpenvironment: Long, htoken: Long, binherit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_deleteEnclave(lpaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_destroyEnvironmentBlock(lpenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_enclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: Int, outputsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_enclaveGetEnclaveInformation(informationsize: Int, enclaveinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_enclaveSealData(datatoencrypt: Long, datatoencryptsize: Int, identitypolicy: Int, runtimepolicy: Int, protectedblob: Long, buffersize: Int, protectedblobsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_enclaveUnsealData(protectedblob: Long, protectedblobsize: Int, decrypteddata: Long, buffersize: Int, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_enclaveVerifyAttestationReport(enclavetype: Int, report: Long, reportsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_expandEnvironmentStringsA(lpsrc: Long, lpdst: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserA(htoken: Long, lpsrc: Long, lpdest: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserW(htoken: Long, lpsrc: Long, lpdest: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_expandEnvironmentStringsW(lpsrc: Long, lpdst: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_freeEnvironmentStringsA(penv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_freeEnvironmentStringsW(penv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_getCommandLineA(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_getCommandLineW(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_getCurrentDirectoryA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_getCurrentDirectoryW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_getEnvironmentStrings(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_getEnvironmentStringsW(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_getEnvironmentVariableA(lpname: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_getEnvironmentVariableW(lpname: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_initializeEnclave(hprocess: Long, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: Int, lpenclaveerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_isEnclaveTypeSupported(flenclavetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_loadEnclaveData(hprocess: Long, lpaddress: Long, lpbuffer: Long, nsize: Long, flprotect: Int, lppageinformation: Long, dwinfolength: Int, lpnumberofbyteswritten: Long, lpenclaveerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_loadEnclaveImageA(lpenclaveaddress: Long, lpimagename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_loadEnclaveImageW(lpenclaveaddress: Long, lpimagename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathA(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathW(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_setCurrentDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_setCurrentDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_setEnvironmentStringsW(newenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_setEnvironmentVariableA(lpname: Long, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_setEnvironmentVariableW(lpname: Long, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_terminateEnclave(lpaddress: Long, fwait: Int): Int
}

public actual fun callEnclave(lproutine: Long, lpparameter: COpaquePointer?, fwaitforthread: Bool, lpreturnvalue: COpaquePointer?): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_callEnclave(lproutine, (lpparameter?.value ?: 0L), fwaitforthread, (lpreturnvalue?.value ?: 0L))

public actual fun createEnclave(hprocess: Handle, lpaddress: COpaquePointer?, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_createEnclave((hprocess?.value ?: 0L), (lpaddress?.value ?: 0L), dwsize.toLong(), dwinitialcommitment.toLong(), flenclavetype.toInt(), (lpenclaveinformation?.value ?: 0L), dwinfolength.toInt(), (lpenclaveerror?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEnvironmentBlock(lpenvironment: COpaquePointer?, htoken: Handle, binherit: Bool): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_createEnvironmentBlock((lpenvironment?.value ?: 0L), (htoken?.value ?: 0L), binherit)

public actual fun deleteEnclave(lpaddress: COpaquePointer?): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_deleteEnclave((lpaddress?.value ?: 0L))

public actual fun destroyEnvironmentBlock(lpenvironment: COpaquePointer?): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_destroyEnvironmentBlock((lpenvironment?.value ?: 0L))

public actual fun enclaveGetAttestationReport(enclavedata: COpaquePointer?, report: COpaquePointer?, buffersize: UInt, outputsize: COpaquePointer?): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_enclaveGetAttestationReport((enclavedata?.value ?: 0L), (report?.value ?: 0L), buffersize.toInt(), (outputsize?.value ?: 0L))

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: COpaquePointer?): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_enclaveGetEnclaveInformation(informationsize.toInt(), (enclaveinformation?.value ?: 0L))

public actual fun enclaveSealData(datatoencrypt: COpaquePointer?, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: COpaquePointer?, buffersize: UInt, protectedblobsize: COpaquePointer?): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_enclaveSealData((datatoencrypt?.value ?: 0L), datatoencryptsize.toInt(), identitypolicy, runtimepolicy.toInt(), (protectedblob?.value ?: 0L), buffersize.toInt(), (protectedblobsize?.value ?: 0L))

public actual fun enclaveUnsealData(protectedblob: COpaquePointer?, protectedblobsize: UInt, decrypteddata: COpaquePointer?, buffersize: UInt, decrypteddatasize: COpaquePointer?, sealingidentity: COpaquePointer?, unsealingflags: COpaquePointer?): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_enclaveUnsealData((protectedblob?.value ?: 0L), protectedblobsize.toInt(), (decrypteddata?.value ?: 0L), buffersize.toInt(), (decrypteddatasize?.value ?: 0L), (sealingidentity?.value ?: 0L), (unsealingflags?.value ?: 0L))

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: COpaquePointer?, reportsize: UInt): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_enclaveVerifyAttestationReport(enclavetype.toInt(), (report?.value ?: 0L), reportsize.toInt())

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_expandEnvironmentStringsA((lpsrc?.value ?: 0L), (lpdst?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserA((htoken?.value ?: 0L), (lpsrc?.value ?: 0L), (lpdest?.value ?: 0L), dwsize.toInt())

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_expandEnvironmentStringsForUserW((htoken?.value ?: 0L), (lpsrc?.value ?: 0L), (lpdest?.value ?: 0L), dwsize.toInt())

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_expandEnvironmentStringsW((lpsrc?.value ?: 0L), (lpdst?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_freeEnvironmentStringsA((penv?.value ?: 0L))

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_freeEnvironmentStringsW((penv?.value ?: 0L))

public actual fun getCommandLineA(): Pcstr =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_getCommandLineA().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCommandLineW(): Pcwstr =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_getCommandLineW().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_getCurrentDirectoryA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_getCurrentDirectoryW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun getEnvironmentStrings(): Pstr =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_getEnvironmentStrings().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getEnvironmentStringsW(): Pwstr =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_getEnvironmentStringsW().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_getEnvironmentVariableA((lpname?.value ?: 0L), (lpbuffer?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_getEnvironmentVariableW((lpname?.value ?: 0L), (lpbuffer?.value ?: 0L), nsize.toInt()).toUInt()

public actual fun initializeEnclave(hprocess: Handle, lpaddress: COpaquePointer?, lpenclaveinformation: COpaquePointer?, dwinfolength: UInt, lpenclaveerror: COpaquePointer?): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_initializeEnclave((hprocess?.value ?: 0L), (lpaddress?.value ?: 0L), (lpenclaveinformation?.value ?: 0L), dwinfolength.toInt(), (lpenclaveerror?.value ?: 0L))

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_isEnclaveTypeSupported(flenclavetype.toInt())

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: COpaquePointer?, lpbuffer: COpaquePointer?, nsize: ULong, flprotect: UInt, lppageinformation: COpaquePointer?, dwinfolength: UInt, lpnumberofbyteswritten: COpaquePointer?, lpenclaveerror: COpaquePointer?): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_loadEnclaveData((hprocess?.value ?: 0L), (lpaddress?.value ?: 0L), (lpbuffer?.value ?: 0L), nsize.toLong(), flprotect.toInt(), (lppageinformation?.value ?: 0L), dwinfolength.toInt(), (lpnumberofbyteswritten?.value ?: 0L), (lpenclaveerror?.value ?: 0L))

public actual fun loadEnclaveImageA(lpenclaveaddress: COpaquePointer?, lpimagename: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_loadEnclaveImageA((lpenclaveaddress?.value ?: 0L), (lpimagename?.value ?: 0L))

public actual fun loadEnclaveImageW(lpenclaveaddress: COpaquePointer?, lpimagename: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_loadEnclaveImageW((lpenclaveaddress?.value ?: 0L), (lpimagename?.value ?: 0L))

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathA((exename?.value ?: 0L))

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_needCurrentDirectoryForExePathW((exename?.value ?: 0L))

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_setCurrentDirectoryA((lppathname?.value ?: 0L))

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_setCurrentDirectoryW((lppathname?.value ?: 0L))

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_setEnvironmentStringsW((newenvironment?.value ?: 0L))

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_setEnvironmentVariableA((lpname?.value ?: 0L), (lpvalue?.value ?: 0L))

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_setEnvironmentVariableW((lpname?.value ?: 0L), (lpvalue?.value ?: 0L))

public actual fun terminateEnclave(lpaddress: COpaquePointer?, fwait: Bool): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_terminateEnclave((lpaddress?.value ?: 0L), fwait)
