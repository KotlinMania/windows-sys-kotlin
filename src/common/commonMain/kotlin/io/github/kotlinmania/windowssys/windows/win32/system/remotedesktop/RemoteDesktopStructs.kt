@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public data class AAAccountingData(
    public var userName: Bstr = null,
    public var clientName: Bstr = null,
    public var authType: AAAuthSchemes = 0,
    public var resourceName: Bstr = null,
    public var portNumber: Int = 0,
    public var protocolName: Bstr = null,
    public var numberOfBytesReceived: Int = 0,
    public var numberOfBytesTransfered: Int = 0,
    public var reasonForDisconnect: Bstr = null,
    public var mainSessionId: Guid = Guid(),
    public var subSessionId: Int = 0,
)

public data class AeCurrentPosition(
    public var u64DevicePosition: ULong = 0uL,
    public var u64StreamPosition: ULong = 0uL,
    public var u64PaddingFrames: ULong = 0uL,
    public var hnsQPCPosition: Long = 0L,
    public var f32FramesPerSecond: Float = 0.0f,
    public var flag: AePositionFlags = 0,
)

public data class BitmapRendererStatistics(
    public var dwFramesDelivered: UInt = 0u,
    public var dwFramesDropped: UInt = 0u,
)

public data class ChannelDef(
    public var name: ByteArray = ByteArray(8),
    public var options: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ChannelDef) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }
}

public data class ChannelEntryPoints(
    public var cbSize: UInt = 0u,
    public var protocolVersion: UInt = 0u,
    public var pVirtualChannelInit: Pvirtualchannelinit = null,
    public var pVirtualChannelOpen: Pvirtualchannelopen = null,
    public var pVirtualChannelClose: Pvirtualchannelclose = null,
    public var pVirtualChannelWrite: Pvirtualchannelwrite = null,
)

public data class ChannelPduHeader(
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class ClientDisplay(
    public var horizontalResolution: UInt = 0u,
    public var verticalResolution: UInt = 0u,
    public var colorDepth: UInt = 0u,
)

public data class ProductInfoa(
    public var companyName: ByteArray = ByteArray(256),
    public var productID: ByteArray = ByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProductInfoa) return false
        if (!this.companyName.contentEquals(other.companyName)) return false
        if (!this.productID.contentEquals(other.productID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.companyName.contentHashCode()
        result = 31 * result + this.productID.contentHashCode()
        return result
    }
}

public data class ProductInfow(
    public var companyName: UShortArray = UShortArray(256),
    public var productID: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProductInfow) return false
        if (!this.companyName.contentEquals(other.companyName)) return false
        if (!this.productID.contentEquals(other.productID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.companyName.contentHashCode()
        result = 31 * result + this.productID.contentHashCode()
        return result
    }
}

public data class RfxGfxMonitorInfo(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
    public var physicalWidth: UInt = 0u,
    public var physicalHeight: UInt = 0u,
    public var orientation: UInt = 0u,
    public var primary: Bool = 0,
)

public data class RfxGfxMsgClientDesktopInfoRequest(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
)

public data class RfxGfxMsgClientDesktopInfoResponse(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var reserved: UInt = 0u,
    public var monitorCount: UInt = 0u,
    public var monitorData: List<RfxGfxMonitorInfo> = List(16) { RfxGfxMonitorInfo() },
    public var clientUniqueId: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RfxGfxMsgClientDesktopInfoResponse) return false
        if (this.channelHdr != other.channelHdr) return false
        if (this.reserved != other.reserved) return false
        if (this.monitorCount != other.monitorCount) return false
        if (this.monitorData != other.monitorData) return false
        if (!this.clientUniqueId.contentEquals(other.clientUniqueId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.channelHdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.monitorCount.hashCode()
        result = 31 * result + this.monitorData.hashCode()
        result = 31 * result + this.clientUniqueId.contentHashCode()
        return result
    }
}

public data class RfxGfxMsgDesktopConfigChangeConfirm(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
)

public data class RfxGfxMsgDesktopConfigChangeNotify(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var ulWidth: UInt = 0u,
    public var ulHeight: UInt = 0u,
    public var ulBpp: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class RfxGfxMsgDesktopInputReset(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var ulWidth: UInt = 0u,
    public var ulHeight: UInt = 0u,
)

public data class RfxGfxMsgDesktopResendRequest(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var redrawRect: RfxGfxRect = RfxGfxRect(),
)

public data class RfxGfxMsgDisconnectNotify(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var disconnectReason: UInt = 0u,
)

public data class RfxGfxMsgHeader(
    public var uMSGType: UShort = 0u,
    public var cbSize: UShort = 0u,
)

public data class RfxGfxMsgRdpData(
    public var channelHdr: RfxGfxMsgHeader = RfxGfxMsgHeader(),
    public var rdpData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RfxGfxMsgRdpData) return false
        if (this.channelHdr != other.channelHdr) return false
        if (!this.rdpData.contentEquals(other.rdpData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.channelHdr.hashCode()
        result = 31 * result + this.rdpData.contentHashCode()
        return result
    }
}

public data class RfxGfxRect(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
)

public data class TssdConnectionPoint(
    public var serverAddressB: UByteArray = UByteArray(16),
    public var addressType: TssdAddrV46Type = 0,
    public var portNumber: UShort = 0u,
    public var addressScope: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TssdConnectionPoint) return false
        if (!this.serverAddressB.contentEquals(other.serverAddressB)) return false
        if (this.addressType != other.addressType) return false
        if (this.portNumber != other.portNumber) return false
        if (this.addressScope != other.addressScope) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serverAddressB.contentHashCode()
        result = 31 * result + this.addressType.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.addressScope.hashCode()
        return result
    }
}

public data class VmNotifyEntry(
    public var vmName: UShortArray = UShortArray(128),
    public var vmHost: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmNotifyEntry) return false
        if (!this.vmName.contentEquals(other.vmName)) return false
        if (!this.vmHost.contentEquals(other.vmHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vmName.contentHashCode()
        result = 31 * result + this.vmHost.contentHashCode()
        return result
    }
}

public data class VmNotifyInfo(
    public var dwNumEntries: UInt = 0u,
    public var ppVmEntries: COpaquePointer? = null,
)

public data class VmPatchInfo(
    public var dwNumEntries: UInt = 0u,
    public var pVmNames: Pwstr = null,
)

public data class WrdsConnectionSetting(
    public var wRdsConnectionSettings1: WrdsConnectionSettings1 = WrdsConnectionSettings1(),
)

public data class WrdsConnectionSettings(
    public var wRdsConnectionSettingLevel: WrdsConnectionSettingLevel = 0,
    public var wRdsConnectionSetting: WrdsConnectionSetting = WrdsConnectionSetting(),
)

public class WrdsConnectionSettings1 {
    public var fInheritInitialProgram: Boolean = false

    public var fInheritColorDepth: Boolean = false

    public var fHideTitleBar: Boolean = false

    public var fInheritAutoLogon: Boolean = false

    public var fMaximizeShell: Boolean = false

    public var fDisablePNP: Boolean = false

    public var fPasswordIsScPin: Boolean = false

    public var fPromptForPassword: Boolean = false

    public var fDisableCpm: Boolean = false

    public var fDisableCdm: Boolean = false

    public var fDisableCcm: Boolean = false

    public var fDisableLPT: Boolean = false

    public var fDisableClip: Boolean = false

    public var fResetBroken: Boolean = false

    public var fDisableEncryption: Boolean = false

    public var fDisableAutoReconnect: Boolean = false

    public var fDisableCtrlAltDel: Boolean = false

    public var fDoubleClickDetect: Boolean = false

    public var fEnableWindowsKey: Boolean = false

    public var fUsingSavedCreds: Boolean = false

    public var fMouse: Boolean = false

    public var fNoAudioPlayback: Boolean = false

    public var fRemoteConsoleAudio: Boolean = false

    public var encryptionLevel: UByte = 0u

    public var colorDepth: UShort = 0u

    public var protocolType: UShort = 0u

    public var hRes: UShort = 0u

    public var vRes: UShort = 0u

    public var clientProductId: UShort = 0u

    public var outBufCountHost: UShort = 0u

    public var outBufCountClient: UShort = 0u

    public var outBufLength: UShort = 0u

    public var keyboardLayout: UInt = 0u

    public var maxConnectionTime: UInt = 0u

    public var maxDisconnectionTime: UInt = 0u

    public var maxIdleTime: UInt = 0u

    public var performanceFlags: UInt = 0u

    public var keyboardType: UInt = 0u

    public var keyboardSubType: UInt = 0u

    public var keyboardFunctionKey: UInt = 0u

    public var activeInputLocale: UInt = 0u

    public var serialNumber: UInt = 0u

    public var clientAddressFamily: UInt = 0u

    public var clientBuildNumber: UInt = 0u

    public var clientSessionId: UInt = 0u

    public var workDirectory: UShortArray = UShortArray(257)

    public var initialProgram: UShortArray = UShortArray(257)

    public var userName: UShortArray = UShortArray(256)

    public var domain: UShortArray = UShortArray(256)

    public var password: UShortArray = UShortArray(256)

    public var protocolName: UShortArray = UShortArray(9)

    public var displayDriverName: UShortArray = UShortArray(9)

    public var displayDeviceName: UShortArray = UShortArray(20)

    public var imeFileName: UShortArray = UShortArray(33)

    public var audioDriverName: UShortArray = UShortArray(9)

    public var clientName: UShortArray = UShortArray(21)

    public var clientAddress: UShortArray = UShortArray(31)

    public var clientDirectory: UShortArray = UShortArray(257)

    public var clientDigProductId: UShortArray = UShortArray(33)

    public var clientSockAddress: WtsSockaddr = WtsSockaddr()

    public var clientTimeZone: WtsTimeZoneInformation = WtsTimeZoneInformation()

    public var wRdsListenerSettings: WrdsListenerSettings = WrdsListenerSettings()

    public var eventLogActivityId: Guid = Guid()

    public var contextSize: UInt = 0u

    public var contextData: COpaquePointer? = null
}

public data class WrdsDynamicTimeZoneInformation(
    public var bias: Int = 0,
    public var standardName: UShortArray = UShortArray(32),
    public var standardDate: WtsSystemtime = WtsSystemtime(),
    public var standardBias: Int = 0,
    public var daylightName: UShortArray = UShortArray(32),
    public var daylightDate: WtsSystemtime = WtsSystemtime(),
    public var daylightBias: Int = 0,
    public var timeZoneKeyName: UShortArray = UShortArray(128),
    public var dynamicDaylightTimeDisabled: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WrdsDynamicTimeZoneInformation) return false
        if (this.bias != other.bias) return false
        if (!this.standardName.contentEquals(other.standardName)) return false
        if (this.standardDate != other.standardDate) return false
        if (this.standardBias != other.standardBias) return false
        if (!this.daylightName.contentEquals(other.daylightName)) return false
        if (this.daylightDate != other.daylightDate) return false
        if (this.daylightBias != other.daylightBias) return false
        if (!this.timeZoneKeyName.contentEquals(other.timeZoneKeyName)) return false
        if (this.dynamicDaylightTimeDisabled != other.dynamicDaylightTimeDisabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bias.hashCode()
        result = 31 * result + this.standardName.contentHashCode()
        result = 31 * result + this.standardDate.hashCode()
        result = 31 * result + this.standardBias.hashCode()
        result = 31 * result + this.daylightName.contentHashCode()
        result = 31 * result + this.daylightDate.hashCode()
        result = 31 * result + this.daylightBias.hashCode()
        result = 31 * result + this.timeZoneKeyName.contentHashCode()
        result = 31 * result + this.dynamicDaylightTimeDisabled.hashCode()
        return result
    }
}

public data class WrdsListenerSetting(
    public var wRdsListenerSettings1: WrdsListenerSettings1 = WrdsListenerSettings1(),
)

public data class WrdsListenerSettings(
    public var wRdsListenerSettingLevel: WrdsListenerSettingLevel = 0,
    public var wRdsListenerSetting: WrdsListenerSetting = WrdsListenerSetting(),
)

public data class WrdsListenerSettings1(
    public var maxProtocolListenerConnectionCount: UInt = 0u,
    public var securityDescriptorSize: UInt = 0u,
    public var pSecurityDescriptor: COpaquePointer? = null,
)

public data class WrdsSetting(
    public var wRdsSettings1: WrdsSettings1 = WrdsSettings1(),
)

public data class WrdsSettings(
    public var wRdsSettingType: WrdsSettingType = 0,
    public var wRdsSettingLevel: WrdsSettingLevel = 0,
    public var wRdsSetting: WrdsSetting = WrdsSetting(),
)

public class WrdsSettings1(
    public var wRdsDisableClipStatus: WrdsSettingStatus = 0,
    public var wRdsDisableClipValue: UInt = 0u,
    public var wRdsDisableLPTStatus: WrdsSettingStatus = 0,
    public var wRdsDisableLPTValue: UInt = 0u,
    public var wRdsDisableCcmStatus: WrdsSettingStatus = 0,
    public var wRdsDisableCcmValue: UInt = 0u,
    public var wRdsDisableCdmStatus: WrdsSettingStatus = 0,
    public var wRdsDisableCdmValue: UInt = 0u,
    public var wRdsDisableCpmStatus: WrdsSettingStatus = 0,
    public var wRdsDisableCpmValue: UInt = 0u,
    public var wRdsDisablePnpStatus: WrdsSettingStatus = 0,
    public var wRdsDisablePnpValue: UInt = 0u,
    public var wRdsEncryptionLevelStatus: WrdsSettingStatus = 0,
    public var wRdsEncryptionValue: UInt = 0u,
    public var wRdsColorDepthStatus: WrdsSettingStatus = 0,
    public var wRdsColorDepthValue: UInt = 0u,
    public var wRdsDisableAutoReconnecetStatus: WrdsSettingStatus = 0,
    public var wRdsDisableAutoReconnecetValue: UInt = 0u,
    public var wRdsDisableEncryptionStatus: WrdsSettingStatus = 0,
    public var wRdsDisableEncryptionValue: UInt = 0u,
    public var wRdsResetBrokenStatus: WrdsSettingStatus = 0,
    public var wRdsResetBrokenValue: UInt = 0u,
    public var wRdsMaxIdleTimeStatus: WrdsSettingStatus = 0,
    public var wRdsMaxIdleTimeValue: UInt = 0u,
    public var wRdsMaxDisconnectTimeStatus: WrdsSettingStatus = 0,
    public var wRdsMaxDisconnectTimeValue: UInt = 0u,
    public var wRdsMaxConnectTimeStatus: WrdsSettingStatus = 0,
    public var wRdsMaxConnectTimeValue: UInt = 0u,
    public var wRdsKeepAliveStatus: WrdsSettingStatus = 0,
    public var wRdsKeepAliveStartValue: Boolean = false,
    public var wRdsKeepAliveIntervalValue: UInt = 0u,
)

public class Wtsclienta(
    public var clientName: ByteArray = ByteArray(21),
    public var domain: ByteArray = ByteArray(18),
    public var userName: ByteArray = ByteArray(21),
    public var workDirectory: ByteArray = ByteArray(261),
    public var initialProgram: ByteArray = ByteArray(261),
    public var encryptionLevel: UByte = 0u,
    public var clientAddressFamily: UInt = 0u,
    public var clientAddress: UShortArray = UShortArray(31),
    public var hRes: UShort = 0u,
    public var vRes: UShort = 0u,
    public var colorDepth: UShort = 0u,
    public var clientDirectory: ByteArray = ByteArray(261),
    public var clientBuildNumber: UInt = 0u,
    public var clientHardwareId: UInt = 0u,
    public var clientProductId: UShort = 0u,
    public var outBufCountHost: UShort = 0u,
    public var outBufCountClient: UShort = 0u,
    public var outBufLength: UShort = 0u,
    public var deviceId: ByteArray = ByteArray(261),
)

public class Wtsclientw(
    public var clientName: UShortArray = UShortArray(21),
    public var domain: UShortArray = UShortArray(18),
    public var userName: UShortArray = UShortArray(21),
    public var workDirectory: UShortArray = UShortArray(261),
    public var initialProgram: UShortArray = UShortArray(261),
    public var encryptionLevel: UByte = 0u,
    public var clientAddressFamily: UInt = 0u,
    public var clientAddress: UShortArray = UShortArray(31),
    public var hRes: UShort = 0u,
    public var vRes: UShort = 0u,
    public var colorDepth: UShort = 0u,
    public var clientDirectory: UShortArray = UShortArray(261),
    public var clientBuildNumber: UInt = 0u,
    public var clientHardwareId: UInt = 0u,
    public var clientProductId: UShort = 0u,
    public var outBufCountHost: UShort = 0u,
    public var outBufCountClient: UShort = 0u,
    public var outBufLength: UShort = 0u,
    public var deviceId: UShortArray = UShortArray(261),
)

public data class Wtsconfiginfoa(
    public var version: UInt = 0u,
    public var fConnectClientDrivesAtLogon: UInt = 0u,
    public var fConnectPrinterAtLogon: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var shadowSettings: UInt = 0u,
    public var logonUserName: ByteArray = ByteArray(21),
    public var logonDomain: ByteArray = ByteArray(18),
    public var workDirectory: ByteArray = ByteArray(261),
    public var initialProgram: ByteArray = ByteArray(261),
    public var applicationName: ByteArray = ByteArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wtsconfiginfoa) return false
        if (this.version != other.version) return false
        if (this.fConnectClientDrivesAtLogon != other.fConnectClientDrivesAtLogon) return false
        if (this.fConnectPrinterAtLogon != other.fConnectPrinterAtLogon) return false
        if (this.fDisablePrinterRedirection != other.fDisablePrinterRedirection) return false
        if (this.fDisableDefaultMainClientPrinter != other.fDisableDefaultMainClientPrinter) return false
        if (this.shadowSettings != other.shadowSettings) return false
        if (!this.logonUserName.contentEquals(other.logonUserName)) return false
        if (!this.logonDomain.contentEquals(other.logonDomain)) return false
        if (!this.workDirectory.contentEquals(other.workDirectory)) return false
        if (!this.initialProgram.contentEquals(other.initialProgram)) return false
        if (!this.applicationName.contentEquals(other.applicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.fConnectClientDrivesAtLogon.hashCode()
        result = 31 * result + this.fConnectPrinterAtLogon.hashCode()
        result = 31 * result + this.fDisablePrinterRedirection.hashCode()
        result = 31 * result + this.fDisableDefaultMainClientPrinter.hashCode()
        result = 31 * result + this.shadowSettings.hashCode()
        result = 31 * result + this.logonUserName.contentHashCode()
        result = 31 * result + this.logonDomain.contentHashCode()
        result = 31 * result + this.workDirectory.contentHashCode()
        result = 31 * result + this.initialProgram.contentHashCode()
        result = 31 * result + this.applicationName.contentHashCode()
        return result
    }
}

public data class Wtsconfiginfow(
    public var version: UInt = 0u,
    public var fConnectClientDrivesAtLogon: UInt = 0u,
    public var fConnectPrinterAtLogon: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var shadowSettings: UInt = 0u,
    public var logonUserName: UShortArray = UShortArray(21),
    public var logonDomain: UShortArray = UShortArray(18),
    public var workDirectory: UShortArray = UShortArray(261),
    public var initialProgram: UShortArray = UShortArray(261),
    public var applicationName: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wtsconfiginfow) return false
        if (this.version != other.version) return false
        if (this.fConnectClientDrivesAtLogon != other.fConnectClientDrivesAtLogon) return false
        if (this.fConnectPrinterAtLogon != other.fConnectPrinterAtLogon) return false
        if (this.fDisablePrinterRedirection != other.fDisablePrinterRedirection) return false
        if (this.fDisableDefaultMainClientPrinter != other.fDisableDefaultMainClientPrinter) return false
        if (this.shadowSettings != other.shadowSettings) return false
        if (!this.logonUserName.contentEquals(other.logonUserName)) return false
        if (!this.logonDomain.contentEquals(other.logonDomain)) return false
        if (!this.workDirectory.contentEquals(other.workDirectory)) return false
        if (!this.initialProgram.contentEquals(other.initialProgram)) return false
        if (!this.applicationName.contentEquals(other.applicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.fConnectClientDrivesAtLogon.hashCode()
        result = 31 * result + this.fConnectPrinterAtLogon.hashCode()
        result = 31 * result + this.fDisablePrinterRedirection.hashCode()
        result = 31 * result + this.fDisableDefaultMainClientPrinter.hashCode()
        result = 31 * result + this.shadowSettings.hashCode()
        result = 31 * result + this.logonUserName.contentHashCode()
        result = 31 * result + this.logonDomain.contentHashCode()
        result = 31 * result + this.workDirectory.contentHashCode()
        result = 31 * result + this.initialProgram.contentHashCode()
        result = 31 * result + this.applicationName.contentHashCode()
        return result
    }
}

public data class Wtsinfoa(
    public var state: WtsConnectstateClass = 0,
    public var sessionId: UInt = 0u,
    public var incomingBytes: UInt = 0u,
    public var outgoingBytes: UInt = 0u,
    public var incomingFrames: UInt = 0u,
    public var outgoingFrames: UInt = 0u,
    public var incomingCompressedBytes: UInt = 0u,
    public var outgoingCompressedBy: UInt = 0u,
    public var winStationName: ByteArray = ByteArray(32),
    public var domain: ByteArray = ByteArray(17),
    public var userName: ByteArray = ByteArray(21),
    public var connectTime: Long = 0L,
    public var disconnectTime: Long = 0L,
    public var lastInputTime: Long = 0L,
    public var logonTime: Long = 0L,
    public var currentTime: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wtsinfoa) return false
        if (this.state != other.state) return false
        if (this.sessionId != other.sessionId) return false
        if (this.incomingBytes != other.incomingBytes) return false
        if (this.outgoingBytes != other.outgoingBytes) return false
        if (this.incomingFrames != other.incomingFrames) return false
        if (this.outgoingFrames != other.outgoingFrames) return false
        if (this.incomingCompressedBytes != other.incomingCompressedBytes) return false
        if (this.outgoingCompressedBy != other.outgoingCompressedBy) return false
        if (!this.winStationName.contentEquals(other.winStationName)) return false
        if (!this.domain.contentEquals(other.domain)) return false
        if (!this.userName.contentEquals(other.userName)) return false
        if (this.connectTime != other.connectTime) return false
        if (this.disconnectTime != other.disconnectTime) return false
        if (this.lastInputTime != other.lastInputTime) return false
        if (this.logonTime != other.logonTime) return false
        if (this.currentTime != other.currentTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.state.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.incomingBytes.hashCode()
        result = 31 * result + this.outgoingBytes.hashCode()
        result = 31 * result + this.incomingFrames.hashCode()
        result = 31 * result + this.outgoingFrames.hashCode()
        result = 31 * result + this.incomingCompressedBytes.hashCode()
        result = 31 * result + this.outgoingCompressedBy.hashCode()
        result = 31 * result + this.winStationName.contentHashCode()
        result = 31 * result + this.domain.contentHashCode()
        result = 31 * result + this.userName.contentHashCode()
        result = 31 * result + this.connectTime.hashCode()
        result = 31 * result + this.disconnectTime.hashCode()
        result = 31 * result + this.lastInputTime.hashCode()
        result = 31 * result + this.logonTime.hashCode()
        result = 31 * result + this.currentTime.hashCode()
        return result
    }
}

public data class Wtsinfoexa(
    public var level: UInt = 0u,
    public var data: WtsinfoexLevelA = WtsinfoexLevelA(),
)

public data class Wtsinfoexw(
    public var level: UInt = 0u,
    public var data: WtsinfoexLevelW = WtsinfoexLevelW(),
)

public class WtsinfoexLevel1A(
    public var sessionId: UInt = 0u,
    public var sessionState: WtsConnectstateClass = 0,
    public var sessionFlags: Int = 0,
    public var winStationName: ByteArray = ByteArray(33),
    public var userName: ByteArray = ByteArray(21),
    public var domainName: ByteArray = ByteArray(18),
    public var logonTime: Long = 0L,
    public var connectTime: Long = 0L,
    public var disconnectTime: Long = 0L,
    public var lastInputTime: Long = 0L,
    public var currentTime: Long = 0L,
    public var incomingBytes: UInt = 0u,
    public var outgoingBytes: UInt = 0u,
    public var incomingFrames: UInt = 0u,
    public var outgoingFrames: UInt = 0u,
    public var incomingCompressedBytes: UInt = 0u,
    public var outgoingCompressedBytes: UInt = 0u,
)

public class WtsinfoexLevel1W(
    public var sessionId: UInt = 0u,
    public var sessionState: WtsConnectstateClass = 0,
    public var sessionFlags: Int = 0,
    public var winStationName: UShortArray = UShortArray(33),
    public var userName: UShortArray = UShortArray(21),
    public var domainName: UShortArray = UShortArray(18),
    public var logonTime: Long = 0L,
    public var connectTime: Long = 0L,
    public var disconnectTime: Long = 0L,
    public var lastInputTime: Long = 0L,
    public var currentTime: Long = 0L,
    public var incomingBytes: UInt = 0u,
    public var outgoingBytes: UInt = 0u,
    public var incomingFrames: UInt = 0u,
    public var outgoingFrames: UInt = 0u,
    public var incomingCompressedBytes: UInt = 0u,
    public var outgoingCompressedBytes: UInt = 0u,
)

public data class WtsinfoexLevelA(
    public var wTSInfoExLevel1: WtsinfoexLevel1A = WtsinfoexLevel1A(),
)

public data class WtsinfoexLevelW(
    public var wTSInfoExLevel1: WtsinfoexLevel1W = WtsinfoexLevel1W(),
)

public data class Wtsinfow(
    public var state: WtsConnectstateClass = 0,
    public var sessionId: UInt = 0u,
    public var incomingBytes: UInt = 0u,
    public var outgoingBytes: UInt = 0u,
    public var incomingFrames: UInt = 0u,
    public var outgoingFrames: UInt = 0u,
    public var incomingCompressedBytes: UInt = 0u,
    public var outgoingCompressedBytes: UInt = 0u,
    public var winStationName: UShortArray = UShortArray(32),
    public var domain: UShortArray = UShortArray(17),
    public var userName: UShortArray = UShortArray(21),
    public var connectTime: Long = 0L,
    public var disconnectTime: Long = 0L,
    public var lastInputTime: Long = 0L,
    public var logonTime: Long = 0L,
    public var currentTime: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wtsinfow) return false
        if (this.state != other.state) return false
        if (this.sessionId != other.sessionId) return false
        if (this.incomingBytes != other.incomingBytes) return false
        if (this.outgoingBytes != other.outgoingBytes) return false
        if (this.incomingFrames != other.incomingFrames) return false
        if (this.outgoingFrames != other.outgoingFrames) return false
        if (this.incomingCompressedBytes != other.incomingCompressedBytes) return false
        if (this.outgoingCompressedBytes != other.outgoingCompressedBytes) return false
        if (!this.winStationName.contentEquals(other.winStationName)) return false
        if (!this.domain.contentEquals(other.domain)) return false
        if (!this.userName.contentEquals(other.userName)) return false
        if (this.connectTime != other.connectTime) return false
        if (this.disconnectTime != other.disconnectTime) return false
        if (this.lastInputTime != other.lastInputTime) return false
        if (this.logonTime != other.logonTime) return false
        if (this.currentTime != other.currentTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.state.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.incomingBytes.hashCode()
        result = 31 * result + this.outgoingBytes.hashCode()
        result = 31 * result + this.incomingFrames.hashCode()
        result = 31 * result + this.outgoingFrames.hashCode()
        result = 31 * result + this.incomingCompressedBytes.hashCode()
        result = 31 * result + this.outgoingCompressedBytes.hashCode()
        result = 31 * result + this.winStationName.contentHashCode()
        result = 31 * result + this.domain.contentHashCode()
        result = 31 * result + this.userName.contentHashCode()
        result = 31 * result + this.connectTime.hashCode()
        result = 31 * result + this.disconnectTime.hashCode()
        result = 31 * result + this.lastInputTime.hashCode()
        result = 31 * result + this.logonTime.hashCode()
        result = 31 * result + this.currentTime.hashCode()
        return result
    }
}

public class Wtslistenerconfiga(
    public var version: UInt = 0u,
    public var fEnableListener: UInt = 0u,
    public var maxConnectionCount: UInt = 0u,
    public var fPromptForPassword: UInt = 0u,
    public var fInheritColorDepth: UInt = 0u,
    public var colorDepth: UInt = 0u,
    public var fInheritBrokenTimeoutSettings: UInt = 0u,
    public var brokenTimeoutSettings: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDriveRedirection: UInt = 0u,
    public var fDisableComPortRedirection: UInt = 0u,
    public var fDisableLPTPortRedirection: UInt = 0u,
    public var fDisableClipboardRedirection: UInt = 0u,
    public var fDisableAudioRedirection: UInt = 0u,
    public var fDisablePNPRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var lanAdapter: UInt = 0u,
    public var portNumber: UInt = 0u,
    public var fInheritShadowSettings: UInt = 0u,
    public var shadowSettings: UInt = 0u,
    public var timeoutSettingsConnection: UInt = 0u,
    public var timeoutSettingsDisconnection: UInt = 0u,
    public var timeoutSettingsIdle: UInt = 0u,
    public var securityLayer: UInt = 0u,
    public var minEncryptionLevel: UInt = 0u,
    public var userAuthentication: UInt = 0u,
    public var comment: ByteArray = ByteArray(61),
    public var logonUserName: ByteArray = ByteArray(21),
    public var logonDomain: ByteArray = ByteArray(18),
    public var workDirectory: ByteArray = ByteArray(261),
    public var initialProgram: ByteArray = ByteArray(261),
)

public class Wtslistenerconfigw(
    public var version: UInt = 0u,
    public var fEnableListener: UInt = 0u,
    public var maxConnectionCount: UInt = 0u,
    public var fPromptForPassword: UInt = 0u,
    public var fInheritColorDepth: UInt = 0u,
    public var colorDepth: UInt = 0u,
    public var fInheritBrokenTimeoutSettings: UInt = 0u,
    public var brokenTimeoutSettings: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDriveRedirection: UInt = 0u,
    public var fDisableComPortRedirection: UInt = 0u,
    public var fDisableLPTPortRedirection: UInt = 0u,
    public var fDisableClipboardRedirection: UInt = 0u,
    public var fDisableAudioRedirection: UInt = 0u,
    public var fDisablePNPRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var lanAdapter: UInt = 0u,
    public var portNumber: UInt = 0u,
    public var fInheritShadowSettings: UInt = 0u,
    public var shadowSettings: UInt = 0u,
    public var timeoutSettingsConnection: UInt = 0u,
    public var timeoutSettingsDisconnection: UInt = 0u,
    public var timeoutSettingsIdle: UInt = 0u,
    public var securityLayer: UInt = 0u,
    public var minEncryptionLevel: UInt = 0u,
    public var userAuthentication: UInt = 0u,
    public var comment: UShortArray = UShortArray(61),
    public var logonUserName: UShortArray = UShortArray(21),
    public var logonDomain: UShortArray = UShortArray(18),
    public var workDirectory: UShortArray = UShortArray(261),
    public var initialProgram: UShortArray = UShortArray(261),
)

public data class WtssbxIpAddress(
    public var addressFamily: WtssbxAddressFamily = 0,
    public var address: UByteArray = UByteArray(16),
    public var portNumber: UShort = 0u,
    public var dwScope: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtssbxIpAddress) return false
        if (this.addressFamily != other.addressFamily) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.portNumber != other.portNumber) return false
        if (this.dwScope != other.dwScope) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressFamily.hashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.dwScope.hashCode()
        return result
    }
}

public data class WtssbxMachineConnectInfo(
    public var wczMachineFQDN: UShortArray = UShortArray(257),
    public var wczMachineNetBiosName: UShortArray = UShortArray(17),
    public var dwNumOfIPAddr: UInt = 0u,
    public var iPaddr: List<WtssbxIpAddress> = List(12) { WtssbxIpAddress() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtssbxMachineConnectInfo) return false
        if (!this.wczMachineFQDN.contentEquals(other.wczMachineFQDN)) return false
        if (!this.wczMachineNetBiosName.contentEquals(other.wczMachineNetBiosName)) return false
        if (this.dwNumOfIPAddr != other.dwNumOfIPAddr) return false
        if (this.iPaddr != other.iPaddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wczMachineFQDN.contentHashCode()
        result = 31 * result + this.wczMachineNetBiosName.contentHashCode()
        result = 31 * result + this.dwNumOfIPAddr.hashCode()
        result = 31 * result + this.iPaddr.hashCode()
        return result
    }
}

public data class WtssbxMachineInfo(
    public var clientConnectInfo: WtssbxMachineConnectInfo = WtssbxMachineConnectInfo(),
    public var wczFarmName: UShortArray = UShortArray(257),
    public var internalIPAddress: WtssbxIpAddress = WtssbxIpAddress(),
    public var dwMaxSessionsLimit: UInt = 0u,
    public var serverWeight: UInt = 0u,
    public var singleSessionMode: WtssbxMachineSessionMode = 0,
    public var inDrain: WtssbxMachineDrain = 0,
    public var machineState: WtssbxMachineState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtssbxMachineInfo) return false
        if (this.clientConnectInfo != other.clientConnectInfo) return false
        if (!this.wczFarmName.contentEquals(other.wczFarmName)) return false
        if (this.internalIPAddress != other.internalIPAddress) return false
        if (this.dwMaxSessionsLimit != other.dwMaxSessionsLimit) return false
        if (this.serverWeight != other.serverWeight) return false
        if (this.singleSessionMode != other.singleSessionMode) return false
        if (this.inDrain != other.inDrain) return false
        if (this.machineState != other.machineState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientConnectInfo.hashCode()
        result = 31 * result + this.wczFarmName.contentHashCode()
        result = 31 * result + this.internalIPAddress.hashCode()
        result = 31 * result + this.dwMaxSessionsLimit.hashCode()
        result = 31 * result + this.serverWeight.hashCode()
        result = 31 * result + this.singleSessionMode.hashCode()
        result = 31 * result + this.inDrain.hashCode()
        result = 31 * result + this.machineState.hashCode()
        return result
    }
}

public data class WtssbxSessionInfo(
    public var wszUserName: UShortArray = UShortArray(105),
    public var wszDomainName: UShortArray = UShortArray(257),
    public var applicationType: UShortArray = UShortArray(257),
    public var dwSessionId: UInt = 0u,
    public var createTime: Filetime = Filetime(),
    public var disconnectTime: Filetime = Filetime(),
    public var sessionState: WtssbxSessionState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtssbxSessionInfo) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (!this.wszDomainName.contentEquals(other.wszDomainName)) return false
        if (!this.applicationType.contentEquals(other.applicationType)) return false
        if (this.dwSessionId != other.dwSessionId) return false
        if (this.createTime != other.createTime) return false
        if (this.disconnectTime != other.disconnectTime) return false
        if (this.sessionState != other.sessionState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszUserName.contentHashCode()
        result = 31 * result + this.wszDomainName.contentHashCode()
        result = 31 * result + this.applicationType.contentHashCode()
        result = 31 * result + this.dwSessionId.hashCode()
        result = 31 * result + this.createTime.hashCode()
        result = 31 * result + this.disconnectTime.hashCode()
        result = 31 * result + this.sessionState.hashCode()
        return result
    }
}

public data class WtssessionNotification(
    public var cbSize: UInt = 0u,
    public var dwSessionId: UInt = 0u,
)

public class Wtsuserconfiga(
    public var source: UInt = 0u,
    public var inheritInitialProgram: UInt = 0u,
    public var allowLogonTerminalServer: UInt = 0u,
    public var timeoutSettingsConnections: UInt = 0u,
    public var timeoutSettingsDisconnections: UInt = 0u,
    public var timeoutSettingsIdle: UInt = 0u,
    public var deviceClientDrives: UInt = 0u,
    public var deviceClientPrinters: UInt = 0u,
    public var clientDefaultPrinter: UInt = 0u,
    public var brokenTimeoutSettings: UInt = 0u,
    public var reconnectSettings: UInt = 0u,
    public var shadowingSettings: UInt = 0u,
    public var terminalServerRemoteHomeDir: UInt = 0u,
    public var initialProgram: ByteArray = ByteArray(261),
    public var workDirectory: ByteArray = ByteArray(261),
    public var terminalServerProfilePath: ByteArray = ByteArray(261),
    public var terminalServerHomeDir: ByteArray = ByteArray(261),
    public var terminalServerHomeDirDrive: ByteArray = ByteArray(4),
)

public class Wtsuserconfigw(
    public var source: UInt = 0u,
    public var inheritInitialProgram: UInt = 0u,
    public var allowLogonTerminalServer: UInt = 0u,
    public var timeoutSettingsConnections: UInt = 0u,
    public var timeoutSettingsDisconnections: UInt = 0u,
    public var timeoutSettingsIdle: UInt = 0u,
    public var deviceClientDrives: UInt = 0u,
    public var deviceClientPrinters: UInt = 0u,
    public var clientDefaultPrinter: UInt = 0u,
    public var brokenTimeoutSettings: UInt = 0u,
    public var reconnectSettings: UInt = 0u,
    public var shadowingSettings: UInt = 0u,
    public var terminalServerRemoteHomeDir: UInt = 0u,
    public var initialProgram: UShortArray = UShortArray(261),
    public var workDirectory: UShortArray = UShortArray(261),
    public var terminalServerProfilePath: UShortArray = UShortArray(261),
    public var terminalServerHomeDir: UShortArray = UShortArray(261),
    public var terminalServerHomeDirDrive: UShortArray = UShortArray(4),
)

public data class WtsCacheStats(
    public var specific: UInt = 0u,
    public var data: WtsCacheStatsUn = WtsCacheStatsUn(),
    public var protocolType: UShort = 0u,
    public var length: UShort = 0u,
)

public data class WtsCacheStatsUn(
    public var protocolCache: List<WtsProtocolCache> = List(4) { WtsProtocolCache() },
    public var tShareCacheStats: UInt = 0u,
    public var reserved: UIntArray = UIntArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsCacheStatsUn) return false
        if (this.protocolCache != other.protocolCache) return false
        if (this.tShareCacheStats != other.tShareCacheStats) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protocolCache.hashCode()
        result = 31 * result + this.tShareCacheStats.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class WtsClientAddress(
    public var addressFamily: UInt = 0u,
    public var address: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsClientAddress) return false
        if (this.addressFamily != other.addressFamily) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressFamily.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public class WtsClientData(
    public var fDisableCtrlAltDel: Boolean = false,
    public var fDoubleClickDetect: Boolean = false,
    public var fEnableWindowsKey: Boolean = false,
    public var fHideTitleBar: Boolean = false,
    public var fInheritAutoLogon: Bool = 0,
    public var fPromptForPassword: Boolean = false,
    public var fUsingSavedCreds: Boolean = false,
    public var domain: UShortArray = UShortArray(256),
    public var userName: UShortArray = UShortArray(256),
    public var password: UShortArray = UShortArray(256),
    public var fPasswordIsScPin: Boolean = false,
    public var fInheritInitialProgram: Bool = 0,
    public var workDirectory: UShortArray = UShortArray(257),
    public var initialProgram: UShortArray = UShortArray(257),
    public var fMaximizeShell: Boolean = false,
    public var encryptionLevel: UByte = 0u,
    public var performanceFlags: UInt = 0u,
    public var protocolName: UShortArray = UShortArray(9),
    public var protocolType: UShort = 0u,
    public var fInheritColorDepth: Bool = 0,
    public var hRes: UShort = 0u,
    public var vRes: UShort = 0u,
    public var colorDepth: UShort = 0u,
    public var displayDriverName: UShortArray = UShortArray(9),
    public var displayDeviceName: UShortArray = UShortArray(20),
    public var fMouse: Boolean = false,
    public var keyboardLayout: UInt = 0u,
    public var keyboardType: UInt = 0u,
    public var keyboardSubType: UInt = 0u,
    public var keyboardFunctionKey: UInt = 0u,
    public var imeFileName: UShortArray = UShortArray(33),
    public var activeInputLocale: UInt = 0u,
    public var fNoAudioPlayback: Boolean = false,
    public var fRemoteConsoleAudio: Boolean = false,
    public var audioDriverName: UShortArray = UShortArray(9),
    public var clientTimeZone: WtsTimeZoneInformation = WtsTimeZoneInformation(),
    public var clientName: UShortArray = UShortArray(21),
    public var serialNumber: UInt = 0u,
    public var clientAddressFamily: UInt = 0u,
    public var clientAddress: UShortArray = UShortArray(31),
    public var clientSockAddress: WtsSockaddr = WtsSockaddr(),
    public var clientDirectory: UShortArray = UShortArray(257),
    public var clientBuildNumber: UInt = 0u,
    public var clientProductId: UShort = 0u,
    public var outBufCountHost: UShort = 0u,
    public var outBufCountClient: UShort = 0u,
    public var outBufLength: UShort = 0u,
    public var clientSessionId: UInt = 0u,
    public var clientDigProductId: UShortArray = UShortArray(33),
    public var fDisableCpm: Boolean = false,
    public var fDisableCdm: Boolean = false,
    public var fDisableCcm: Boolean = false,
    public var fDisableLPT: Boolean = false,
    public var fDisableClip: Boolean = false,
    public var fDisablePNP: Boolean = false,
)

public data class WtsClientDisplay(
    public var horizontalResolution: UInt = 0u,
    public var verticalResolution: UInt = 0u,
    public var colorDepth: UInt = 0u,
)

public data class WtsDisplayIoctl(
    public var pDisplayIOCtlData: UByteArray = UByteArray(256),
    public var cbDisplayIOCtlData: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsDisplayIoctl) return false
        if (!this.pDisplayIOCtlData.contentEquals(other.pDisplayIOCtlData)) return false
        if (this.cbDisplayIOCtlData != other.cbDisplayIOCtlData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDisplayIOCtlData.contentHashCode()
        result = 31 * result + this.cbDisplayIOCtlData.hashCode()
        return result
    }
}

public data class WtsLicenseCapabilities(
    public var keyExchangeAlg: UInt = 0u,
    public var protocolVer: UInt = 0u,
    public var fAuthenticateServer: Bool = 0,
    public var certType: WtsCertType = 0,
    public var cbClientName: UInt = 0u,
    public var rgbClientName: UByteArray = UByteArray(42),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsLicenseCapabilities) return false
        if (this.keyExchangeAlg != other.keyExchangeAlg) return false
        if (this.protocolVer != other.protocolVer) return false
        if (this.fAuthenticateServer != other.fAuthenticateServer) return false
        if (this.certType != other.certType) return false
        if (this.cbClientName != other.cbClientName) return false
        if (!this.rgbClientName.contentEquals(other.rgbClientName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyExchangeAlg.hashCode()
        result = 31 * result + this.protocolVer.hashCode()
        result = 31 * result + this.fAuthenticateServer.hashCode()
        result = 31 * result + this.certType.hashCode()
        result = 31 * result + this.cbClientName.hashCode()
        result = 31 * result + this.rgbClientName.contentHashCode()
        return result
    }
}

public data class WtsPolicyData(
    public var fDisableEncryption: Boolean = false,
    public var fDisableAutoReconnect: Boolean = false,
    public var colorDepth: UInt = 0u,
    public var minEncryptionLevel: UByte = 0u,
    public var fDisableCpm: Boolean = false,
    public var fDisableCdm: Boolean = false,
    public var fDisableCcm: Boolean = false,
    public var fDisableLPT: Boolean = false,
    public var fDisableClip: Boolean = false,
    public var fDisablePNPRedir: Boolean = false,
)

public data class WtsProcessInfoa(
    public var sessionId: UInt = 0u,
    public var processId: UInt = 0u,
    public var pProcessName: Pstr = null,
    public var pUserSid: Psid = null,
)

public data class WtsProcessInfow(
    public var sessionId: UInt = 0u,
    public var processId: UInt = 0u,
    public var pProcessName: Pwstr = null,
    public var pUserSid: Psid = null,
)

public data class WtsProcessInfoExa(
    public var sessionId: UInt = 0u,
    public var processId: UInt = 0u,
    public var pProcessName: Pstr = null,
    public var pUserSid: Psid = null,
    public var numberOfThreads: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pagefileUsage: UInt = 0u,
    public var peakPagefileUsage: UInt = 0u,
    public var workingSetSize: UInt = 0u,
    public var peakWorkingSetSize: UInt = 0u,
    public var userTime: Long = 0L,
    public var kernelTime: Long = 0L,
)

public data class WtsProcessInfoExw(
    public var sessionId: UInt = 0u,
    public var processId: UInt = 0u,
    public var pProcessName: Pwstr = null,
    public var pUserSid: Psid = null,
    public var numberOfThreads: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pagefileUsage: UInt = 0u,
    public var peakPagefileUsage: UInt = 0u,
    public var workingSetSize: UInt = 0u,
    public var peakWorkingSetSize: UInt = 0u,
    public var userTime: Long = 0L,
    public var kernelTime: Long = 0L,
)

public data class WtsPropertyValue(
    public var type: UShort = 0u,
    public var u: WtsPropertyValue0 = WtsPropertyValue0(),
)

public data class WtsPropertyValue0(
    public var ulVal: UInt = 0u,
    public var strVal: WtsPropertyValue00 = WtsPropertyValue00(),
    public var bVal: WtsPropertyValue01 = WtsPropertyValue01(),
    public var guidVal: Guid = Guid(),
)

public data class WtsPropertyValue01(
    public var size: UInt = 0u,
    public var pbVal: Pstr = null,
)

public data class WtsPropertyValue00(
    public var size: UInt = 0u,
    public var pstrVal: Pwstr = null,
)

public data class WtsProtocolCache(
    public var cacheReads: UInt = 0u,
    public var cacheHits: UInt = 0u,
)

public class WtsProtocolCounters(
    public var wdBytes: UInt = 0u,
    public var wdFrames: UInt = 0u,
    public var waitForOutBuf: UInt = 0u,
    public var frames: UInt = 0u,
    public var bytes: UInt = 0u,
    public var compressedBytes: UInt = 0u,
    public var compressFlushes: UInt = 0u,
    public var errors: UInt = 0u,
    public var timeouts: UInt = 0u,
    public var asyncFramingError: UInt = 0u,
    public var asyncOverrunError: UInt = 0u,
    public var asyncOverflowError: UInt = 0u,
    public var asyncParityError: UInt = 0u,
    public var tdErrors: UInt = 0u,
    public var protocolType: UShort = 0u,
    public var length: UShort = 0u,
    public var specific: UShort = 0u,
    public var reserved: UIntArray = UIntArray(100),
)

public data class WtsProtocolStatus(
    public var output: WtsProtocolCounters = WtsProtocolCounters(),
    public var input: WtsProtocolCounters = WtsProtocolCounters(),
    public var cache: WtsCacheStats = WtsCacheStats(),
    public var asyncSignal: UInt = 0u,
    public var asyncSignalMask: UInt = 0u,
    public var counters: LongArray = LongArray(100),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsProtocolStatus) return false
        if (this.output != other.output) return false
        if (this.input != other.input) return false
        if (this.cache != other.cache) return false
        if (this.asyncSignal != other.asyncSignal) return false
        if (this.asyncSignalMask != other.asyncSignalMask) return false
        if (!this.counters.contentEquals(other.counters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.output.hashCode()
        result = 31 * result + this.input.hashCode()
        result = 31 * result + this.cache.hashCode()
        result = 31 * result + this.asyncSignal.hashCode()
        result = 31 * result + this.asyncSignalMask.hashCode()
        result = 31 * result + this.counters.contentHashCode()
        return result
    }
}

public data class WtsServerInfoa(
    public var pServerName: Pstr = null,
)

public data class WtsServerInfow(
    public var pServerName: Pwstr = null,
)

public data class WtsServiceState(
    public var rcmServiceState: WtsRcmServiceState = 0,
    public var rcmDrainState: WtsRcmDrainState = 0,
)

public data class WtsSessionAddress(
    public var addressFamily: UInt = 0u,
    public var address: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSessionAddress) return false
        if (this.addressFamily != other.addressFamily) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressFamily.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public data class WtsSessionId(
    public var sessionUniqueGuid: Guid = Guid(),
    public var sessionId: UInt = 0u,
)

public data class WtsSessionInfoa(
    public var sessionId: UInt = 0u,
    public var pWinStationName: Pstr = null,
    public var state: WtsConnectstateClass = 0,
)

public data class WtsSessionInfow(
    public var sessionId: UInt = 0u,
    public var pWinStationName: Pwstr = null,
    public var state: WtsConnectstateClass = 0,
)

public data class WtsSessionInfo1a(
    public var execEnvId: UInt = 0u,
    public var state: WtsConnectstateClass = 0,
    public var sessionId: UInt = 0u,
    public var pSessionName: Pstr = null,
    public var pHostName: Pstr = null,
    public var pUserName: Pstr = null,
    public var pDomainName: Pstr = null,
    public var pFarmName: Pstr = null,
)

public data class WtsSessionInfo1w(
    public var execEnvId: UInt = 0u,
    public var state: WtsConnectstateClass = 0,
    public var sessionId: UInt = 0u,
    public var pSessionName: Pwstr = null,
    public var pHostName: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var pDomainName: Pwstr = null,
    public var pFarmName: Pwstr = null,
)

public data class WtsSmallRect(
    public var left: Short = 0,
    public var top: Short = 0,
    public var right: Short = 0,
    public var bottom: Short = 0,
)

public data class WtsSockaddr(
    public var sinFamily: UShort = 0u,
    public var u: WtsSockaddr0 = WtsSockaddr0(),
)

public data class WtsSockaddr0(
    public var ipv4: WtsSockaddr00 = WtsSockaddr00(),
    public var ipv6: WtsSockaddr01 = WtsSockaddr01(),
)

public data class WtsSockaddr00(
    public var sinPort: UShort = 0u,
    public var inAddr: UInt = 0u,
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSockaddr00) return false
        if (this.sinPort != other.sinPort) return false
        if (this.inAddr != other.inAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinPort.hashCode()
        result = 31 * result + this.inAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class WtsSockaddr01(
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: UShortArray = UShortArray(8),
    public var sin6ScopeId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsSockaddr01) return false
        if (this.sin6Port != other.sin6Port) return false
        if (this.sin6Flowinfo != other.sin6Flowinfo) return false
        if (!this.sin6Addr.contentEquals(other.sin6Addr)) return false
        if (this.sin6ScopeId != other.sin6ScopeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6Port.hashCode()
        result = 31 * result + this.sin6Flowinfo.hashCode()
        result = 31 * result + this.sin6Addr.contentHashCode()
        result = 31 * result + this.sin6ScopeId.hashCode()
        return result
    }
}

public data class WtsSystemtime(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
)

public data class WtsTimeZoneInformation(
    public var bias: Int = 0,
    public var standardName: UShortArray = UShortArray(32),
    public var standardDate: WtsSystemtime = WtsSystemtime(),
    public var standardBias: Int = 0,
    public var daylightName: UShortArray = UShortArray(32),
    public var daylightDate: WtsSystemtime = WtsSystemtime(),
    public var daylightBias: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsTimeZoneInformation) return false
        if (this.bias != other.bias) return false
        if (!this.standardName.contentEquals(other.standardName)) return false
        if (this.standardDate != other.standardDate) return false
        if (this.standardBias != other.standardBias) return false
        if (!this.daylightName.contentEquals(other.daylightName)) return false
        if (this.daylightDate != other.daylightDate) return false
        if (this.daylightBias != other.daylightBias) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bias.hashCode()
        result = 31 * result + this.standardName.contentHashCode()
        result = 31 * result + this.standardDate.hashCode()
        result = 31 * result + this.standardBias.hashCode()
        result = 31 * result + this.daylightName.contentHashCode()
        result = 31 * result + this.daylightDate.hashCode()
        result = 31 * result + this.daylightBias.hashCode()
        return result
    }
}

public data class WtsUserCredential(
    public var userName: UShortArray = UShortArray(256),
    public var password: UShortArray = UShortArray(256),
    public var domain: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsUserCredential) return false
        if (!this.userName.contentEquals(other.userName)) return false
        if (!this.password.contentEquals(other.password)) return false
        if (!this.domain.contentEquals(other.domain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userName.contentHashCode()
        result = 31 * result + this.password.contentHashCode()
        result = 31 * result + this.domain.contentHashCode()
        return result
    }
}

public data class WtsUserData(
    public var workDirectory: UShortArray = UShortArray(257),
    public var initialProgram: UShortArray = UShortArray(257),
    public var userTimeZone: WtsTimeZoneInformation = WtsTimeZoneInformation(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsUserData) return false
        if (!this.workDirectory.contentEquals(other.workDirectory)) return false
        if (!this.initialProgram.contentEquals(other.initialProgram)) return false
        if (this.userTimeZone != other.userTimeZone) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.workDirectory.contentHashCode()
        result = 31 * result + this.initialProgram.contentHashCode()
        result = 31 * result + this.userTimeZone.hashCode()
        return result
    }
}

public data class WtsValidationInformationa(
    public var productInfo: ProductInfoa = ProductInfoa(),
    public var license: UByteArray = UByteArray(16384),
    public var licenseLength: UInt = 0u,
    public var hardwareID: UByteArray = UByteArray(20),
    public var hardwareIDLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsValidationInformationa) return false
        if (this.productInfo != other.productInfo) return false
        if (!this.license.contentEquals(other.license)) return false
        if (this.licenseLength != other.licenseLength) return false
        if (!this.hardwareID.contentEquals(other.hardwareID)) return false
        if (this.hardwareIDLength != other.hardwareIDLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productInfo.hashCode()
        result = 31 * result + this.license.contentHashCode()
        result = 31 * result + this.licenseLength.hashCode()
        result = 31 * result + this.hardwareID.contentHashCode()
        result = 31 * result + this.hardwareIDLength.hashCode()
        return result
    }
}

public data class WtsValidationInformationw(
    public var productInfo: ProductInfow = ProductInfow(),
    public var license: UByteArray = UByteArray(16384),
    public var licenseLength: UInt = 0u,
    public var hardwareID: UByteArray = UByteArray(20),
    public var hardwareIDLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsValidationInformationw) return false
        if (this.productInfo != other.productInfo) return false
        if (!this.license.contentEquals(other.license)) return false
        if (this.licenseLength != other.licenseLength) return false
        if (!this.hardwareID.contentEquals(other.hardwareID)) return false
        if (this.hardwareIDLength != other.hardwareIDLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.productInfo.hashCode()
        result = 31 * result + this.license.contentHashCode()
        result = 31 * result + this.licenseLength.hashCode()
        result = 31 * result + this.hardwareID.contentHashCode()
        result = 31 * result + this.hardwareIDLength.hashCode()
        return result
    }
}

public data class PluginResource(
    public var alias: UShortArray = UShortArray(256),
    public var name: UShortArray = UShortArray(256),
    public var resourceFileContents: Pwstr = null,
    public var fileExtension: UShortArray = UShortArray(256),
    public var resourcePluginType: UShortArray = UShortArray(256),
    public var isDiscoverable: UByte = 0u,
    public var resourceType: Int = 0,
    public var pceIconSize: UInt = 0u,
    public var iconContents: COpaquePointer? = null,
    public var pcePluginBlobSize: UInt = 0u,
    public var blobContents: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PluginResource) return false
        if (!this.alias.contentEquals(other.alias)) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.resourceFileContents != other.resourceFileContents) return false
        if (!this.fileExtension.contentEquals(other.fileExtension)) return false
        if (!this.resourcePluginType.contentEquals(other.resourcePluginType)) return false
        if (this.isDiscoverable != other.isDiscoverable) return false
        if (this.resourceType != other.resourceType) return false
        if (this.pceIconSize != other.pceIconSize) return false
        if (this.iconContents != other.iconContents) return false
        if (this.pcePluginBlobSize != other.pcePluginBlobSize) return false
        if (this.blobContents != other.blobContents) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alias.contentHashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.resourceFileContents.hashCode()
        result = 31 * result + this.fileExtension.contentHashCode()
        result = 31 * result + this.resourcePluginType.contentHashCode()
        result = 31 * result + this.isDiscoverable.hashCode()
        result = 31 * result + this.resourceType.hashCode()
        result = 31 * result + this.pceIconSize.hashCode()
        result = 31 * result + this.iconContents.hashCode()
        result = 31 * result + this.pcePluginBlobSize.hashCode()
        result = 31 * result + this.blobContents.hashCode()
        return result
    }
}

public data class PluginResource2(
    public var resourceV1: PluginResource = PluginResource(),
    public var pceFileAssocListSize: UInt = 0u,
    public var fileAssocList: PluginResource2FileAssociation? = null,
    public var securityDescriptor: Pwstr = null,
    public var pceFolderListSize: UInt = 0u,
    public var folderList: COpaquePointer? = null,
)

public data class PluginResource2FileAssociation(
    public var extName: UShortArray = UShortArray(256),
    public var primaryHandler: UByte = 0u,
    public var pceIconSize: UInt = 0u,
    public var iconContents: COpaquePointer? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PluginResource2FileAssociation) return false
        if (!this.extName.contentEquals(other.extName)) return false
        if (this.primaryHandler != other.primaryHandler) return false
        if (this.pceIconSize != other.pceIconSize) return false
        if (this.iconContents != other.iconContents) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extName.contentHashCode()
        result = 31 * result + this.primaryHandler.hashCode()
        result = 31 * result + this.pceIconSize.hashCode()
        result = 31 * result + this.iconContents.hashCode()
        return result
    }
}
