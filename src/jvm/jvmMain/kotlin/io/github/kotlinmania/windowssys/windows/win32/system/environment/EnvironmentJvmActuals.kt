@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemEnvironmentJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_CallEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: Int, lpreturnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_CreateEnclave(hprocess: Long, lpaddress: Long, dwsize: Long, dwinitialcommitment: Long, flenclavetype: Int, lpenclaveinformation: Long, dwinfolength: Int, lpenclaveerror: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_CreateEnvironmentBlock(lpenvironment: Long, htoken: Long, binherit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_DeleteEnclave(lpaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_DestroyEnvironmentBlock(lpenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_EnclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: Int, outputsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_EnclaveGetEnclaveInformation(informationsize: Int, enclaveinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_EnclaveSealData(datatoencrypt: Long, datatoencryptsize: Int, identitypolicy: Int, runtimepolicy: Int, protectedblob: Long, buffersize: Int, protectedblobsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_EnclaveUnsealData(protectedblob: Long, protectedblobsize: Int, decrypteddata: Long, buffersize: Int, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_EnclaveVerifyAttestationReport(enclavetype: Int, report: Long, reportsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_ExpandEnvironmentStringsA(lpsrc: Long, lpdst: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserA(htoken: Long, lpsrc: Long, lpdest: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserW(htoken: Long, lpsrc: Long, lpdest: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_ExpandEnvironmentStringsW(lpsrc: Long, lpdst: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_FreeEnvironmentStringsA(penv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_FreeEnvironmentStringsW(penv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_GetCommandLineA(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_GetCommandLineW(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_GetCurrentDirectoryA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_GetCurrentDirectoryW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_GetEnvironmentStrings(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_GetEnvironmentStringsW(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_GetEnvironmentVariableA(lpname: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_GetEnvironmentVariableW(lpname: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_InitializeEnclave(hprocess: Long, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: Int, lpenclaveerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_IsEnclaveTypeSupported(flenclavetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_LoadEnclaveData(hprocess: Long, lpaddress: Long, lpbuffer: Long, nsize: Long, flprotect: Int, lppageinformation: Long, dwinfolength: Int, lpnumberofbyteswritten: Long, lpenclaveerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_LoadEnclaveImageA(lpenclaveaddress: Long, lpimagename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_LoadEnclaveImageW(lpenclaveaddress: Long, lpimagename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathA(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathW(exename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_SetCurrentDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_SetCurrentDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_SetEnvironmentStringsW(newenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_SetEnvironmentVariableA(lpname: Long, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_SetEnvironmentVariableW(lpname: Long, lpvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_environment_TerminateEnclave(lpaddress: Long, fwait: Int): Int
}

public actual fun CallEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: BOOL, lpreturnvalue: Long): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_CallEnclave(lproutine, lpparameter, fwaitforthread, lpreturnvalue)

public actual fun CreateEnclave(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): Long =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_CreateEnclave(hprocess, lpaddress, dwsize.toLong(), dwinitialcommitment.toLong(), flenclavetype.toInt(), lpenclaveinformation, dwinfolength.toInt(), lpenclaveerror)

public actual fun CreateEnvironmentBlock(lpenvironment: Long, htoken: HANDLE, binherit: BOOL): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_CreateEnvironmentBlock(lpenvironment, htoken, binherit)

public actual fun DeleteEnclave(lpaddress: Long): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_DeleteEnclave(lpaddress)

public actual fun DestroyEnvironmentBlock(lpenvironment: Long): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_DestroyEnvironmentBlock(lpenvironment)

public actual fun EnclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: UInt, outputsize: Long): HRESULT =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_EnclaveGetAttestationReport(enclavedata, report, buffersize.toInt(), outputsize)

public actual fun EnclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: Long): HRESULT =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_EnclaveGetEnclaveInformation(informationsize.toInt(), enclaveinformation)

public actual fun EnclaveSealData(datatoencrypt: Long, datatoencryptsize: UInt, identitypolicy: ENCLAVE_SEALING_IDENTITY_POLICY, runtimepolicy: UInt, protectedblob: Long, buffersize: UInt, protectedblobsize: Long): HRESULT =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_EnclaveSealData(datatoencrypt, datatoencryptsize.toInt(), identitypolicy, runtimepolicy.toInt(), protectedblob, buffersize.toInt(), protectedblobsize)

public actual fun EnclaveUnsealData(protectedblob: Long, protectedblobsize: UInt, decrypteddata: Long, buffersize: UInt, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): HRESULT =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_EnclaveUnsealData(protectedblob, protectedblobsize.toInt(), decrypteddata, buffersize.toInt(), decrypteddatasize, sealingidentity, unsealingflags)

public actual fun EnclaveVerifyAttestationReport(enclavetype: UInt, report: Long, reportsize: UInt): HRESULT =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_EnclaveVerifyAttestationReport(enclavetype.toInt(), report, reportsize.toInt())

public actual fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsA(lpsrc, lpdst, nsize.toInt()).toUInt()

public actual fun ExpandEnvironmentStringsForUserA(htoken: HANDLE, lpsrc: PCSTR, lpdest: PSTR, dwsize: UInt): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserA(htoken, lpsrc, lpdest, dwsize.toInt())

public actual fun ExpandEnvironmentStringsForUserW(htoken: HANDLE, lpsrc: PCWSTR, lpdest: PWSTR, dwsize: UInt): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserW(htoken, lpsrc, lpdest, dwsize.toInt())

public actual fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsW(lpsrc, lpdst, nsize.toInt()).toUInt()

public actual fun FreeEnvironmentStringsA(penv: PCSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_FreeEnvironmentStringsA(penv)

public actual fun FreeEnvironmentStringsW(penv: PCWSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_FreeEnvironmentStringsW(penv)

public actual fun GetCommandLineA(): PCSTR =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_GetCommandLineA()

public actual fun GetCommandLineW(): PCWSTR =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_GetCommandLineW()

public actual fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_GetCurrentDirectoryA(nbufferlength.toInt(), lpbuffer).toUInt()

public actual fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_GetCurrentDirectoryW(nbufferlength.toInt(), lpbuffer).toUInt()

public actual fun GetEnvironmentStrings(): PSTR =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_GetEnvironmentStrings()

public actual fun GetEnvironmentStringsW(): PWSTR =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_GetEnvironmentStringsW()

public actual fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_GetEnvironmentVariableA(lpname, lpbuffer, nsize.toInt()).toUInt()

public actual fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_GetEnvironmentVariableW(lpname, lpbuffer, nsize.toInt()).toUInt()

public actual fun InitializeEnclave(hprocess: HANDLE, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_InitializeEnclave(hprocess, lpaddress, lpenclaveinformation, dwinfolength.toInt(), lpenclaveerror)

public actual fun IsEnclaveTypeSupported(flenclavetype: UInt): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_IsEnclaveTypeSupported(flenclavetype.toInt())

public actual fun LoadEnclaveData(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, nsize: ULong, flprotect: UInt, lppageinformation: Long, dwinfolength: UInt, lpnumberofbyteswritten: Long, lpenclaveerror: Long): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_LoadEnclaveData(hprocess, lpaddress, lpbuffer, nsize.toLong(), flprotect.toInt(), lppageinformation, dwinfolength.toInt(), lpnumberofbyteswritten, lpenclaveerror)

public actual fun LoadEnclaveImageA(lpenclaveaddress: Long, lpimagename: PCSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_LoadEnclaveImageA(lpenclaveaddress, lpimagename)

public actual fun LoadEnclaveImageW(lpenclaveaddress: Long, lpimagename: PCWSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_LoadEnclaveImageW(lpenclaveaddress, lpimagename)

public actual fun NeedCurrentDirectoryForExePathA(exename: PCSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathA(exename)

public actual fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathW(exename)

public actual fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_SetCurrentDirectoryA(lppathname)

public actual fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_SetCurrentDirectoryW(lppathname)

public actual fun SetEnvironmentStringsW(newenvironment: PCWSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_SetEnvironmentStringsW(newenvironment)

public actual fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_SetEnvironmentVariableA(lpname, lpvalue)

public actual fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_SetEnvironmentVariableW(lpname, lpvalue)

public actual fun TerminateEnclave(lpaddress: Long, fwait: BOOL): BOOL =
    WindowsWin32SystemEnvironmentJniBridge.windowssys_windows_win32_system_environment_TerminateEnclave(lpaddress, fwait)
