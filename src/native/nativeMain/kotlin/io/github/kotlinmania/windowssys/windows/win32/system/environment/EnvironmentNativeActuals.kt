@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentCallEnclave
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentCreateEnclave
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentDeleteEnclave
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentEnclaveSealData
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentGetCommandLineA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentGetCommandLineW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentInitializeEnclave
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentLoadEnclaveData
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.cinterop.windowssysWindowsWin32SystemEnvironmentTerminateEnclave
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun callEnclave(lproutine: Long, lpparameter: ConstPtr, fwaitforthread: Bool, lpreturnvalue: MutPtr): Bool =
    windowssysWindowsWin32SystemEnvironmentCallEnclave(lproutine, lpparameter.rawAddress.toCPointer<ByteVar>(), fwaitforthread, lpreturnvalue.rawAddress.toCPointer<ByteVar>())

public actual fun createEnclave(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemEnvironmentCreateEnclave(hprocess.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), dwsize, dwinitialcommitment, flenclavetype, lpenclaveinformation.rawAddress.toCPointer<ByteVar>(), dwinfolength, lpenclaveerror.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createEnvironmentBlock(lpenvironment: MutPtr, htoken: Handle, binherit: Bool): Bool =
    windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(lpenvironment.rawAddress.toCPointer<ByteVar>(), htoken.rawAddress.toCPointer<ByteVar>(), binherit)

public actual fun deleteEnclave(lpaddress: ConstPtr): Bool =
    windowssysWindowsWin32SystemEnvironmentDeleteEnclave(lpaddress.rawAddress.toCPointer<ByteVar>())

public actual fun destroyEnvironmentBlock(lpenvironment: ConstPtr): Bool =
    windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(lpenvironment.rawAddress.toCPointer<ByteVar>())

public actual fun enclaveGetAttestationReport(enclavedata: ConstPtr, report: MutPtr, buffersize: UInt, outputsize: MutPtr): Hresult =
    windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(enclavedata.rawAddress.toCPointer<ByteVar>(), report.rawAddress.toCPointer<ByteVar>(), buffersize, outputsize.rawAddress.toCPointer<ByteVar>())

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: MutPtr): Hresult =
    windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(informationsize, enclaveinformation.rawAddress.toCPointer<ByteVar>())

public actual fun enclaveSealData(datatoencrypt: ConstPtr, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: MutPtr, buffersize: UInt, protectedblobsize: MutPtr): Hresult =
    windowssysWindowsWin32SystemEnvironmentEnclaveSealData(datatoencrypt.rawAddress.toCPointer<ByteVar>(), datatoencryptsize, identitypolicy, runtimepolicy, protectedblob.rawAddress.toCPointer<ByteVar>(), buffersize, protectedblobsize.rawAddress.toCPointer<ByteVar>())

public actual fun enclaveUnsealData(protectedblob: ConstPtr, protectedblobsize: UInt, decrypteddata: MutPtr, buffersize: UInt, decrypteddatasize: MutPtr, sealingidentity: MutPtr, unsealingflags: MutPtr): Hresult =
    windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(protectedblob.rawAddress.toCPointer<ByteVar>(), protectedblobsize, decrypteddata.rawAddress.toCPointer<ByteVar>(), buffersize, decrypteddatasize.rawAddress.toCPointer<ByteVar>(), sealingidentity.rawAddress.toCPointer<ByteVar>(), unsealingflags.rawAddress.toCPointer<ByteVar>())

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: ConstPtr, reportsize: UInt): Hresult =
    windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(enclavetype, report.rawAddress.toCPointer<ByteVar>(), reportsize)

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(lpsrc.rawAddress.toCPointer<ByteVar>(), lpdst.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(htoken.rawAddress.toCPointer<ByteVar>(), lpsrc.rawAddress.toCPointer<ByteVar>(), lpdest.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(htoken.rawAddress.toCPointer<ByteVar>(), lpsrc.rawAddress.toCPointer<ByteVar>(), lpdest.rawAddress.toCPointer<ByteVar>(), dwsize)

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(lpsrc.rawAddress.toCPointer<ByteVar>(), lpdst.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(penv.rawAddress.toCPointer<ByteVar>())

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(penv.rawAddress.toCPointer<ByteVar>())

public actual fun getCommandLineA(): Pcstr =
    ConstPtr(windowssysWindowsWin32SystemEnvironmentGetCommandLineA()?.toLong() ?: 0L)

public actual fun getCommandLineW(): Pcwstr =
    ConstPtr(windowssysWindowsWin32SystemEnvironmentGetCommandLineW()?.toLong() ?: 0L)

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(nbufferlength, lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(nbufferlength, lpbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getEnvironmentStrings(): Pstr =
    MutPtr(windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings()?.toLong() ?: 0L)

public actual fun getEnvironmentStringsW(): Pwstr =
    MutPtr(windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW()?.toLong() ?: 0L)

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(lpname.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(lpname.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun initializeEnclave(hprocess: Handle, lpaddress: ConstPtr, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): Bool =
    windowssysWindowsWin32SystemEnvironmentInitializeEnclave(hprocess.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), lpenclaveinformation.rawAddress.toCPointer<ByteVar>(), dwinfolength, lpenclaveerror.rawAddress.toCPointer<ByteVar>())

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(flenclavetype)

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: ConstPtr, nsize: ULong, flprotect: UInt, lppageinformation: ConstPtr, dwinfolength: UInt, lpnumberofbyteswritten: MutPtr, lpenclaveerror: MutPtr): Bool =
    windowssysWindowsWin32SystemEnvironmentLoadEnclaveData(hprocess.rawAddress.toCPointer<ByteVar>(), lpaddress.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize, flprotect, lppageinformation.rawAddress.toCPointer<ByteVar>(), dwinfolength, lpnumberofbyteswritten.rawAddress.toCPointer<ByteVar>(), lpenclaveerror.rawAddress.toCPointer<ByteVar>())

public actual fun loadEnclaveImageA(lpenclaveaddress: ConstPtr, lpimagename: Pcstr): Bool =
    windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(lpenclaveaddress.rawAddress.toCPointer<ByteVar>(), lpimagename.rawAddress.toCPointer<ByteVar>())

public actual fun loadEnclaveImageW(lpenclaveaddress: ConstPtr, lpimagename: Pcwstr): Bool =
    windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(lpenclaveaddress.rawAddress.toCPointer<ByteVar>(), lpimagename.rawAddress.toCPointer<ByteVar>())

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(exename.rawAddress.toCPointer<ByteVar>())

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(exename.rawAddress.toCPointer<ByteVar>())

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(lppathname.rawAddress.toCPointer<ByteVar>())

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(lppathname.rawAddress.toCPointer<ByteVar>())

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(newenvironment.rawAddress.toCPointer<ByteVar>())

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(lpname.rawAddress.toCPointer<ByteVar>(), lpvalue.rawAddress.toCPointer<ByteVar>())

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(lpname.rawAddress.toCPointer<ByteVar>(), lpvalue.rawAddress.toCPointer<ByteVar>())

public actual fun terminateEnclave(lpaddress: ConstPtr, fwait: Bool): Bool =
    windowssysWindowsWin32SystemEnvironmentTerminateEnclave(lpaddress.rawAddress.toCPointer<ByteVar>(), fwait)
