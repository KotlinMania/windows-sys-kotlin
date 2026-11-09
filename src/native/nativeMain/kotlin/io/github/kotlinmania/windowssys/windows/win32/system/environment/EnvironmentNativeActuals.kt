@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CallEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: BOOL, lpreturnvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_CallEnclave(lproutine, lpparameter.toCPointer<ByteVar>(), fwaitforthread, lpreturnvalue.toCPointer<ByteVar>())

public actual fun CreateEnclave(hprocess: HANDLE, lpaddress: Long, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_CreateEnclave(hprocess.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), dwsize, dwinitialcommitment, flenclavetype, lpenclaveinformation.toCPointer<ByteVar>(), dwinfolength, lpenclaveerror.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateEnvironmentBlock(lpenvironment: Long, htoken: HANDLE, binherit: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_CreateEnvironmentBlock(lpenvironment.toCPointer<ByteVar>(), htoken.toCPointer<ByteVar>(), binherit)

public actual fun DeleteEnclave(lpaddress: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_DeleteEnclave(lpaddress.toCPointer<ByteVar>())

public actual fun DestroyEnvironmentBlock(lpenvironment: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_DestroyEnvironmentBlock(lpenvironment.toCPointer<ByteVar>())

public actual fun EnclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: UInt, outputsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_EnclaveGetAttestationReport(enclavedata.toCPointer<ByteVar>(), report.toCPointer<ByteVar>(), buffersize, outputsize.toCPointer<ByteVar>())

public actual fun EnclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_EnclaveGetEnclaveInformation(informationsize, enclaveinformation.toCPointer<ByteVar>())

public actual fun EnclaveSealData(datatoencrypt: Long, datatoencryptsize: UInt, identitypolicy: ENCLAVE_SEALING_IDENTITY_POLICY, runtimepolicy: UInt, protectedblob: Long, buffersize: UInt, protectedblobsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_EnclaveSealData(datatoencrypt.toCPointer<ByteVar>(), datatoencryptsize, identitypolicy, runtimepolicy, protectedblob.toCPointer<ByteVar>(), buffersize, protectedblobsize.toCPointer<ByteVar>())

public actual fun EnclaveUnsealData(protectedblob: Long, protectedblobsize: UInt, decrypteddata: Long, buffersize: UInt, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_EnclaveUnsealData(protectedblob.toCPointer<ByteVar>(), protectedblobsize, decrypteddata.toCPointer<ByteVar>(), buffersize, decrypteddatasize.toCPointer<ByteVar>(), sealingidentity.toCPointer<ByteVar>(), unsealingflags.toCPointer<ByteVar>())

public actual fun EnclaveVerifyAttestationReport(enclavetype: UInt, report: Long, reportsize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_EnclaveVerifyAttestationReport(enclavetype, report.toCPointer<ByteVar>(), reportsize)

public actual fun ExpandEnvironmentStringsA(lpsrc: PCSTR, lpdst: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsA(lpsrc.toCPointer<ByteVar>(), lpdst.toCPointer<ByteVar>(), nsize)

public actual fun ExpandEnvironmentStringsForUserA(htoken: HANDLE, lpsrc: PCSTR, lpdest: PSTR, dwsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserA(htoken.toCPointer<ByteVar>(), lpsrc.toCPointer<ByteVar>(), lpdest.toCPointer<ByteVar>(), dwsize)

public actual fun ExpandEnvironmentStringsForUserW(htoken: HANDLE, lpsrc: PCWSTR, lpdest: PWSTR, dwsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsForUserW(htoken.toCPointer<ByteVar>(), lpsrc.toCPointer<ByteVar>(), lpdest.toCPointer<ByteVar>(), dwsize)

public actual fun ExpandEnvironmentStringsW(lpsrc: PCWSTR, lpdst: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_ExpandEnvironmentStringsW(lpsrc.toCPointer<ByteVar>(), lpdst.toCPointer<ByteVar>(), nsize)

public actual fun FreeEnvironmentStringsA(penv: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_FreeEnvironmentStringsA(penv.toCPointer<ByteVar>())

public actual fun FreeEnvironmentStringsW(penv: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_FreeEnvironmentStringsW(penv.toCPointer<ByteVar>())

public actual fun GetCommandLineA(): PCSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_GetCommandLineA()?.toLong() ?: 0L

public actual fun GetCommandLineW(): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_GetCommandLineW()?.toLong() ?: 0L

public actual fun GetCurrentDirectoryA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_GetCurrentDirectoryA(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public actual fun GetCurrentDirectoryW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_GetCurrentDirectoryW(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public actual fun GetEnvironmentStrings(): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_GetEnvironmentStrings()?.toLong() ?: 0L

public actual fun GetEnvironmentStringsW(): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_GetEnvironmentStringsW()?.toLong() ?: 0L

public actual fun GetEnvironmentVariableA(lpname: PCSTR, lpbuffer: PSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_GetEnvironmentVariableA(lpname.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nsize)

public actual fun GetEnvironmentVariableW(lpname: PCWSTR, lpbuffer: PWSTR, nsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_GetEnvironmentVariableW(lpname.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nsize)

public actual fun InitializeEnclave(hprocess: HANDLE, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: UInt, lpenclaveerror: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_InitializeEnclave(hprocess.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), lpenclaveinformation.toCPointer<ByteVar>(), dwinfolength, lpenclaveerror.toCPointer<ByteVar>())

public actual fun IsEnclaveTypeSupported(flenclavetype: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_IsEnclaveTypeSupported(flenclavetype)

public actual fun LoadEnclaveData(hprocess: HANDLE, lpaddress: Long, lpbuffer: Long, nsize: ULong, flprotect: UInt, lppageinformation: Long, dwinfolength: UInt, lpnumberofbyteswritten: Long, lpenclaveerror: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_LoadEnclaveData(hprocess.toCPointer<ByteVar>(), lpaddress.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nsize, flprotect, lppageinformation.toCPointer<ByteVar>(), dwinfolength, lpnumberofbyteswritten.toCPointer<ByteVar>(), lpenclaveerror.toCPointer<ByteVar>())

public actual fun LoadEnclaveImageA(lpenclaveaddress: Long, lpimagename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_LoadEnclaveImageA(lpenclaveaddress.toCPointer<ByteVar>(), lpimagename.toCPointer<ByteVar>())

public actual fun LoadEnclaveImageW(lpenclaveaddress: Long, lpimagename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_LoadEnclaveImageW(lpenclaveaddress.toCPointer<ByteVar>(), lpimagename.toCPointer<ByteVar>())

public actual fun NeedCurrentDirectoryForExePathA(exename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathA(exename.toCPointer<ByteVar>())

public actual fun NeedCurrentDirectoryForExePathW(exename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_NeedCurrentDirectoryForExePathW(exename.toCPointer<ByteVar>())

public actual fun SetCurrentDirectoryA(lppathname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_SetCurrentDirectoryA(lppathname.toCPointer<ByteVar>())

public actual fun SetCurrentDirectoryW(lppathname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_SetCurrentDirectoryW(lppathname.toCPointer<ByteVar>())

public actual fun SetEnvironmentStringsW(newenvironment: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_SetEnvironmentStringsW(newenvironment.toCPointer<ByteVar>())

public actual fun SetEnvironmentVariableA(lpname: PCSTR, lpvalue: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_SetEnvironmentVariableA(lpname.toCPointer<ByteVar>(), lpvalue.toCPointer<ByteVar>())

public actual fun SetEnvironmentVariableW(lpname: PCWSTR, lpvalue: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_SetEnvironmentVariableW(lpname.toCPointer<ByteVar>(), lpvalue.toCPointer<ByteVar>())

public actual fun TerminateEnclave(lpaddress: Long, fwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssys_windows_win32_system_environment_TerminateEnclave(lpaddress.toCPointer<ByteVar>(), fwait)
