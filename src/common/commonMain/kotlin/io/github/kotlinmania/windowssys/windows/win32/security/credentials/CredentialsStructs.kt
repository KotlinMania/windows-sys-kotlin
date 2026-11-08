@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON

public data class BINARY_BLOB_CREDENTIAL_INFO(public var cbBlob: UInt = 0u, public var pbBlob: Long = 0L)

public data class CERT_CREDENTIAL_INFO(public var cbSize: UInt = 0u, public var rgbHashOfCert: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CERT_CREDENTIAL_INFO) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.rgbHashOfCert.contentEquals(other.rgbHashOfCert)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rgbHashOfCert.contentHashCode()
        return result
    }
}

public data class CREDENTIALA(
    public var Flags: CRED_FLAGS = 0u,
    public var Type: CRED_TYPE = 0u,
    public var TargetName: PSTR = 0L,
    public var Comment: PSTR = 0L,
    public var LastWritten: FILETIME = FILETIME(),
    public var CredentialBlobSize: UInt = 0u,
    public var CredentialBlob: Long = 0L,
    public var Persist: CRED_PERSIST = 0u,
    public var AttributeCount: UInt = 0u,
    public var Attributes: Long = 0L,
    public var TargetAlias: PSTR = 0L,
    public var UserName: PSTR = 0L,
)

public data class CREDENTIALW(
    public var Flags: CRED_FLAGS = 0u,
    public var Type: CRED_TYPE = 0u,
    public var TargetName: PWSTR = 0L,
    public var Comment: PWSTR = 0L,
    public var LastWritten: FILETIME = FILETIME(),
    public var CredentialBlobSize: UInt = 0u,
    public var CredentialBlob: Long = 0L,
    public var Persist: CRED_PERSIST = 0u,
    public var AttributeCount: UInt = 0u,
    public var Attributes: Long = 0L,
    public var TargetAlias: PWSTR = 0L,
    public var UserName: PWSTR = 0L,
)

public data class CREDENTIAL_ATTRIBUTEA(
    public var Keyword: PSTR = 0L,
    public var Flags: UInt = 0u,
    public var ValueSize: UInt = 0u,
    public var Value: Long = 0L,
)

public data class CREDENTIAL_ATTRIBUTEW(
    public var Keyword: PWSTR = 0L,
    public var Flags: UInt = 0u,
    public var ValueSize: UInt = 0u,
    public var Value: Long = 0L,
)

public data class CREDENTIAL_TARGET_INFORMATIONA(
    public var TargetName: PSTR = 0L,
    public var NetbiosServerName: PSTR = 0L,
    public var DnsServerName: PSTR = 0L,
    public var NetbiosDomainName: PSTR = 0L,
    public var DnsDomainName: PSTR = 0L,
    public var DnsTreeName: PSTR = 0L,
    public var PackageName: PSTR = 0L,
    public var Flags: UInt = 0u,
    public var CredTypeCount: UInt = 0u,
    public var CredTypes: Long = 0L,
)

public data class CREDENTIAL_TARGET_INFORMATIONW(
    public var TargetName: PWSTR = 0L,
    public var NetbiosServerName: PWSTR = 0L,
    public var DnsServerName: PWSTR = 0L,
    public var NetbiosDomainName: PWSTR = 0L,
    public var DnsDomainName: PWSTR = 0L,
    public var DnsTreeName: PWSTR = 0L,
    public var PackageName: PWSTR = 0L,
    public var Flags: UInt = 0u,
    public var CredTypeCount: UInt = 0u,
    public var CredTypes: Long = 0L,
)

public data class CREDSSP_CRED(
    public var Type: CREDSPP_SUBMIT_TYPE = 0,
    public var pSchannelCred: Long = 0L,
    public var pSpnegoCred: Long = 0L,
)

public data class CREDSSP_CRED_EX(
    public var Type: CREDSPP_SUBMIT_TYPE = 0,
    public var Version: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Cred: CREDSSP_CRED = CREDSSP_CRED(),
)

public data class CREDUI_INFOA(
    public var cbSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var pszMessageText: PCSTR = 0L,
    public var pszCaptionText: PCSTR = 0L,
    public var hbmBanner: HBITMAP = 0L,
)

public data class CREDUI_INFOW(
    public var cbSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var pszMessageText: PCWSTR = 0L,
    public var pszCaptionText: PCWSTR = 0L,
    public var hbmBanner: HBITMAP = 0L,
)

public data class KeyCredentialManagerInfo(public var containerId: GUID = GUID())

public class OPENCARDNAMEA(
    public var dwStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hSCardContext: ULong = 0uL,
    public var lpstrGroupNames: PSTR = 0L,
    public var nMaxGroupNames: UInt = 0u,
    public var lpstrCardNames: PSTR = 0L,
    public var nMaxCardNames: UInt = 0u,
    public var rgguidInterfaces: Long = 0L,
    public var cguidInterfaces: UInt = 0u,
    public var lpstrRdr: PSTR = 0L,
    public var nMaxRdr: UInt = 0u,
    public var lpstrCard: PSTR = 0L,
    public var nMaxCard: UInt = 0u,
    public var lpstrTitle: PCSTR = 0L,
    public var dwFlags: UInt = 0u,
    public var pvUserData: Long = 0L,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var dwActiveProtocol: UInt = 0u,
    public var lpfnConnect: LPOCNCONNPROCA = null,
    public var lpfnCheck: LPOCNCHKPROC = null,
    public var lpfnDisconnect: LPOCNDSCPROC = null,
    public var hCardHandle: ULong = 0uL,
)

public class OPENCARDNAMEW(
    public var dwStructSize: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var hSCardContext: ULong = 0uL,
    public var lpstrGroupNames: PWSTR = 0L,
    public var nMaxGroupNames: UInt = 0u,
    public var lpstrCardNames: PWSTR = 0L,
    public var nMaxCardNames: UInt = 0u,
    public var rgguidInterfaces: Long = 0L,
    public var cguidInterfaces: UInt = 0u,
    public var lpstrRdr: PWSTR = 0L,
    public var nMaxRdr: UInt = 0u,
    public var lpstrCard: PWSTR = 0L,
    public var nMaxCard: UInt = 0u,
    public var lpstrTitle: PCWSTR = 0L,
    public var dwFlags: UInt = 0u,
    public var pvUserData: Long = 0L,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var dwActiveProtocol: UInt = 0u,
    public var lpfnConnect: LPOCNCONNPROCW = null,
    public var lpfnCheck: LPOCNCHKPROC = null,
    public var lpfnDisconnect: LPOCNDSCPROC = null,
    public var hCardHandle: ULong = 0uL,
)

public class OPENCARDNAME_EXA(
    public var dwStructSize: UInt = 0u,
    public var hSCardContext: ULong = 0uL,
    public var hwndOwner: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var lpstrTitle: PCSTR = 0L,
    public var lpstrSearchDesc: PCSTR = 0L,
    public var hIcon: HICON = 0L,
    public var pOpenCardSearchCriteria: Long = 0L,
    public var lpfnConnect: LPOCNCONNPROCA = null,
    public var pvUserData: Long = 0L,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var lpstrRdr: PSTR = 0L,
    public var nMaxRdr: UInt = 0u,
    public var lpstrCard: PSTR = 0L,
    public var nMaxCard: UInt = 0u,
    public var dwActiveProtocol: UInt = 0u,
    public var hCardHandle: ULong = 0uL,
)

public class OPENCARDNAME_EXW(
    public var dwStructSize: UInt = 0u,
    public var hSCardContext: ULong = 0uL,
    public var hwndOwner: HWND = 0L,
    public var dwFlags: UInt = 0u,
    public var lpstrTitle: PCWSTR = 0L,
    public var lpstrSearchDesc: PCWSTR = 0L,
    public var hIcon: HICON = 0L,
    public var pOpenCardSearchCriteria: Long = 0L,
    public var lpfnConnect: LPOCNCONNPROCW = null,
    public var pvUserData: Long = 0L,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var lpstrRdr: PWSTR = 0L,
    public var nMaxRdr: UInt = 0u,
    public var lpstrCard: PWSTR = 0L,
    public var nMaxCard: UInt = 0u,
    public var dwActiveProtocol: UInt = 0u,
    public var hCardHandle: ULong = 0uL,
)

public data class OPENCARD_SEARCH_CRITERIAA(
    public var dwStructSize: UInt = 0u,
    public var lpstrGroupNames: PSTR = 0L,
    public var nMaxGroupNames: UInt = 0u,
    public var rgguidInterfaces: Long = 0L,
    public var cguidInterfaces: UInt = 0u,
    public var lpstrCardNames: PSTR = 0L,
    public var nMaxCardNames: UInt = 0u,
    public var lpfnCheck: LPOCNCHKPROC = null,
    public var lpfnConnect: LPOCNCONNPROCA = null,
    public var lpfnDisconnect: LPOCNDSCPROC = null,
    public var pvUserData: Long = 0L,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
)

public data class OPENCARD_SEARCH_CRITERIAW(
    public var dwStructSize: UInt = 0u,
    public var lpstrGroupNames: PWSTR = 0L,
    public var nMaxGroupNames: UInt = 0u,
    public var rgguidInterfaces: Long = 0L,
    public var cguidInterfaces: UInt = 0u,
    public var lpstrCardNames: PWSTR = 0L,
    public var nMaxCardNames: UInt = 0u,
    public var lpfnCheck: LPOCNCHKPROC = null,
    public var lpfnConnect: LPOCNCONNPROCW = null,
    public var lpfnDisconnect: LPOCNDSCPROC = null,
    public var pvUserData: Long = 0L,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
)

public data class READER_SEL_REQUEST(
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var MatchType: READER_SEL_REQUEST_MATCH_TYPE = 0,
    public var Anonymous: READER_SEL_REQUEST_0 = READER_SEL_REQUEST_0(),
)

public data class READER_SEL_REQUEST_0(public var ReaderAndContainerParameter: READER_SEL_REQUEST_0_0 = READER_SEL_REQUEST_0_0(), public var SerialNumberParameter: READER_SEL_REQUEST_0_1 = READER_SEL_REQUEST_0_1())

public data class READER_SEL_REQUEST_0_0(
    public var cbReaderNameOffset: UInt = 0u,
    public var cchReaderNameLength: UInt = 0u,
    public var cbContainerNameOffset: UInt = 0u,
    public var cchContainerNameLength: UInt = 0u,
    public var dwDesiredCardModuleVersion: UInt = 0u,
    public var dwCspFlags: UInt = 0u,
)

public data class READER_SEL_REQUEST_0_1(
    public var cbSerialNumberOffset: UInt = 0u,
    public var cbSerialNumberLength: UInt = 0u,
    public var dwDesiredCardModuleVersion: UInt = 0u,
)

public data class READER_SEL_RESPONSE(
    public var cbReaderNameOffset: UInt = 0u,
    public var cchReaderNameLength: UInt = 0u,
    public var cbCardNameOffset: UInt = 0u,
    public var cchCardNameLength: UInt = 0u,
)

public data class SCARD_ATRMASK(
    public var cbAtr: UInt = 0u,
    public var rgbAtr: UByteArray = UByteArray(36),
    public var rgbMask: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCARD_ATRMASK) return false
        if (this.cbAtr != other.cbAtr) return false
        if (!this.rgbAtr.contentEquals(other.rgbAtr)) return false
        if (!this.rgbMask.contentEquals(other.rgbMask)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbAtr.hashCode()
        result = 31 * result + this.rgbAtr.contentHashCode()
        result = 31 * result + this.rgbMask.contentHashCode()
        return result
    }
}

public data class SCARD_IO_REQUEST(public var dwProtocol: UInt = 0u, public var cbPciLength: UInt = 0u)

public data class SCARD_READERSTATEA(
    public var szReader: PCSTR = 0L,
    public var pvUserData: Long = 0L,
    public var dwCurrentState: SCARD_STATE = 0u,
    public var dwEventState: SCARD_STATE = 0u,
    public var cbAtr: UInt = 0u,
    public var rgbAtr: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCARD_READERSTATEA) return false
        if (this.szReader != other.szReader) return false
        if (this.pvUserData != other.pvUserData) return false
        if (this.dwCurrentState != other.dwCurrentState) return false
        if (this.dwEventState != other.dwEventState) return false
        if (this.cbAtr != other.cbAtr) return false
        if (!this.rgbAtr.contentEquals(other.rgbAtr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szReader.hashCode()
        result = 31 * result + this.pvUserData.hashCode()
        result = 31 * result + this.dwCurrentState.hashCode()
        result = 31 * result + this.dwEventState.hashCode()
        result = 31 * result + this.cbAtr.hashCode()
        result = 31 * result + this.rgbAtr.contentHashCode()
        return result
    }
}

public data class SCARD_READERSTATEW(
    public var szReader: PCWSTR = 0L,
    public var pvUserData: Long = 0L,
    public var dwCurrentState: SCARD_STATE = 0u,
    public var dwEventState: SCARD_STATE = 0u,
    public var cbAtr: UInt = 0u,
    public var rgbAtr: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCARD_READERSTATEW) return false
        if (this.szReader != other.szReader) return false
        if (this.pvUserData != other.pvUserData) return false
        if (this.dwCurrentState != other.dwCurrentState) return false
        if (this.dwEventState != other.dwEventState) return false
        if (this.cbAtr != other.cbAtr) return false
        if (!this.rgbAtr.contentEquals(other.rgbAtr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szReader.hashCode()
        result = 31 * result + this.pvUserData.hashCode()
        result = 31 * result + this.dwCurrentState.hashCode()
        result = 31 * result + this.dwEventState.hashCode()
        result = 31 * result + this.cbAtr.hashCode()
        result = 31 * result + this.rgbAtr.contentHashCode()
        return result
    }
}

public data class SCARD_T0_COMMAND(
    public var bCla: UByte = 0u,
    public var bIns: UByte = 0u,
    public var bP1: UByte = 0u,
    public var bP2: UByte = 0u,
    public var bP3: UByte = 0u,
)

public data class SCARD_T0_REQUEST(
    public var ioRequest: SCARD_IO_REQUEST = SCARD_IO_REQUEST(),
    public var bSw1: UByte = 0u,
    public var bSw2: UByte = 0u,
    public var Anonymous: SCARD_T0_REQUEST_0 = SCARD_T0_REQUEST_0(),
)

public data class SCARD_T0_REQUEST_0(public var CmdBytes: SCARD_T0_COMMAND = SCARD_T0_COMMAND(), public var rgbHeader: UByteArray = UByteArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCARD_T0_REQUEST_0) return false
        if (this.CmdBytes != other.CmdBytes) return false
        if (!this.rgbHeader.contentEquals(other.rgbHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CmdBytes.hashCode()
        result = 31 * result + this.rgbHeader.contentHashCode()
        return result
    }
}

public data class SCARD_T1_REQUEST(public var ioRequest: SCARD_IO_REQUEST = SCARD_IO_REQUEST())

public data class SecHandle(public var dwLower: ULong = 0uL, public var dwUpper: ULong = 0uL)

public data class SecPkgContext_ClientCreds(public var AuthBufferLen: UInt = 0u, public var AuthBuffer: Long = 0L)

public data class USERNAME_TARGET_CREDENTIAL_INFO(public var UserName: PWSTR = 0L)
