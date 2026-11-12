@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemEnvironmentJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentCallEnclave(lproutine: Long, lpparameter: Long, fwaitforthread: Int, lpreturnvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentCreateEnclave(hprocess: Long, lpaddress: Long, dwsize: Long, dwinitialcommitment: Long, flenclavetype: Int, lpenclaveinformation: Long, dwinfolength: Int, lpenclaveerror: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(lpenvironment: Long, htoken: Long, binherit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentDeleteEnclave(lpaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(lpenvironment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(enclavedata: Long, report: Long, buffersize: Int, outputsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(informationsize: Int, enclaveinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentEnclaveSealData(datatoencrypt: Long, datatoencryptsize: Int, identitypolicy: Int, runtimepolicy: Int, protectedblob: Long, buffersize: Int, protectedblobsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(protectedblob: Long, protectedblobsize: Int, decrypteddata: Long, buffersize: Int, decrypteddatasize: Long, sealingidentity: Long, unsealingflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(enclavetype: Int, report: Long, reportsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(lpsrc: Long, lpdst: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(htoken: Long, lpsrc: Long, lpdest: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(htoken: Long, lpsrc: Long, lpdest: Long, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(lpsrc: Long, lpdst: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(penv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(penv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentGetCommandLineA(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentGetCommandLineW(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(lpname: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(lpname: Long, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentInitializeEnclave(hprocess: Long, lpaddress: Long, lpenclaveinformation: Long, dwinfolength: Int, lpenclaveerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(flenclavetype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentLoadEnclaveData(hprocess: Long, lpaddress: Long, lpbuffer: Long, nsize: Long, flprotect: Int, lppageinformation: Long, dwinfolength: Int, lpnumberofbyteswritten: Long, lpenclaveerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(lpenclaveaddress: Long, lpimagename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(lpenclaveaddress: Long, lpimagename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(exename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(newenvironment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(lpname: Long, lpvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(lpname: Long, lpvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEnvironmentTerminateEnclave(lpaddress: Long, fwait: Int): Int
}

public actual fun callEnclave(lproutine: Long, lpparameter: ConstPtr, fwaitforthread: Bool, lpreturnvalue: MutPtr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentCallEnclave(lproutine, lpparameter.rawAddress, fwaitforthread, lpreturnvalue.rawAddress)

public actual fun createEnclave(hprocess: Handle, lpaddress: ConstPtr, dwsize: ULong, dwinitialcommitment: ULong, flenclavetype: UInt, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentCreateEnclave(hprocess.rawAddress, lpaddress.rawAddress, dwsize.toLong(), dwinitialcommitment.toLong(), flenclavetype.toInt(), lpenclaveinformation.rawAddress, dwinfolength.toInt(), lpenclaveerror.rawAddress))

public actual fun createEnvironmentBlock(lpenvironment: MutPtr, htoken: Handle, binherit: Bool): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(lpenvironment.rawAddress, htoken.rawAddress, binherit)

public actual fun deleteEnclave(lpaddress: ConstPtr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentDeleteEnclave(lpaddress.rawAddress)

public actual fun destroyEnvironmentBlock(lpenvironment: ConstPtr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(lpenvironment.rawAddress)

public actual fun enclaveGetAttestationReport(enclavedata: ConstPtr, report: MutPtr, buffersize: UInt, outputsize: MutPtr): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(enclavedata.rawAddress, report.rawAddress, buffersize.toInt(), outputsize.rawAddress)

public actual fun enclaveGetEnclaveInformation(informationsize: UInt, enclaveinformation: MutPtr): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(informationsize.toInt(), enclaveinformation.rawAddress)

public actual fun enclaveSealData(datatoencrypt: ConstPtr, datatoencryptsize: UInt, identitypolicy: EnclaveSealingIdentityPolicy, runtimepolicy: UInt, protectedblob: MutPtr, buffersize: UInt, protectedblobsize: MutPtr): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentEnclaveSealData(datatoencrypt.rawAddress, datatoencryptsize.toInt(), identitypolicy, runtimepolicy.toInt(), protectedblob.rawAddress, buffersize.toInt(), protectedblobsize.rawAddress)

public actual fun enclaveUnsealData(protectedblob: ConstPtr, protectedblobsize: UInt, decrypteddata: MutPtr, buffersize: UInt, decrypteddatasize: MutPtr, sealingidentity: MutPtr, unsealingflags: MutPtr): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(protectedblob.rawAddress, protectedblobsize.toInt(), decrypteddata.rawAddress, buffersize.toInt(), decrypteddatasize.rawAddress, sealingidentity.rawAddress, unsealingflags.rawAddress)

public actual fun enclaveVerifyAttestationReport(enclavetype: UInt, report: ConstPtr, reportsize: UInt): Hresult =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(enclavetype.toInt(), report.rawAddress, reportsize.toInt())

public actual fun expandEnvironmentStringsA(lpsrc: Pcstr, lpdst: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(lpsrc.rawAddress, lpdst.rawAddress, nsize.toInt()).toUInt()

public actual fun expandEnvironmentStringsForUserA(htoken: Handle, lpsrc: Pcstr, lpdest: Pstr, dwsize: UInt): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(htoken.rawAddress, lpsrc.rawAddress, lpdest.rawAddress, dwsize.toInt())

public actual fun expandEnvironmentStringsForUserW(htoken: Handle, lpsrc: Pcwstr, lpdest: Pwstr, dwsize: UInt): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(htoken.rawAddress, lpsrc.rawAddress, lpdest.rawAddress, dwsize.toInt())

public actual fun expandEnvironmentStringsW(lpsrc: Pcwstr, lpdst: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(lpsrc.rawAddress, lpdst.rawAddress, nsize.toInt()).toUInt()

public actual fun freeEnvironmentStringsA(penv: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(penv.rawAddress)

public actual fun freeEnvironmentStringsW(penv: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(penv.rawAddress)

public actual fun getCommandLineA(): Pcstr =
    ConstPtr(WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentGetCommandLineA())

public actual fun getCommandLineW(): Pcwstr =
    ConstPtr(WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentGetCommandLineW())

public actual fun getCurrentDirectoryA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(nbufferlength.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun getCurrentDirectoryW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(nbufferlength.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun getEnvironmentStrings(): Pstr =
    MutPtr(WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings())

public actual fun getEnvironmentStringsW(): Pwstr =
    MutPtr(WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW())

public actual fun getEnvironmentVariableA(lpname: Pcstr, lpbuffer: Pstr, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(lpname.rawAddress, lpbuffer.rawAddress, nsize.toInt()).toUInt()

public actual fun getEnvironmentVariableW(lpname: Pcwstr, lpbuffer: Pwstr, nsize: UInt): UInt =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(lpname.rawAddress, lpbuffer.rawAddress, nsize.toInt()).toUInt()

public actual fun initializeEnclave(hprocess: Handle, lpaddress: ConstPtr, lpenclaveinformation: ConstPtr, dwinfolength: UInt, lpenclaveerror: MutPtr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentInitializeEnclave(hprocess.rawAddress, lpaddress.rawAddress, lpenclaveinformation.rawAddress, dwinfolength.toInt(), lpenclaveerror.rawAddress)

public actual fun isEnclaveTypeSupported(flenclavetype: UInt): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(flenclavetype.toInt())

public actual fun loadEnclaveData(hprocess: Handle, lpaddress: ConstPtr, lpbuffer: ConstPtr, nsize: ULong, flprotect: UInt, lppageinformation: ConstPtr, dwinfolength: UInt, lpnumberofbyteswritten: MutPtr, lpenclaveerror: MutPtr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentLoadEnclaveData(hprocess.rawAddress, lpaddress.rawAddress, lpbuffer.rawAddress, nsize.toLong(), flprotect.toInt(), lppageinformation.rawAddress, dwinfolength.toInt(), lpnumberofbyteswritten.rawAddress, lpenclaveerror.rawAddress)

public actual fun loadEnclaveImageA(lpenclaveaddress: ConstPtr, lpimagename: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(lpenclaveaddress.rawAddress, lpimagename.rawAddress)

public actual fun loadEnclaveImageW(lpenclaveaddress: ConstPtr, lpimagename: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(lpenclaveaddress.rawAddress, lpimagename.rawAddress)

public actual fun needCurrentDirectoryForExePathA(exename: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(exename.rawAddress)

public actual fun needCurrentDirectoryForExePathW(exename: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(exename.rawAddress)

public actual fun setCurrentDirectoryA(lppathname: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(lppathname.rawAddress)

public actual fun setCurrentDirectoryW(lppathname: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(lppathname.rawAddress)

public actual fun setEnvironmentStringsW(newenvironment: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(newenvironment.rawAddress)

public actual fun setEnvironmentVariableA(lpname: Pcstr, lpvalue: Pcstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(lpname.rawAddress, lpvalue.rawAddress)

public actual fun setEnvironmentVariableW(lpname: Pcwstr, lpvalue: Pcwstr): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(lpname.rawAddress, lpvalue.rawAddress)

public actual fun terminateEnclave(lpaddress: ConstPtr, fwait: Bool): Bool =
    WindowsWin32SystemEnvironmentJniBridge.windowssysWindowsWin32SystemEnvironmentTerminateEnclave(lpaddress.rawAddress, fwait)
