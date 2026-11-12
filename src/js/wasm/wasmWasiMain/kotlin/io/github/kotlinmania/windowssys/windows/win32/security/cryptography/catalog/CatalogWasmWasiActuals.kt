@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertStrongSignPara

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun cryptCATAdminAcquireContext(phcatadmin: MutPtr<Long>, pgsubsystem: ConstPtr<Guid>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext")

public actual fun cryptCATAdminAcquireContext2(phcatadmin: MutPtr<Long>, pgsubsystem: ConstPtr<Guid>, pwszhashalgorithm: Pcwstr, pstronghashpolicy: ConstPtr<CertStrongSignPara>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAcquireContext2")

public actual fun cryptCATAdminAddCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, pwszselectbasename: Pcwstr, dwflags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminAddCatalog")

public actual fun cryptCATAdminCalcHashFromFileHandle(hfile: Handle, pcbhash: MutPtr<UInt>, pbhash: MutPtr<UByte>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle")

public actual fun cryptCATAdminCalcHashFromFileHandle2(hcatadmin: Long, hfile: Handle, pcbhash: MutPtr<UInt>, pbhash: MutPtr<UByte>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminCalcHashFromFileHandle2")

public actual fun cryptCATAdminEnumCatalogFromHash(hcatadmin: Long, pbhash: ConstPtr<UByte>, cbhash: UInt, dwflags: UInt, phprevcatinfo: MutPtr<Long>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminEnumCatalogFromHash")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(dwflags: Int, fresume: Int): Int

public actual fun cryptCATAdminPauseServiceForBackup(dwflags: UInt, fresume: Bool): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminPauseServiceForBackup(dwflags.toInt(), fresume).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: Int): Int

public actual fun cryptCATAdminReleaseCatalogContext(hcatadmin: Long, hcatinfo: Long, dwflags: UInt): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseCatalogContext(hcatadmin, hcatinfo, dwflags.toInt()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext")
private external fun wasiWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(hcatadmin: Long, dwflags: Int): Int

public actual fun cryptCATAdminReleaseContext(hcatadmin: Long, dwflags: UInt): Bool =
    wasiWindowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminReleaseContext(hcatadmin, dwflags.toInt()).toInt()

public actual fun cryptCATAdminRemoveCatalog(hcatadmin: Long, pwszcatalogfile: Pcwstr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminRemoveCatalog")

public actual fun cryptCATAdminResolveCatalogPath(hcatadmin: Long, pwszcatalogfile: Pcwstr, pscatinfo: MutPtr<CatalogInfo>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAdminResolveCatalogPath")

public actual fun cryptCATAllocSortedMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatmember> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATAllocSortedMemberInfo")

public actual fun cryptCATCDFClose(pcdf: MutPtr<Cryptcatcdf>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFClose")

public actual fun cryptCATCDFEnumAttributes(pcdf: MutPtr<Cryptcatcdf>, pmember: MutPtr<Cryptcatmember>, pprevattr: MutPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributes")

public actual fun cryptCATCDFEnumAttributesWithCDFTag(pcdf: ConstPtr<Cryptcatcdf>, pwszmembertag: Pcwstr, pmember: ConstPtr<Cryptcatmember>, pprevattr: ConstPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumAttributesWithCDFTag")

public actual fun cryptCATCDFEnumCatAttributes(pcdf: MutPtr<Cryptcatcdf>, pprevattr: MutPtr<Cryptcatattribute>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumCatAttributes")

public actual fun cryptCATCDFEnumMembers(pcdf: MutPtr<Cryptcatcdf>, pprevmember: MutPtr<Cryptcatmember>, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatmember> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembers")

public actual fun cryptCATCDFEnumMembersByCDFTagEx(pcdf: ConstPtr<Cryptcatcdf>, pwszprevcdftag: Pwstr, pfnparseerror: PfnCdfParseErrorCallback, ppmember: ConstPtr<ConstPtr<Cryptcatmember>>, fcontinueonerror: Bool, pvreserved: ConstPtr<CVoid>): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFEnumMembersByCDFTagEx")

public actual fun cryptCATCDFOpen(pwszfilepath: Pcwstr, pfnparseerror: PfnCdfParseErrorCallback): MutPtr<Cryptcatcdf> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCDFOpen")

public actual fun cryptCATCatalogInfoFromContext(hcatinfo: Long, pscatinfo: MutPtr<CatalogInfo>, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATCatalogInfoFromContext")

public actual fun cryptCATClose(hcatalog: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATClose")

public actual fun cryptCATEnumerateAttr(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pprevattr: MutPtr<Cryptcatattribute>): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateAttr")

public actual fun cryptCATEnumerateCatAttr(hcatalog: Handle, pprevattr: MutPtr<Cryptcatattribute>): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateCatAttr")

public actual fun cryptCATEnumerateMember(hcatalog: Handle, pprevmember: MutPtr<Cryptcatmember>): MutPtr<Cryptcatmember> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATEnumerateMember")

public actual fun cryptCATFreeSortedMemberInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATFreeSortedMemberInfo")

public actual fun cryptCATGetAttrInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pwszreferencetag: Pcwstr): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetAttrInfo")

public actual fun cryptCATGetCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetCatAttrInfo")

public actual fun cryptCATGetMemberInfo(hcatalog: Handle, pwszreferencetag: Pcwstr): MutPtr<Cryptcatmember> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATGetMemberInfo")

public actual fun cryptCATHandleFromStore(pcatstore: MutPtr<Cryptcatstore>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATHandleFromStore")

public actual fun cryptCATOpen(pwszfilename: Pcwstr, fdwopenflags: CryptcatOpenFlags, hprov: ULong, dwpublicversion: CryptcatVersion, dwencodingtype: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATOpen")

public actual fun cryptCATPersistStore(hcatalog: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPersistStore")

public actual fun cryptCATPutAttrInfo(hcatalog: Handle, pcatmember: MutPtr<Cryptcatmember>, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr<UByte>): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutAttrInfo")

public actual fun cryptCATPutCatAttrInfo(hcatalog: Handle, pwszreferencetag: Pcwstr, dwattrtypeandaction: UInt, cbdata: UInt, pbdata: MutPtr<UByte>): MutPtr<Cryptcatattribute> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutCatAttrInfo")

public actual fun cryptCATPutMemberInfo(hcatalog: Handle, pwszfilename: Pcwstr, pwszreferencetag: Pcwstr, pgsubjecttype: MutPtr<Guid>, dwcertversion: UInt, cbsipindirectdata: UInt, pbsipindirectdata: MutPtr<UByte>): MutPtr<Cryptcatmember> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATPutMemberInfo")

public actual fun cryptCATStoreFromHandle(hcatalog: Handle): MutPtr<Cryptcatstore> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogCryptCATStoreFromHandle")

public actual fun isCatalogFile(hfile: Handle, pwszfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographyCatalogIsCatalogFile")
