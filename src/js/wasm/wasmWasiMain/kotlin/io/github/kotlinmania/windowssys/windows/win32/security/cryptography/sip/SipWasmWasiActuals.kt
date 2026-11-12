@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertQueryEncodingType

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun cryptSIPAddProvider(psnewprov: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider")

public actual fun cryptSIPCreateIndirectData(psubjectinfo: MutPtr, pcbindirectdata: MutPtr, pindirectdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData")

public actual fun cryptSIPGetCaps(psubjinfo: ConstPtr, pcaps: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps")

public actual fun cryptSIPGetSealedDigest(psubjectinfo: ConstPtr, psig: ConstPtr, dwsig: UInt, pbdigest: MutPtr, pcbdigest: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest")

public actual fun cryptSIPGetSignedDataMsg(psubjectinfo: MutPtr, pdwencodingtype: MutPtr, dwindex: UInt, pcbsigneddatamsg: MutPtr, pbsigneddatamsg: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg")

public actual fun cryptSIPLoad(pgsubject: ConstPtr, dwflags: UInt, psipdispatch: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad")

public actual fun cryptSIPPutSignedDataMsg(psubjectinfo: MutPtr, dwencodingtype: CertQueryEncodingType, pdwindex: MutPtr, cbsigneddatamsg: UInt, pbsigneddatamsg: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg")

public actual fun cryptSIPRemoveProvider(pgprov: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider")

public actual fun cryptSIPRemoveSignedDataMsg(psubjectinfo: MutPtr, dwindex: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg")

public actual fun cryptSIPRetrieveSubjectGuid(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid")

public actual fun cryptSIPRetrieveSubjectGuidForCatalogFile(filename: Pcwstr, hfilein: Handle, pgsubject: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile")

public actual fun cryptSIPVerifyIndirectData(psubjectinfo: MutPtr, pindirectdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData")
