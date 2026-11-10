@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public data class BinaryBlobCredentialInfo(public var cbBlob: UInt = 0u, public var pbBlob: COpaquePointer? = null)

public data class CertCredentialInfo(public var cbSize: UInt = 0u, public var rgbHashOfCert: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertCredentialInfo) return false
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

public data class Credentiala(
    public var flags: CredFlags = 0u,
    public var type: CredType = 0u,
    public var targetName: Pstr = null,
    public var comment: Pstr = null,
    public var lastWritten: Filetime = Filetime(),
    public var credentialBlobSize: UInt = 0u,
    public var credentialBlob: COpaquePointer? = null,
    public var persist: CredPersist = 0u,
    public var attributeCount: UInt = 0u,
    public var attributes: CredentialAttributea? = null,
    public var targetAlias: Pstr = null,
    public var userName: Pstr = null,
)

public data class Credentialw(
    public var flags: CredFlags = 0u,
    public var type: CredType = 0u,
    public var targetName: Pwstr = null,
    public var comment: Pwstr = null,
    public var lastWritten: Filetime = Filetime(),
    public var credentialBlobSize: UInt = 0u,
    public var credentialBlob: COpaquePointer? = null,
    public var persist: CredPersist = 0u,
    public var attributeCount: UInt = 0u,
    public var attributes: CredentialAttributew? = null,
    public var targetAlias: Pwstr = null,
    public var userName: Pwstr = null,
)

public data class CredentialAttributea(
    public var keyword: Pstr = null,
    public var flags: UInt = 0u,
    public var valueSize: UInt = 0u,
    public var value: COpaquePointer? = null,
)

public data class CredentialAttributew(
    public var keyword: Pwstr = null,
    public var flags: UInt = 0u,
    public var valueSize: UInt = 0u,
    public var value: COpaquePointer? = null,
)

public data class CredentialTargetInformationa(
    public var targetName: Pstr = null,
    public var netbiosServerName: Pstr = null,
    public var dnsServerName: Pstr = null,
    public var netbiosDomainName: Pstr = null,
    public var dnsDomainName: Pstr = null,
    public var dnsTreeName: Pstr = null,
    public var packageName: Pstr = null,
    public var flags: UInt = 0u,
    public var credTypeCount: UInt = 0u,
    public var credTypes: UInt? = null,
)

public data class CredentialTargetInformationw(
    public var targetName: Pwstr = null,
    public var netbiosServerName: Pwstr = null,
    public var dnsServerName: Pwstr = null,
    public var netbiosDomainName: Pwstr = null,
    public var dnsDomainName: Pwstr = null,
    public var dnsTreeName: Pwstr = null,
    public var packageName: Pwstr = null,
    public var flags: UInt = 0u,
    public var credTypeCount: UInt = 0u,
    public var credTypes: UInt? = null,
)

public data class CredsspCred(
    public var type: CredsppSubmitType = 0,
    public var pSchannelCred: COpaquePointer? = null,
    public var pSpnegoCred: COpaquePointer? = null,
)

public data class CredsspCredEx(
    public var type: CredsppSubmitType = 0,
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var cred: CredsspCred = CredsspCred(),
)

public data class CreduiInfoa(
    public var cbSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var pszMessageText: Pcstr = null,
    public var pszCaptionText: Pcstr = null,
    public var hbmBanner: Hbitmap = null,
)

public data class CreduiInfow(
    public var cbSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var pszMessageText: Pcwstr = null,
    public var pszCaptionText: Pcwstr = null,
    public var hbmBanner: Hbitmap = null,
)

public data class KeyCredentialManagerInfo(public var containerId: Guid = Guid())

public class Opencardnamea(
    public var dwStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hSCardContext: Int = 0,
    public var lpstrGroupNames: Pstr = null,
    public var nMaxGroupNames: UInt = 0u,
    public var lpstrCardNames: Pstr = null,
    public var nMaxCardNames: UInt = 0u,
    public var rgguidInterfaces: Guid? = null,
    public var cguidInterfaces: UInt = 0u,
    public var lpstrRdr: Pstr = null,
    public var nMaxRdr: UInt = 0u,
    public var lpstrCard: Pstr = null,
    public var nMaxCard: UInt = 0u,
    public var lpstrTitle: Pcstr = null,
    public var dwFlags: UInt = 0u,
    public var pvUserData: COpaquePointer? = null,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var dwActiveProtocol: UInt = 0u,
    public var lpfnConnect: Lpocnconnproca = null,
    public var lpfnCheck: Lpocnchkproc = null,
    public var lpfnDisconnect: Lpocndscproc = null,
    public var hCardHandle: Int = 0,
)

public class Opencardnamew(
    public var dwStructSize: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var hSCardContext: Int = 0,
    public var lpstrGroupNames: Pwstr = null,
    public var nMaxGroupNames: UInt = 0u,
    public var lpstrCardNames: Pwstr = null,
    public var nMaxCardNames: UInt = 0u,
    public var rgguidInterfaces: Guid? = null,
    public var cguidInterfaces: UInt = 0u,
    public var lpstrRdr: Pwstr = null,
    public var nMaxRdr: UInt = 0u,
    public var lpstrCard: Pwstr = null,
    public var nMaxCard: UInt = 0u,
    public var lpstrTitle: Pcwstr = null,
    public var dwFlags: UInt = 0u,
    public var pvUserData: COpaquePointer? = null,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var dwActiveProtocol: UInt = 0u,
    public var lpfnConnect: Lpocnconnprocw = null,
    public var lpfnCheck: Lpocnchkproc = null,
    public var lpfnDisconnect: Lpocndscproc = null,
    public var hCardHandle: Int = 0,
)

public class OpencardnameExa(
    public var dwStructSize: UInt = 0u,
    public var hSCardContext: Int = 0,
    public var hwndOwner: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var lpstrTitle: Pcstr = null,
    public var lpstrSearchDesc: Pcstr = null,
    public var hIcon: Hicon = null,
    public var pOpenCardSearchCriteria: OpencardSearchCriteriaa? = null,
    public var lpfnConnect: Lpocnconnproca = null,
    public var pvUserData: COpaquePointer? = null,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var lpstrRdr: Pstr = null,
    public var nMaxRdr: UInt = 0u,
    public var lpstrCard: Pstr = null,
    public var nMaxCard: UInt = 0u,
    public var dwActiveProtocol: UInt = 0u,
    public var hCardHandle: Int = 0,
)

public class OpencardnameExw(
    public var dwStructSize: UInt = 0u,
    public var hSCardContext: Int = 0,
    public var hwndOwner: Hwnd = null,
    public var dwFlags: UInt = 0u,
    public var lpstrTitle: Pcwstr = null,
    public var lpstrSearchDesc: Pcwstr = null,
    public var hIcon: Hicon = null,
    public var pOpenCardSearchCriteria: OpencardSearchCriteriaw? = null,
    public var lpfnConnect: Lpocnconnprocw = null,
    public var pvUserData: COpaquePointer? = null,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var lpstrRdr: Pwstr = null,
    public var nMaxRdr: UInt = 0u,
    public var lpstrCard: Pwstr = null,
    public var nMaxCard: UInt = 0u,
    public var dwActiveProtocol: UInt = 0u,
    public var hCardHandle: Int = 0,
)

public data class OpencardSearchCriteriaa(
    public var dwStructSize: UInt = 0u,
    public var lpstrGroupNames: Pstr = null,
    public var nMaxGroupNames: UInt = 0u,
    public var rgguidInterfaces: Guid? = null,
    public var cguidInterfaces: UInt = 0u,
    public var lpstrCardNames: Pstr = null,
    public var nMaxCardNames: UInt = 0u,
    public var lpfnCheck: Lpocnchkproc = null,
    public var lpfnConnect: Lpocnconnproca = null,
    public var lpfnDisconnect: Lpocndscproc = null,
    public var pvUserData: COpaquePointer? = null,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
)

public data class OpencardSearchCriteriaw(
    public var dwStructSize: UInt = 0u,
    public var lpstrGroupNames: Pwstr = null,
    public var nMaxGroupNames: UInt = 0u,
    public var rgguidInterfaces: Guid? = null,
    public var cguidInterfaces: UInt = 0u,
    public var lpstrCardNames: Pwstr = null,
    public var nMaxCardNames: UInt = 0u,
    public var lpfnCheck: Lpocnchkproc = null,
    public var lpfnConnect: Lpocnconnprocw = null,
    public var lpfnDisconnect: Lpocndscproc = null,
    public var pvUserData: COpaquePointer? = null,
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
)

public data class ReaderSelRequest(
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var matchType: ReaderSelRequestMatchType = 0,
    public var anonymous: ReaderSelRequest0 = ReaderSelRequest0(),
)

public data class ReaderSelRequest0(public var readerAndContainerParameter: ReaderSelRequest00 = ReaderSelRequest00(), public var serialNumberParameter: ReaderSelRequest01 = ReaderSelRequest01())

public data class ReaderSelRequest00(
    public var cbReaderNameOffset: UInt = 0u,
    public var cchReaderNameLength: UInt = 0u,
    public var cbContainerNameOffset: UInt = 0u,
    public var cchContainerNameLength: UInt = 0u,
    public var dwDesiredCardModuleVersion: UInt = 0u,
    public var dwCspFlags: UInt = 0u,
)

public data class ReaderSelRequest01(
    public var cbSerialNumberOffset: UInt = 0u,
    public var cbSerialNumberLength: UInt = 0u,
    public var dwDesiredCardModuleVersion: UInt = 0u,
)

public data class ReaderSelResponse(
    public var cbReaderNameOffset: UInt = 0u,
    public var cchReaderNameLength: UInt = 0u,
    public var cbCardNameOffset: UInt = 0u,
    public var cchCardNameLength: UInt = 0u,
)

public data class ScardAtrmask(
    public var cbAtr: UInt = 0u,
    public var rgbAtr: UByteArray = UByteArray(36),
    public var rgbMask: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScardAtrmask) return false
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

public data class ScardIoRequest(public var dwProtocol: UInt = 0u, public var cbPciLength: UInt = 0u)

public data class ScardReaderstatea(
    public var szReader: Pcstr = null,
    public var pvUserData: COpaquePointer? = null,
    public var dwCurrentState: ScardState = 0u,
    public var dwEventState: ScardState = 0u,
    public var cbAtr: UInt = 0u,
    public var rgbAtr: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScardReaderstatea) return false
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

public data class ScardReaderstatew(
    public var szReader: Pcwstr = null,
    public var pvUserData: COpaquePointer? = null,
    public var dwCurrentState: ScardState = 0u,
    public var dwEventState: ScardState = 0u,
    public var cbAtr: UInt = 0u,
    public var rgbAtr: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScardReaderstatew) return false
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

public data class ScardT0Command(
    public var bCla: UByte = 0u,
    public var bIns: UByte = 0u,
    public var bP1: UByte = 0u,
    public var bP2: UByte = 0u,
    public var bP3: UByte = 0u,
)

public data class ScardT0Request(
    public var ioRequest: ScardIoRequest = ScardIoRequest(),
    public var bSw1: UByte = 0u,
    public var bSw2: UByte = 0u,
    public var anonymous: ScardT0Request0 = ScardT0Request0(),
)

public data class ScardT0Request0(public var cmdBytes: ScardT0Command = ScardT0Command(), public var rgbHeader: UByteArray = UByteArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScardT0Request0) return false
        if (this.cmdBytes != other.cmdBytes) return false
        if (!this.rgbHeader.contentEquals(other.rgbHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmdBytes.hashCode()
        result = 31 * result + this.rgbHeader.contentHashCode()
        return result
    }
}

public data class ScardT1Request(public var ioRequest: ScardIoRequest = ScardIoRequest())

public data class SecHandle(public var dwLower: Int = 0, public var dwUpper: Int = 0)

public data class SecPkgContextClientCreds(public var authBufferLen: UInt = 0u, public var authBuffer: COpaquePointer? = null)

public data class UsernameTargetCredentialInfo(public var userName: Pwstr = null)
