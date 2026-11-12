@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun cryptSIPAddProvider(psnewprov: MutPtr<SipAddNewprovider>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider")

public actual fun cryptSIPCreateIndirectData(psubjectinfo: MutPtr<SipSubjectinfo>, pcbindirectdata: MutPtr<UInt>, pindirectdata: MutPtr<SipIndirectData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData")

public actual fun cryptSIPGetCaps(psubjinfo: ConstPtr<SipSubjectinfo>, pcaps: MutPtr<SipCapSetV3>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps")

public actual fun cryptSIPGetSealedDigest(psubjectinfo: ConstPtr<SipSubjectinfo>, psig: ConstPtr<UByte>, dwsig: UInt, pbdigest: MutPtr<UByte>, pcbdigest: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest")

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, pdwencodingtype: MutPtr<CertQueryEncodingType>, dwindex: UInt, pcbsigneddatamsg: MutPtr<UInt>, pbsigneddatamsg: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg")

public actual fun cryptSIPLoad(pgsubject: ConstPtr<Guid>, dwflags: UInt, psipdispatch: MutPtr<SipDispatchInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad")

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, dwencodingtype: CertQueryEncodingType, pdwindex: MutPtr<UInt>, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr<UByte>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg")

public actual fun cryptSIPRemoveProvider(pgprov: MutPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider")

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: MutPtr<SipSubjectinfo>, dwindex: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg")

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid")

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile")

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: MutPtr<SipSubjectinfo>, pindirectdata: MutPtr<SipIndirectData>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData")
