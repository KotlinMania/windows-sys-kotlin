@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class AAAccountingData(
    public var userName: BSTR = 0L,
    public var clientName: BSTR = 0L,
    public var authType: AAAuthSchemes = 0,
    public var resourceName: BSTR = 0L,
    public var portNumber: Int = 0,
    public var protocolName: BSTR = 0L,
    public var numberOfBytesReceived: Int = 0,
    public var numberOfBytesTransfered: Int = 0,
    public var reasonForDisconnect: BSTR = 0L,
    public var mainSessionId: GUID = GUID(),
    public var subSessionId: Int = 0,
)

public data class AE_CURRENT_POSITION(
    public var u64DevicePosition: ULong = 0uL,
    public var u64StreamPosition: ULong = 0uL,
    public var u64PaddingFrames: ULong = 0uL,
    public var hnsQPCPosition: Long = 0L,
    public var f32FramesPerSecond: Float = 0.0f,
    public var Flag: AE_POSITION_FLAGS = 0,
)

public data class BITMAP_RENDERER_STATISTICS(public var dwFramesDelivered: UInt = 0u, public var dwFramesDropped: UInt = 0u)

public data class CHANNEL_DEF(public var name: ByteArray = ByteArray(8), public var options: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CHANNEL_DEF) return false
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

public data class CHANNEL_ENTRY_POINTS(
    public var cbSize: UInt = 0u,
    public var protocolVersion: UInt = 0u,
    public var pVirtualChannelInit: PVIRTUALCHANNELINIT = null,
    public var pVirtualChannelOpen: PVIRTUALCHANNELOPEN = null,
    public var pVirtualChannelClose: PVIRTUALCHANNELCLOSE = null,
    public var pVirtualChannelWrite: PVIRTUALCHANNELWRITE = null,
)

public data class CHANNEL_PDU_HEADER(public var length: UInt = 0u, public var flags: UInt = 0u)

public data class CLIENT_DISPLAY(
    public var HorizontalResolution: UInt = 0u,
    public var VerticalResolution: UInt = 0u,
    public var ColorDepth: UInt = 0u,
)

public data class PRODUCT_INFOA(public var CompanyName: ByteArray = ByteArray(256), public var ProductID: ByteArray = ByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PRODUCT_INFOA) return false
        if (!this.CompanyName.contentEquals(other.CompanyName)) return false
        if (!this.ProductID.contentEquals(other.ProductID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CompanyName.contentHashCode()
        result = 31 * result + this.ProductID.contentHashCode()
        return result
    }
}

public data class PRODUCT_INFOW(public var CompanyName: UShortArray = UShortArray(256), public var ProductID: UShortArray = UShortArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PRODUCT_INFOW) return false
        if (!this.CompanyName.contentEquals(other.CompanyName)) return false
        if (!this.ProductID.contentEquals(other.ProductID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.CompanyName.contentHashCode()
        result = 31 * result + this.ProductID.contentHashCode()
        return result
    }
}

public data class RFX_GFX_MONITOR_INFO(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
    public var physicalWidth: UInt = 0u,
    public var physicalHeight: UInt = 0u,
    public var orientation: UInt = 0u,
    public var primary: BOOL = 0,
)

public data class RFX_GFX_MSG_CLIENT_DESKTOP_INFO_REQUEST(public var channelHdr: RFX_GFX_MSG_HEADER = RFX_GFX_MSG_HEADER())

public data class RFX_GFX_MSG_CLIENT_DESKTOP_INFO_RESPONSE(
    public var channelHdr: RFX_GFX_MSG_HEADER = RFX_GFX_MSG_HEADER(),
    public var reserved: UInt = 0u,
    public var monitorCount: UInt = 0u,
    public var MonitorData: List<RFX_GFX_MONITOR_INFO> = List(16) { RFX_GFX_MONITOR_INFO() },
    public var clientUniqueId: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RFX_GFX_MSG_CLIENT_DESKTOP_INFO_RESPONSE) return false
        if (this.channelHdr != other.channelHdr) return false
        if (this.reserved != other.reserved) return false
        if (this.monitorCount != other.monitorCount) return false
        if (this.MonitorData != other.MonitorData) return false
        if (!this.clientUniqueId.contentEquals(other.clientUniqueId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.channelHdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.monitorCount.hashCode()
        result = 31 * result + this.MonitorData.hashCode()
        result = 31 * result + this.clientUniqueId.contentHashCode()
        return result
    }
}

public data class RFX_GFX_MSG_DESKTOP_CONFIG_CHANGE_CONFIRM(public var channelHdr: RFX_GFX_MSG_HEADER = RFX_GFX_MSG_HEADER())

public data class RFX_GFX_MSG_DESKTOP_CONFIG_CHANGE_NOTIFY(
    public var channelHdr: RFX_GFX_MSG_HEADER = RFX_GFX_MSG_HEADER(),
    public var ulWidth: UInt = 0u,
    public var ulHeight: UInt = 0u,
    public var ulBpp: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class RFX_GFX_MSG_DESKTOP_INPUT_RESET(
    public var channelHdr: RFX_GFX_MSG_HEADER = RFX_GFX_MSG_HEADER(),
    public var ulWidth: UInt = 0u,
    public var ulHeight: UInt = 0u,
)

public data class RFX_GFX_MSG_DESKTOP_RESEND_REQUEST(public var channelHdr: RFX_GFX_MSG_HEADER = RFX_GFX_MSG_HEADER(), public var RedrawRect: RFX_GFX_RECT = RFX_GFX_RECT())

public data class RFX_GFX_MSG_DISCONNECT_NOTIFY(public var channelHdr: RFX_GFX_MSG_HEADER = RFX_GFX_MSG_HEADER(), public var DisconnectReason: UInt = 0u)

public data class RFX_GFX_MSG_HEADER(public var uMSGType: UShort = 0u, public var cbSize: UShort = 0u)

public data class RFX_GFX_MSG_RDP_DATA(public var channelHdr: RFX_GFX_MSG_HEADER = RFX_GFX_MSG_HEADER(), public var rdpData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RFX_GFX_MSG_RDP_DATA) return false
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

public data class RFX_GFX_RECT(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
)

public data class TSSD_ConnectionPoint(
    public var ServerAddressB: UByteArray = UByteArray(16),
    public var AddressType: TSSD_AddrV46Type = 0,
    public var PortNumber: UShort = 0u,
    public var AddressScope: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TSSD_ConnectionPoint) return false
        if (!this.ServerAddressB.contentEquals(other.ServerAddressB)) return false
        if (this.AddressType != other.AddressType) return false
        if (this.PortNumber != other.PortNumber) return false
        if (this.AddressScope != other.AddressScope) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ServerAddressB.contentHashCode()
        result = 31 * result + this.AddressType.hashCode()
        result = 31 * result + this.PortNumber.hashCode()
        result = 31 * result + this.AddressScope.hashCode()
        return result
    }
}

public data class VM_NOTIFY_ENTRY(public var VmName: UShortArray = UShortArray(128), public var VmHost: UShortArray = UShortArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VM_NOTIFY_ENTRY) return false
        if (!this.VmName.contentEquals(other.VmName)) return false
        if (!this.VmHost.contentEquals(other.VmHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VmName.contentHashCode()
        result = 31 * result + this.VmHost.contentHashCode()
        return result
    }
}

public data class VM_NOTIFY_INFO(public var dwNumEntries: UInt = 0u, public var ppVmEntries: Long = 0L)

public data class VM_PATCH_INFO(public var dwNumEntries: UInt = 0u, public var pVmNames: Long = 0L)

public data class WRDS_CONNECTION_SETTING(public var WRdsConnectionSettings1: WRDS_CONNECTION_SETTINGS_1 = WRDS_CONNECTION_SETTINGS_1())

public data class WRDS_CONNECTION_SETTINGS(public var WRdsConnectionSettingLevel: WRDS_CONNECTION_SETTING_LEVEL = 0, public var WRdsConnectionSetting: WRDS_CONNECTION_SETTING = WRDS_CONNECTION_SETTING())

public class WRDS_CONNECTION_SETTINGS_1 {
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

    public var EncryptionLevel: UByte = 0u

    public var ColorDepth: UShort = 0u

    public var ProtocolType: UShort = 0u

    public var HRes: UShort = 0u

    public var VRes: UShort = 0u

    public var ClientProductId: UShort = 0u

    public var OutBufCountHost: UShort = 0u

    public var OutBufCountClient: UShort = 0u

    public var OutBufLength: UShort = 0u

    public var KeyboardLayout: UInt = 0u

    public var MaxConnectionTime: UInt = 0u

    public var MaxDisconnectionTime: UInt = 0u

    public var MaxIdleTime: UInt = 0u

    public var PerformanceFlags: UInt = 0u

    public var KeyboardType: UInt = 0u

    public var KeyboardSubType: UInt = 0u

    public var KeyboardFunctionKey: UInt = 0u

    public var ActiveInputLocale: UInt = 0u

    public var SerialNumber: UInt = 0u

    public var ClientAddressFamily: UInt = 0u

    public var ClientBuildNumber: UInt = 0u

    public var ClientSessionId: UInt = 0u

    public var WorkDirectory: UShortArray = UShortArray(257)

    public var InitialProgram: UShortArray = UShortArray(257)

    public var UserName: UShortArray = UShortArray(256)

    public var Domain: UShortArray = UShortArray(256)

    public var Password: UShortArray = UShortArray(256)

    public var ProtocolName: UShortArray = UShortArray(9)

    public var DisplayDriverName: UShortArray = UShortArray(9)

    public var DisplayDeviceName: UShortArray = UShortArray(20)

    public var imeFileName: UShortArray = UShortArray(33)

    public var AudioDriverName: UShortArray = UShortArray(9)

    public var ClientName: UShortArray = UShortArray(21)

    public var ClientAddress: UShortArray = UShortArray(31)

    public var ClientDirectory: UShortArray = UShortArray(257)

    public var ClientDigProductId: UShortArray = UShortArray(33)

    public var ClientSockAddress: WTS_SOCKADDR = WTS_SOCKADDR()

    public var ClientTimeZone: WTS_TIME_ZONE_INFORMATION = WTS_TIME_ZONE_INFORMATION()

    public var WRdsListenerSettings: WRDS_LISTENER_SETTINGS = WRDS_LISTENER_SETTINGS()

    public var EventLogActivityId: GUID = GUID()

    public var ContextSize: UInt = 0u

    public var ContextData: Long = 0L
}

public data class WRDS_DYNAMIC_TIME_ZONE_INFORMATION(
    public var Bias: Int = 0,
    public var StandardName: UShortArray = UShortArray(32),
    public var StandardDate: WTS_SYSTEMTIME = WTS_SYSTEMTIME(),
    public var StandardBias: Int = 0,
    public var DaylightName: UShortArray = UShortArray(32),
    public var DaylightDate: WTS_SYSTEMTIME = WTS_SYSTEMTIME(),
    public var DaylightBias: Int = 0,
    public var TimeZoneKeyName: UShortArray = UShortArray(128),
    public var DynamicDaylightTimeDisabled: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WRDS_DYNAMIC_TIME_ZONE_INFORMATION) return false
        if (this.Bias != other.Bias) return false
        if (!this.StandardName.contentEquals(other.StandardName)) return false
        if (this.StandardDate != other.StandardDate) return false
        if (this.StandardBias != other.StandardBias) return false
        if (!this.DaylightName.contentEquals(other.DaylightName)) return false
        if (this.DaylightDate != other.DaylightDate) return false
        if (this.DaylightBias != other.DaylightBias) return false
        if (!this.TimeZoneKeyName.contentEquals(other.TimeZoneKeyName)) return false
        if (this.DynamicDaylightTimeDisabled != other.DynamicDaylightTimeDisabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Bias.hashCode()
        result = 31 * result + this.StandardName.contentHashCode()
        result = 31 * result + this.StandardDate.hashCode()
        result = 31 * result + this.StandardBias.hashCode()
        result = 31 * result + this.DaylightName.contentHashCode()
        result = 31 * result + this.DaylightDate.hashCode()
        result = 31 * result + this.DaylightBias.hashCode()
        result = 31 * result + this.TimeZoneKeyName.contentHashCode()
        result = 31 * result + this.DynamicDaylightTimeDisabled.hashCode()
        return result
    }
}

public data class WRDS_LISTENER_SETTING(public var WRdsListenerSettings1: WRDS_LISTENER_SETTINGS_1 = WRDS_LISTENER_SETTINGS_1())

public data class WRDS_LISTENER_SETTINGS(public var WRdsListenerSettingLevel: WRDS_LISTENER_SETTING_LEVEL = 0, public var WRdsListenerSetting: WRDS_LISTENER_SETTING = WRDS_LISTENER_SETTING())

public data class WRDS_LISTENER_SETTINGS_1(
    public var MaxProtocolListenerConnectionCount: UInt = 0u,
    public var SecurityDescriptorSize: UInt = 0u,
    public var pSecurityDescriptor: Long = 0L,
)

public data class WRDS_SETTING(public var WRdsSettings1: WRDS_SETTINGS_1 = WRDS_SETTINGS_1())

public data class WRDS_SETTINGS(
    public var WRdsSettingType: WRDS_SETTING_TYPE = 0,
    public var WRdsSettingLevel: WRDS_SETTING_LEVEL = 0,
    public var WRdsSetting: WRDS_SETTING = WRDS_SETTING(),
)

public class WRDS_SETTINGS_1(
    public var WRdsDisableClipStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsDisableClipValue: UInt = 0u,
    public var WRdsDisableLPTStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsDisableLPTValue: UInt = 0u,
    public var WRdsDisableCcmStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsDisableCcmValue: UInt = 0u,
    public var WRdsDisableCdmStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsDisableCdmValue: UInt = 0u,
    public var WRdsDisableCpmStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsDisableCpmValue: UInt = 0u,
    public var WRdsDisablePnpStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsDisablePnpValue: UInt = 0u,
    public var WRdsEncryptionLevelStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsEncryptionValue: UInt = 0u,
    public var WRdsColorDepthStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsColorDepthValue: UInt = 0u,
    public var WRdsDisableAutoReconnecetStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsDisableAutoReconnecetValue: UInt = 0u,
    public var WRdsDisableEncryptionStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsDisableEncryptionValue: UInt = 0u,
    public var WRdsResetBrokenStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsResetBrokenValue: UInt = 0u,
    public var WRdsMaxIdleTimeStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsMaxIdleTimeValue: UInt = 0u,
    public var WRdsMaxDisconnectTimeStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsMaxDisconnectTimeValue: UInt = 0u,
    public var WRdsMaxConnectTimeStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsMaxConnectTimeValue: UInt = 0u,
    public var WRdsKeepAliveStatus: WRDS_SETTING_STATUS = 0,
    public var WRdsKeepAliveStartValue: Boolean = false,
    public var WRdsKeepAliveIntervalValue: UInt = 0u,
)

public class WTSCLIENTA(
    public var ClientName: ByteArray = ByteArray(21),
    public var Domain: ByteArray = ByteArray(18),
    public var UserName: ByteArray = ByteArray(21),
    public var WorkDirectory: ByteArray = ByteArray(261),
    public var InitialProgram: ByteArray = ByteArray(261),
    public var EncryptionLevel: UByte = 0u,
    public var ClientAddressFamily: UInt = 0u,
    public var ClientAddress: UShortArray = UShortArray(31),
    public var HRes: UShort = 0u,
    public var VRes: UShort = 0u,
    public var ColorDepth: UShort = 0u,
    public var ClientDirectory: ByteArray = ByteArray(261),
    public var ClientBuildNumber: UInt = 0u,
    public var ClientHardwareId: UInt = 0u,
    public var ClientProductId: UShort = 0u,
    public var OutBufCountHost: UShort = 0u,
    public var OutBufCountClient: UShort = 0u,
    public var OutBufLength: UShort = 0u,
    public var DeviceId: ByteArray = ByteArray(261),
)

public class WTSCLIENTW(
    public var ClientName: UShortArray = UShortArray(21),
    public var Domain: UShortArray = UShortArray(18),
    public var UserName: UShortArray = UShortArray(21),
    public var WorkDirectory: UShortArray = UShortArray(261),
    public var InitialProgram: UShortArray = UShortArray(261),
    public var EncryptionLevel: UByte = 0u,
    public var ClientAddressFamily: UInt = 0u,
    public var ClientAddress: UShortArray = UShortArray(31),
    public var HRes: UShort = 0u,
    public var VRes: UShort = 0u,
    public var ColorDepth: UShort = 0u,
    public var ClientDirectory: UShortArray = UShortArray(261),
    public var ClientBuildNumber: UInt = 0u,
    public var ClientHardwareId: UInt = 0u,
    public var ClientProductId: UShort = 0u,
    public var OutBufCountHost: UShort = 0u,
    public var OutBufCountClient: UShort = 0u,
    public var OutBufLength: UShort = 0u,
    public var DeviceId: UShortArray = UShortArray(261),
)

public data class WTSCONFIGINFOA(
    public var version: UInt = 0u,
    public var fConnectClientDrivesAtLogon: UInt = 0u,
    public var fConnectPrinterAtLogon: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var ShadowSettings: UInt = 0u,
    public var LogonUserName: ByteArray = ByteArray(21),
    public var LogonDomain: ByteArray = ByteArray(18),
    public var WorkDirectory: ByteArray = ByteArray(261),
    public var InitialProgram: ByteArray = ByteArray(261),
    public var ApplicationName: ByteArray = ByteArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTSCONFIGINFOA) return false
        if (this.version != other.version) return false
        if (this.fConnectClientDrivesAtLogon != other.fConnectClientDrivesAtLogon) return false
        if (this.fConnectPrinterAtLogon != other.fConnectPrinterAtLogon) return false
        if (this.fDisablePrinterRedirection != other.fDisablePrinterRedirection) return false
        if (this.fDisableDefaultMainClientPrinter != other.fDisableDefaultMainClientPrinter) return false
        if (this.ShadowSettings != other.ShadowSettings) return false
        if (!this.LogonUserName.contentEquals(other.LogonUserName)) return false
        if (!this.LogonDomain.contentEquals(other.LogonDomain)) return false
        if (!this.WorkDirectory.contentEquals(other.WorkDirectory)) return false
        if (!this.InitialProgram.contentEquals(other.InitialProgram)) return false
        if (!this.ApplicationName.contentEquals(other.ApplicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.fConnectClientDrivesAtLogon.hashCode()
        result = 31 * result + this.fConnectPrinterAtLogon.hashCode()
        result = 31 * result + this.fDisablePrinterRedirection.hashCode()
        result = 31 * result + this.fDisableDefaultMainClientPrinter.hashCode()
        result = 31 * result + this.ShadowSettings.hashCode()
        result = 31 * result + this.LogonUserName.contentHashCode()
        result = 31 * result + this.LogonDomain.contentHashCode()
        result = 31 * result + this.WorkDirectory.contentHashCode()
        result = 31 * result + this.InitialProgram.contentHashCode()
        result = 31 * result + this.ApplicationName.contentHashCode()
        return result
    }
}

public data class WTSCONFIGINFOW(
    public var version: UInt = 0u,
    public var fConnectClientDrivesAtLogon: UInt = 0u,
    public var fConnectPrinterAtLogon: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var ShadowSettings: UInt = 0u,
    public var LogonUserName: UShortArray = UShortArray(21),
    public var LogonDomain: UShortArray = UShortArray(18),
    public var WorkDirectory: UShortArray = UShortArray(261),
    public var InitialProgram: UShortArray = UShortArray(261),
    public var ApplicationName: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTSCONFIGINFOW) return false
        if (this.version != other.version) return false
        if (this.fConnectClientDrivesAtLogon != other.fConnectClientDrivesAtLogon) return false
        if (this.fConnectPrinterAtLogon != other.fConnectPrinterAtLogon) return false
        if (this.fDisablePrinterRedirection != other.fDisablePrinterRedirection) return false
        if (this.fDisableDefaultMainClientPrinter != other.fDisableDefaultMainClientPrinter) return false
        if (this.ShadowSettings != other.ShadowSettings) return false
        if (!this.LogonUserName.contentEquals(other.LogonUserName)) return false
        if (!this.LogonDomain.contentEquals(other.LogonDomain)) return false
        if (!this.WorkDirectory.contentEquals(other.WorkDirectory)) return false
        if (!this.InitialProgram.contentEquals(other.InitialProgram)) return false
        if (!this.ApplicationName.contentEquals(other.ApplicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.fConnectClientDrivesAtLogon.hashCode()
        result = 31 * result + this.fConnectPrinterAtLogon.hashCode()
        result = 31 * result + this.fDisablePrinterRedirection.hashCode()
        result = 31 * result + this.fDisableDefaultMainClientPrinter.hashCode()
        result = 31 * result + this.ShadowSettings.hashCode()
        result = 31 * result + this.LogonUserName.contentHashCode()
        result = 31 * result + this.LogonDomain.contentHashCode()
        result = 31 * result + this.WorkDirectory.contentHashCode()
        result = 31 * result + this.InitialProgram.contentHashCode()
        result = 31 * result + this.ApplicationName.contentHashCode()
        return result
    }
}

public data class WTSINFOA(
    public var State: WTS_CONNECTSTATE_CLASS = 0,
    public var SessionId: UInt = 0u,
    public var IncomingBytes: UInt = 0u,
    public var OutgoingBytes: UInt = 0u,
    public var IncomingFrames: UInt = 0u,
    public var OutgoingFrames: UInt = 0u,
    public var IncomingCompressedBytes: UInt = 0u,
    public var OutgoingCompressedBy: UInt = 0u,
    public var WinStationName: ByteArray = ByteArray(32),
    public var Domain: ByteArray = ByteArray(17),
    public var UserName: ByteArray = ByteArray(21),
    public var ConnectTime: Long = 0L,
    public var DisconnectTime: Long = 0L,
    public var LastInputTime: Long = 0L,
    public var LogonTime: Long = 0L,
    public var CurrentTime: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTSINFOA) return false
        if (this.State != other.State) return false
        if (this.SessionId != other.SessionId) return false
        if (this.IncomingBytes != other.IncomingBytes) return false
        if (this.OutgoingBytes != other.OutgoingBytes) return false
        if (this.IncomingFrames != other.IncomingFrames) return false
        if (this.OutgoingFrames != other.OutgoingFrames) return false
        if (this.IncomingCompressedBytes != other.IncomingCompressedBytes) return false
        if (this.OutgoingCompressedBy != other.OutgoingCompressedBy) return false
        if (!this.WinStationName.contentEquals(other.WinStationName)) return false
        if (!this.Domain.contentEquals(other.Domain)) return false
        if (!this.UserName.contentEquals(other.UserName)) return false
        if (this.ConnectTime != other.ConnectTime) return false
        if (this.DisconnectTime != other.DisconnectTime) return false
        if (this.LastInputTime != other.LastInputTime) return false
        if (this.LogonTime != other.LogonTime) return false
        if (this.CurrentTime != other.CurrentTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.State.hashCode()
        result = 31 * result + this.SessionId.hashCode()
        result = 31 * result + this.IncomingBytes.hashCode()
        result = 31 * result + this.OutgoingBytes.hashCode()
        result = 31 * result + this.IncomingFrames.hashCode()
        result = 31 * result + this.OutgoingFrames.hashCode()
        result = 31 * result + this.IncomingCompressedBytes.hashCode()
        result = 31 * result + this.OutgoingCompressedBy.hashCode()
        result = 31 * result + this.WinStationName.contentHashCode()
        result = 31 * result + this.Domain.contentHashCode()
        result = 31 * result + this.UserName.contentHashCode()
        result = 31 * result + this.ConnectTime.hashCode()
        result = 31 * result + this.DisconnectTime.hashCode()
        result = 31 * result + this.LastInputTime.hashCode()
        result = 31 * result + this.LogonTime.hashCode()
        result = 31 * result + this.CurrentTime.hashCode()
        return result
    }
}

public data class WTSINFOEXA(public var Level: UInt = 0u, public var Data: WTSINFOEX_LEVEL_A = WTSINFOEX_LEVEL_A())

public data class WTSINFOEXW(public var Level: UInt = 0u, public var Data: WTSINFOEX_LEVEL_W = WTSINFOEX_LEVEL_W())

public class WTSINFOEX_LEVEL1_A(
    public var SessionId: UInt = 0u,
    public var SessionState: WTS_CONNECTSTATE_CLASS = 0,
    public var SessionFlags: Int = 0,
    public var WinStationName: ByteArray = ByteArray(33),
    public var UserName: ByteArray = ByteArray(21),
    public var DomainName: ByteArray = ByteArray(18),
    public var LogonTime: Long = 0L,
    public var ConnectTime: Long = 0L,
    public var DisconnectTime: Long = 0L,
    public var LastInputTime: Long = 0L,
    public var CurrentTime: Long = 0L,
    public var IncomingBytes: UInt = 0u,
    public var OutgoingBytes: UInt = 0u,
    public var IncomingFrames: UInt = 0u,
    public var OutgoingFrames: UInt = 0u,
    public var IncomingCompressedBytes: UInt = 0u,
    public var OutgoingCompressedBytes: UInt = 0u,
)

public class WTSINFOEX_LEVEL1_W(
    public var SessionId: UInt = 0u,
    public var SessionState: WTS_CONNECTSTATE_CLASS = 0,
    public var SessionFlags: Int = 0,
    public var WinStationName: UShortArray = UShortArray(33),
    public var UserName: UShortArray = UShortArray(21),
    public var DomainName: UShortArray = UShortArray(18),
    public var LogonTime: Long = 0L,
    public var ConnectTime: Long = 0L,
    public var DisconnectTime: Long = 0L,
    public var LastInputTime: Long = 0L,
    public var CurrentTime: Long = 0L,
    public var IncomingBytes: UInt = 0u,
    public var OutgoingBytes: UInt = 0u,
    public var IncomingFrames: UInt = 0u,
    public var OutgoingFrames: UInt = 0u,
    public var IncomingCompressedBytes: UInt = 0u,
    public var OutgoingCompressedBytes: UInt = 0u,
)

public data class WTSINFOEX_LEVEL_A(public var WTSInfoExLevel1: WTSINFOEX_LEVEL1_A = WTSINFOEX_LEVEL1_A())

public data class WTSINFOEX_LEVEL_W(public var WTSInfoExLevel1: WTSINFOEX_LEVEL1_W = WTSINFOEX_LEVEL1_W())

public data class WTSINFOW(
    public var State: WTS_CONNECTSTATE_CLASS = 0,
    public var SessionId: UInt = 0u,
    public var IncomingBytes: UInt = 0u,
    public var OutgoingBytes: UInt = 0u,
    public var IncomingFrames: UInt = 0u,
    public var OutgoingFrames: UInt = 0u,
    public var IncomingCompressedBytes: UInt = 0u,
    public var OutgoingCompressedBytes: UInt = 0u,
    public var WinStationName: UShortArray = UShortArray(32),
    public var Domain: UShortArray = UShortArray(17),
    public var UserName: UShortArray = UShortArray(21),
    public var ConnectTime: Long = 0L,
    public var DisconnectTime: Long = 0L,
    public var LastInputTime: Long = 0L,
    public var LogonTime: Long = 0L,
    public var CurrentTime: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTSINFOW) return false
        if (this.State != other.State) return false
        if (this.SessionId != other.SessionId) return false
        if (this.IncomingBytes != other.IncomingBytes) return false
        if (this.OutgoingBytes != other.OutgoingBytes) return false
        if (this.IncomingFrames != other.IncomingFrames) return false
        if (this.OutgoingFrames != other.OutgoingFrames) return false
        if (this.IncomingCompressedBytes != other.IncomingCompressedBytes) return false
        if (this.OutgoingCompressedBytes != other.OutgoingCompressedBytes) return false
        if (!this.WinStationName.contentEquals(other.WinStationName)) return false
        if (!this.Domain.contentEquals(other.Domain)) return false
        if (!this.UserName.contentEquals(other.UserName)) return false
        if (this.ConnectTime != other.ConnectTime) return false
        if (this.DisconnectTime != other.DisconnectTime) return false
        if (this.LastInputTime != other.LastInputTime) return false
        if (this.LogonTime != other.LogonTime) return false
        if (this.CurrentTime != other.CurrentTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.State.hashCode()
        result = 31 * result + this.SessionId.hashCode()
        result = 31 * result + this.IncomingBytes.hashCode()
        result = 31 * result + this.OutgoingBytes.hashCode()
        result = 31 * result + this.IncomingFrames.hashCode()
        result = 31 * result + this.OutgoingFrames.hashCode()
        result = 31 * result + this.IncomingCompressedBytes.hashCode()
        result = 31 * result + this.OutgoingCompressedBytes.hashCode()
        result = 31 * result + this.WinStationName.contentHashCode()
        result = 31 * result + this.Domain.contentHashCode()
        result = 31 * result + this.UserName.contentHashCode()
        result = 31 * result + this.ConnectTime.hashCode()
        result = 31 * result + this.DisconnectTime.hashCode()
        result = 31 * result + this.LastInputTime.hashCode()
        result = 31 * result + this.LogonTime.hashCode()
        result = 31 * result + this.CurrentTime.hashCode()
        return result
    }
}

public class WTSLISTENERCONFIGA(
    public var version: UInt = 0u,
    public var fEnableListener: UInt = 0u,
    public var MaxConnectionCount: UInt = 0u,
    public var fPromptForPassword: UInt = 0u,
    public var fInheritColorDepth: UInt = 0u,
    public var ColorDepth: UInt = 0u,
    public var fInheritBrokenTimeoutSettings: UInt = 0u,
    public var BrokenTimeoutSettings: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDriveRedirection: UInt = 0u,
    public var fDisableComPortRedirection: UInt = 0u,
    public var fDisableLPTPortRedirection: UInt = 0u,
    public var fDisableClipboardRedirection: UInt = 0u,
    public var fDisableAudioRedirection: UInt = 0u,
    public var fDisablePNPRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var LanAdapter: UInt = 0u,
    public var PortNumber: UInt = 0u,
    public var fInheritShadowSettings: UInt = 0u,
    public var ShadowSettings: UInt = 0u,
    public var TimeoutSettingsConnection: UInt = 0u,
    public var TimeoutSettingsDisconnection: UInt = 0u,
    public var TimeoutSettingsIdle: UInt = 0u,
    public var SecurityLayer: UInt = 0u,
    public var MinEncryptionLevel: UInt = 0u,
    public var UserAuthentication: UInt = 0u,
    public var Comment: ByteArray = ByteArray(61),
    public var LogonUserName: ByteArray = ByteArray(21),
    public var LogonDomain: ByteArray = ByteArray(18),
    public var WorkDirectory: ByteArray = ByteArray(261),
    public var InitialProgram: ByteArray = ByteArray(261),
)

public class WTSLISTENERCONFIGW(
    public var version: UInt = 0u,
    public var fEnableListener: UInt = 0u,
    public var MaxConnectionCount: UInt = 0u,
    public var fPromptForPassword: UInt = 0u,
    public var fInheritColorDepth: UInt = 0u,
    public var ColorDepth: UInt = 0u,
    public var fInheritBrokenTimeoutSettings: UInt = 0u,
    public var BrokenTimeoutSettings: UInt = 0u,
    public var fDisablePrinterRedirection: UInt = 0u,
    public var fDisableDriveRedirection: UInt = 0u,
    public var fDisableComPortRedirection: UInt = 0u,
    public var fDisableLPTPortRedirection: UInt = 0u,
    public var fDisableClipboardRedirection: UInt = 0u,
    public var fDisableAudioRedirection: UInt = 0u,
    public var fDisablePNPRedirection: UInt = 0u,
    public var fDisableDefaultMainClientPrinter: UInt = 0u,
    public var LanAdapter: UInt = 0u,
    public var PortNumber: UInt = 0u,
    public var fInheritShadowSettings: UInt = 0u,
    public var ShadowSettings: UInt = 0u,
    public var TimeoutSettingsConnection: UInt = 0u,
    public var TimeoutSettingsDisconnection: UInt = 0u,
    public var TimeoutSettingsIdle: UInt = 0u,
    public var SecurityLayer: UInt = 0u,
    public var MinEncryptionLevel: UInt = 0u,
    public var UserAuthentication: UInt = 0u,
    public var Comment: UShortArray = UShortArray(61),
    public var LogonUserName: UShortArray = UShortArray(21),
    public var LogonDomain: UShortArray = UShortArray(18),
    public var WorkDirectory: UShortArray = UShortArray(261),
    public var InitialProgram: UShortArray = UShortArray(261),
)

public data class WTSSBX_IP_ADDRESS(
    public var AddressFamily: WTSSBX_ADDRESS_FAMILY = 0,
    public var Address: UByteArray = UByteArray(16),
    public var PortNumber: UShort = 0u,
    public var dwScope: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTSSBX_IP_ADDRESS) return false
        if (this.AddressFamily != other.AddressFamily) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (this.PortNumber != other.PortNumber) return false
        if (this.dwScope != other.dwScope) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddressFamily.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        result = 31 * result + this.PortNumber.hashCode()
        result = 31 * result + this.dwScope.hashCode()
        return result
    }
}

public data class WTSSBX_MACHINE_CONNECT_INFO(
    public var wczMachineFQDN: UShortArray = UShortArray(257),
    public var wczMachineNetBiosName: UShortArray = UShortArray(17),
    public var dwNumOfIPAddr: UInt = 0u,
    public var IPaddr: List<WTSSBX_IP_ADDRESS> = List(12) { WTSSBX_IP_ADDRESS() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTSSBX_MACHINE_CONNECT_INFO) return false
        if (!this.wczMachineFQDN.contentEquals(other.wczMachineFQDN)) return false
        if (!this.wczMachineNetBiosName.contentEquals(other.wczMachineNetBiosName)) return false
        if (this.dwNumOfIPAddr != other.dwNumOfIPAddr) return false
        if (this.IPaddr != other.IPaddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wczMachineFQDN.contentHashCode()
        result = 31 * result + this.wczMachineNetBiosName.contentHashCode()
        result = 31 * result + this.dwNumOfIPAddr.hashCode()
        result = 31 * result + this.IPaddr.hashCode()
        return result
    }
}

public data class WTSSBX_MACHINE_INFO(
    public var ClientConnectInfo: WTSSBX_MACHINE_CONNECT_INFO = WTSSBX_MACHINE_CONNECT_INFO(),
    public var wczFarmName: UShortArray = UShortArray(257),
    public var InternalIPAddress: WTSSBX_IP_ADDRESS = WTSSBX_IP_ADDRESS(),
    public var dwMaxSessionsLimit: UInt = 0u,
    public var ServerWeight: UInt = 0u,
    public var SingleSessionMode: WTSSBX_MACHINE_SESSION_MODE = 0,
    public var InDrain: WTSSBX_MACHINE_DRAIN = 0,
    public var MachineState: WTSSBX_MACHINE_STATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTSSBX_MACHINE_INFO) return false
        if (this.ClientConnectInfo != other.ClientConnectInfo) return false
        if (!this.wczFarmName.contentEquals(other.wczFarmName)) return false
        if (this.InternalIPAddress != other.InternalIPAddress) return false
        if (this.dwMaxSessionsLimit != other.dwMaxSessionsLimit) return false
        if (this.ServerWeight != other.ServerWeight) return false
        if (this.SingleSessionMode != other.SingleSessionMode) return false
        if (this.InDrain != other.InDrain) return false
        if (this.MachineState != other.MachineState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ClientConnectInfo.hashCode()
        result = 31 * result + this.wczFarmName.contentHashCode()
        result = 31 * result + this.InternalIPAddress.hashCode()
        result = 31 * result + this.dwMaxSessionsLimit.hashCode()
        result = 31 * result + this.ServerWeight.hashCode()
        result = 31 * result + this.SingleSessionMode.hashCode()
        result = 31 * result + this.InDrain.hashCode()
        result = 31 * result + this.MachineState.hashCode()
        return result
    }
}

public data class WTSSBX_SESSION_INFO(
    public var wszUserName: UShortArray = UShortArray(105),
    public var wszDomainName: UShortArray = UShortArray(257),
    public var ApplicationType: UShortArray = UShortArray(257),
    public var dwSessionId: UInt = 0u,
    public var CreateTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var DisconnectTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var SessionState: WTSSBX_SESSION_STATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTSSBX_SESSION_INFO) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (!this.wszDomainName.contentEquals(other.wszDomainName)) return false
        if (!this.ApplicationType.contentEquals(other.ApplicationType)) return false
        if (this.dwSessionId != other.dwSessionId) return false
        if (this.CreateTime != other.CreateTime) return false
        if (this.DisconnectTime != other.DisconnectTime) return false
        if (this.SessionState != other.SessionState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszUserName.contentHashCode()
        result = 31 * result + this.wszDomainName.contentHashCode()
        result = 31 * result + this.ApplicationType.contentHashCode()
        result = 31 * result + this.dwSessionId.hashCode()
        result = 31 * result + this.CreateTime.hashCode()
        result = 31 * result + this.DisconnectTime.hashCode()
        result = 31 * result + this.SessionState.hashCode()
        return result
    }
}

public data class WTSSESSION_NOTIFICATION(public var cbSize: UInt = 0u, public var dwSessionId: UInt = 0u)

public class WTSUSERCONFIGA(
    public var Source: UInt = 0u,
    public var InheritInitialProgram: UInt = 0u,
    public var AllowLogonTerminalServer: UInt = 0u,
    public var TimeoutSettingsConnections: UInt = 0u,
    public var TimeoutSettingsDisconnections: UInt = 0u,
    public var TimeoutSettingsIdle: UInt = 0u,
    public var DeviceClientDrives: UInt = 0u,
    public var DeviceClientPrinters: UInt = 0u,
    public var ClientDefaultPrinter: UInt = 0u,
    public var BrokenTimeoutSettings: UInt = 0u,
    public var ReconnectSettings: UInt = 0u,
    public var ShadowingSettings: UInt = 0u,
    public var TerminalServerRemoteHomeDir: UInt = 0u,
    public var InitialProgram: ByteArray = ByteArray(261),
    public var WorkDirectory: ByteArray = ByteArray(261),
    public var TerminalServerProfilePath: ByteArray = ByteArray(261),
    public var TerminalServerHomeDir: ByteArray = ByteArray(261),
    public var TerminalServerHomeDirDrive: ByteArray = ByteArray(4),
)

public class WTSUSERCONFIGW(
    public var Source: UInt = 0u,
    public var InheritInitialProgram: UInt = 0u,
    public var AllowLogonTerminalServer: UInt = 0u,
    public var TimeoutSettingsConnections: UInt = 0u,
    public var TimeoutSettingsDisconnections: UInt = 0u,
    public var TimeoutSettingsIdle: UInt = 0u,
    public var DeviceClientDrives: UInt = 0u,
    public var DeviceClientPrinters: UInt = 0u,
    public var ClientDefaultPrinter: UInt = 0u,
    public var BrokenTimeoutSettings: UInt = 0u,
    public var ReconnectSettings: UInt = 0u,
    public var ShadowingSettings: UInt = 0u,
    public var TerminalServerRemoteHomeDir: UInt = 0u,
    public var InitialProgram: UShortArray = UShortArray(261),
    public var WorkDirectory: UShortArray = UShortArray(261),
    public var TerminalServerProfilePath: UShortArray = UShortArray(261),
    public var TerminalServerHomeDir: UShortArray = UShortArray(261),
    public var TerminalServerHomeDirDrive: UShortArray = UShortArray(4),
)

public data class WTS_CACHE_STATS(
    public var Specific: UInt = 0u,
    public var Data: WTS_CACHE_STATS_UN = WTS_CACHE_STATS_UN(),
    public var ProtocolType: UShort = 0u,
    public var Length: UShort = 0u,
)

public data class WTS_CACHE_STATS_UN(
    public var ProtocolCache: List<WTS_PROTOCOL_CACHE> = List(4) { WTS_PROTOCOL_CACHE() },
    public var TShareCacheStats: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_CACHE_STATS_UN) return false
        if (this.ProtocolCache != other.ProtocolCache) return false
        if (this.TShareCacheStats != other.TShareCacheStats) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProtocolCache.hashCode()
        result = 31 * result + this.TShareCacheStats.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class WTS_CLIENT_ADDRESS(public var AddressFamily: UInt = 0u, public var Address: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_CLIENT_ADDRESS) return false
        if (this.AddressFamily != other.AddressFamily) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddressFamily.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public class WTS_CLIENT_DATA(
    public var fDisableCtrlAltDel: Boolean = false,
    public var fDoubleClickDetect: Boolean = false,
    public var fEnableWindowsKey: Boolean = false,
    public var fHideTitleBar: Boolean = false,
    public var fInheritAutoLogon: BOOL = 0,
    public var fPromptForPassword: Boolean = false,
    public var fUsingSavedCreds: Boolean = false,
    public var Domain: UShortArray = UShortArray(256),
    public var UserName: UShortArray = UShortArray(256),
    public var Password: UShortArray = UShortArray(256),
    public var fPasswordIsScPin: Boolean = false,
    public var fInheritInitialProgram: BOOL = 0,
    public var WorkDirectory: UShortArray = UShortArray(257),
    public var InitialProgram: UShortArray = UShortArray(257),
    public var fMaximizeShell: Boolean = false,
    public var EncryptionLevel: UByte = 0u,
    public var PerformanceFlags: UInt = 0u,
    public var ProtocolName: UShortArray = UShortArray(9),
    public var ProtocolType: UShort = 0u,
    public var fInheritColorDepth: BOOL = 0,
    public var HRes: UShort = 0u,
    public var VRes: UShort = 0u,
    public var ColorDepth: UShort = 0u,
    public var DisplayDriverName: UShortArray = UShortArray(9),
    public var DisplayDeviceName: UShortArray = UShortArray(20),
    public var fMouse: Boolean = false,
    public var KeyboardLayout: UInt = 0u,
    public var KeyboardType: UInt = 0u,
    public var KeyboardSubType: UInt = 0u,
    public var KeyboardFunctionKey: UInt = 0u,
    public var imeFileName: UShortArray = UShortArray(33),
    public var ActiveInputLocale: UInt = 0u,
    public var fNoAudioPlayback: Boolean = false,
    public var fRemoteConsoleAudio: Boolean = false,
    public var AudioDriverName: UShortArray = UShortArray(9),
    public var ClientTimeZone: WTS_TIME_ZONE_INFORMATION = WTS_TIME_ZONE_INFORMATION(),
    public var ClientName: UShortArray = UShortArray(21),
    public var SerialNumber: UInt = 0u,
    public var ClientAddressFamily: UInt = 0u,
    public var ClientAddress: UShortArray = UShortArray(31),
    public var ClientSockAddress: WTS_SOCKADDR = WTS_SOCKADDR(),
    public var ClientDirectory: UShortArray = UShortArray(257),
    public var ClientBuildNumber: UInt = 0u,
    public var ClientProductId: UShort = 0u,
    public var OutBufCountHost: UShort = 0u,
    public var OutBufCountClient: UShort = 0u,
    public var OutBufLength: UShort = 0u,
    public var ClientSessionId: UInt = 0u,
    public var ClientDigProductId: UShortArray = UShortArray(33),
    public var fDisableCpm: Boolean = false,
    public var fDisableCdm: Boolean = false,
    public var fDisableCcm: Boolean = false,
    public var fDisableLPT: Boolean = false,
    public var fDisableClip: Boolean = false,
    public var fDisablePNP: Boolean = false,
)

public data class WTS_CLIENT_DISPLAY(
    public var HorizontalResolution: UInt = 0u,
    public var VerticalResolution: UInt = 0u,
    public var ColorDepth: UInt = 0u,
)

public data class WTS_DISPLAY_IOCTL(public var pDisplayIOCtlData: UByteArray = UByteArray(256), public var cbDisplayIOCtlData: UInt = 0u) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_DISPLAY_IOCTL) return false
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

public data class WTS_LICENSE_CAPABILITIES(
    public var KeyExchangeAlg: UInt = 0u,
    public var ProtocolVer: UInt = 0u,
    public var fAuthenticateServer: BOOL = 0,
    public var CertType: WTS_CERT_TYPE = 0,
    public var cbClientName: UInt = 0u,
    public var rgbClientName: UByteArray = UByteArray(42),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_LICENSE_CAPABILITIES) return false
        if (this.KeyExchangeAlg != other.KeyExchangeAlg) return false
        if (this.ProtocolVer != other.ProtocolVer) return false
        if (this.fAuthenticateServer != other.fAuthenticateServer) return false
        if (this.CertType != other.CertType) return false
        if (this.cbClientName != other.cbClientName) return false
        if (!this.rgbClientName.contentEquals(other.rgbClientName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.KeyExchangeAlg.hashCode()
        result = 31 * result + this.ProtocolVer.hashCode()
        result = 31 * result + this.fAuthenticateServer.hashCode()
        result = 31 * result + this.CertType.hashCode()
        result = 31 * result + this.cbClientName.hashCode()
        result = 31 * result + this.rgbClientName.contentHashCode()
        return result
    }
}

public data class WTS_POLICY_DATA(
    public var fDisableEncryption: Boolean = false,
    public var fDisableAutoReconnect: Boolean = false,
    public var ColorDepth: UInt = 0u,
    public var MinEncryptionLevel: UByte = 0u,
    public var fDisableCpm: Boolean = false,
    public var fDisableCdm: Boolean = false,
    public var fDisableCcm: Boolean = false,
    public var fDisableLPT: Boolean = false,
    public var fDisableClip: Boolean = false,
    public var fDisablePNPRedir: Boolean = false,
)

public data class WTS_PROCESS_INFOA(
    public var SessionId: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var pProcessName: PSTR = 0L,
    public var pUserSid: Security.PSID = Security.PSID(),
)

public data class WTS_PROCESS_INFOW(
    public var SessionId: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var pProcessName: PWSTR = 0L,
    public var pUserSid: Security.PSID = Security.PSID(),
)

public data class WTS_PROCESS_INFO_EXA(
    public var SessionId: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var pProcessName: PSTR = 0L,
    public var pUserSid: Security.PSID = Security.PSID(),
    public var NumberOfThreads: UInt = 0u,
    public var HandleCount: UInt = 0u,
    public var PagefileUsage: UInt = 0u,
    public var PeakPagefileUsage: UInt = 0u,
    public var WorkingSetSize: UInt = 0u,
    public var PeakWorkingSetSize: UInt = 0u,
    public var UserTime: Long = 0L,
    public var KernelTime: Long = 0L,
)

public data class WTS_PROCESS_INFO_EXW(
    public var SessionId: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var pProcessName: PWSTR = 0L,
    public var pUserSid: Security.PSID = Security.PSID(),
    public var NumberOfThreads: UInt = 0u,
    public var HandleCount: UInt = 0u,
    public var PagefileUsage: UInt = 0u,
    public var PeakPagefileUsage: UInt = 0u,
    public var WorkingSetSize: UInt = 0u,
    public var PeakWorkingSetSize: UInt = 0u,
    public var UserTime: Long = 0L,
    public var KernelTime: Long = 0L,
)

public data class WTS_PROPERTY_VALUE(public var Type: UShort = 0u, public var u: WTS_PROPERTY_VALUE_0 = WTS_PROPERTY_VALUE_0())

public data class WTS_PROPERTY_VALUE_0(
    public var ulVal: UInt = 0u,
    public var strVal: WTS_PROPERTY_VALUE_0_0 = WTS_PROPERTY_VALUE_0_0(),
    public var bVal: WTS_PROPERTY_VALUE_0_1 = WTS_PROPERTY_VALUE_0_1(),
    public var guidVal: GUID = GUID(),
)

public data class WTS_PROPERTY_VALUE_0_1(public var size: UInt = 0u, public var pbVal: PSTR = 0L)

public data class WTS_PROPERTY_VALUE_0_0(public var size: UInt = 0u, public var pstrVal: PWSTR = 0L)

public data class WTS_PROTOCOL_CACHE(public var CacheReads: UInt = 0u, public var CacheHits: UInt = 0u)

public class WTS_PROTOCOL_COUNTERS(
    public var WdBytes: UInt = 0u,
    public var WdFrames: UInt = 0u,
    public var WaitForOutBuf: UInt = 0u,
    public var Frames: UInt = 0u,
    public var Bytes: UInt = 0u,
    public var CompressedBytes: UInt = 0u,
    public var CompressFlushes: UInt = 0u,
    public var Errors: UInt = 0u,
    public var Timeouts: UInt = 0u,
    public var AsyncFramingError: UInt = 0u,
    public var AsyncOverrunError: UInt = 0u,
    public var AsyncOverflowError: UInt = 0u,
    public var AsyncParityError: UInt = 0u,
    public var TdErrors: UInt = 0u,
    public var ProtocolType: UShort = 0u,
    public var Length: UShort = 0u,
    public var Specific: UShort = 0u,
    public var Reserved: UIntArray = UIntArray(100),
)

public data class WTS_PROTOCOL_STATUS(
    public var Output: WTS_PROTOCOL_COUNTERS = WTS_PROTOCOL_COUNTERS(),
    public var Input: WTS_PROTOCOL_COUNTERS = WTS_PROTOCOL_COUNTERS(),
    public var Cache: WTS_CACHE_STATS = WTS_CACHE_STATS(),
    public var AsyncSignal: UInt = 0u,
    public var AsyncSignalMask: UInt = 0u,
    public var Counters: LongArray = LongArray(100),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_PROTOCOL_STATUS) return false
        if (this.Output != other.Output) return false
        if (this.Input != other.Input) return false
        if (this.Cache != other.Cache) return false
        if (this.AsyncSignal != other.AsyncSignal) return false
        if (this.AsyncSignalMask != other.AsyncSignalMask) return false
        if (!this.Counters.contentEquals(other.Counters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Output.hashCode()
        result = 31 * result + this.Input.hashCode()
        result = 31 * result + this.Cache.hashCode()
        result = 31 * result + this.AsyncSignal.hashCode()
        result = 31 * result + this.AsyncSignalMask.hashCode()
        result = 31 * result + this.Counters.contentHashCode()
        return result
    }
}

public data class WTS_SERVER_INFOA(public var pServerName: PSTR = 0L)

public data class WTS_SERVER_INFOW(public var pServerName: PWSTR = 0L)

public data class WTS_SERVICE_STATE(public var RcmServiceState: WTS_RCM_SERVICE_STATE = 0, public var RcmDrainState: WTS_RCM_DRAIN_STATE = 0)

public data class WTS_SESSION_ADDRESS(public var AddressFamily: UInt = 0u, public var Address: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_SESSION_ADDRESS) return false
        if (this.AddressFamily != other.AddressFamily) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddressFamily.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class WTS_SESSION_ID(public var SessionUniqueGuid: GUID = GUID(), public var SessionId: UInt = 0u)

public data class WTS_SESSION_INFOA(
    public var SessionId: UInt = 0u,
    public var pWinStationName: PSTR = 0L,
    public var State: WTS_CONNECTSTATE_CLASS = 0,
)

public data class WTS_SESSION_INFOW(
    public var SessionId: UInt = 0u,
    public var pWinStationName: PWSTR = 0L,
    public var State: WTS_CONNECTSTATE_CLASS = 0,
)

public data class WTS_SESSION_INFO_1A(
    public var ExecEnvId: UInt = 0u,
    public var State: WTS_CONNECTSTATE_CLASS = 0,
    public var SessionId: UInt = 0u,
    public var pSessionName: PSTR = 0L,
    public var pHostName: PSTR = 0L,
    public var pUserName: PSTR = 0L,
    public var pDomainName: PSTR = 0L,
    public var pFarmName: PSTR = 0L,
)

public data class WTS_SESSION_INFO_1W(
    public var ExecEnvId: UInt = 0u,
    public var State: WTS_CONNECTSTATE_CLASS = 0,
    public var SessionId: UInt = 0u,
    public var pSessionName: PWSTR = 0L,
    public var pHostName: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var pDomainName: PWSTR = 0L,
    public var pFarmName: PWSTR = 0L,
)

public data class WTS_SMALL_RECT(
    public var Left: Short = 0,
    public var Top: Short = 0,
    public var Right: Short = 0,
    public var Bottom: Short = 0,
)

public data class WTS_SOCKADDR(public var sin_family: UShort = 0u, public var u: WTS_SOCKADDR_0 = WTS_SOCKADDR_0())

public data class WTS_SOCKADDR_0(public var ipv4: WTS_SOCKADDR_0_0 = WTS_SOCKADDR_0_0(), public var ipv6: WTS_SOCKADDR_0_1 = WTS_SOCKADDR_0_1())

public data class WTS_SOCKADDR_0_0(
    public var sin_port: UShort = 0u,
    public var IN_ADDR: UInt = 0u,
    public var sin_zero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_SOCKADDR_0_0) return false
        if (this.sin_port != other.sin_port) return false
        if (this.IN_ADDR != other.IN_ADDR) return false
        if (!this.sin_zero.contentEquals(other.sin_zero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin_port.hashCode()
        result = 31 * result + this.IN_ADDR.hashCode()
        result = 31 * result + this.sin_zero.contentHashCode()
        return result
    }
}

public data class WTS_SOCKADDR_0_1(
    public var sin6_port: UShort = 0u,
    public var sin6_flowinfo: UInt = 0u,
    public var sin6_addr: UShortArray = UShortArray(8),
    public var sin6_scope_id: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_SOCKADDR_0_1) return false
        if (this.sin6_port != other.sin6_port) return false
        if (this.sin6_flowinfo != other.sin6_flowinfo) return false
        if (!this.sin6_addr.contentEquals(other.sin6_addr)) return false
        if (this.sin6_scope_id != other.sin6_scope_id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6_port.hashCode()
        result = 31 * result + this.sin6_flowinfo.hashCode()
        result = 31 * result + this.sin6_addr.contentHashCode()
        result = 31 * result + this.sin6_scope_id.hashCode()
        return result
    }
}

public data class WTS_SYSTEMTIME(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
)

public data class WTS_TIME_ZONE_INFORMATION(
    public var Bias: Int = 0,
    public var StandardName: UShortArray = UShortArray(32),
    public var StandardDate: WTS_SYSTEMTIME = WTS_SYSTEMTIME(),
    public var StandardBias: Int = 0,
    public var DaylightName: UShortArray = UShortArray(32),
    public var DaylightDate: WTS_SYSTEMTIME = WTS_SYSTEMTIME(),
    public var DaylightBias: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_TIME_ZONE_INFORMATION) return false
        if (this.Bias != other.Bias) return false
        if (!this.StandardName.contentEquals(other.StandardName)) return false
        if (this.StandardDate != other.StandardDate) return false
        if (this.StandardBias != other.StandardBias) return false
        if (!this.DaylightName.contentEquals(other.DaylightName)) return false
        if (this.DaylightDate != other.DaylightDate) return false
        if (this.DaylightBias != other.DaylightBias) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Bias.hashCode()
        result = 31 * result + this.StandardName.contentHashCode()
        result = 31 * result + this.StandardDate.hashCode()
        result = 31 * result + this.StandardBias.hashCode()
        result = 31 * result + this.DaylightName.contentHashCode()
        result = 31 * result + this.DaylightDate.hashCode()
        result = 31 * result + this.DaylightBias.hashCode()
        return result
    }
}

public data class WTS_USER_CREDENTIAL(
    public var UserName: UShortArray = UShortArray(256),
    public var Password: UShortArray = UShortArray(256),
    public var Domain: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_USER_CREDENTIAL) return false
        if (!this.UserName.contentEquals(other.UserName)) return false
        if (!this.Password.contentEquals(other.Password)) return false
        if (!this.Domain.contentEquals(other.Domain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.UserName.contentHashCode()
        result = 31 * result + this.Password.contentHashCode()
        result = 31 * result + this.Domain.contentHashCode()
        return result
    }
}

public data class WTS_USER_DATA(
    public var WorkDirectory: UShortArray = UShortArray(257),
    public var InitialProgram: UShortArray = UShortArray(257),
    public var UserTimeZone: WTS_TIME_ZONE_INFORMATION = WTS_TIME_ZONE_INFORMATION(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_USER_DATA) return false
        if (!this.WorkDirectory.contentEquals(other.WorkDirectory)) return false
        if (!this.InitialProgram.contentEquals(other.InitialProgram)) return false
        if (this.UserTimeZone != other.UserTimeZone) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WorkDirectory.contentHashCode()
        result = 31 * result + this.InitialProgram.contentHashCode()
        result = 31 * result + this.UserTimeZone.hashCode()
        return result
    }
}

public data class WTS_VALIDATION_INFORMATIONA(
    public var ProductInfo: PRODUCT_INFOA = PRODUCT_INFOA(),
    public var License: UByteArray = UByteArray(16384),
    public var LicenseLength: UInt = 0u,
    public var HardwareID: UByteArray = UByteArray(20),
    public var HardwareIDLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_VALIDATION_INFORMATIONA) return false
        if (this.ProductInfo != other.ProductInfo) return false
        if (!this.License.contentEquals(other.License)) return false
        if (this.LicenseLength != other.LicenseLength) return false
        if (!this.HardwareID.contentEquals(other.HardwareID)) return false
        if (this.HardwareIDLength != other.HardwareIDLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProductInfo.hashCode()
        result = 31 * result + this.License.contentHashCode()
        result = 31 * result + this.LicenseLength.hashCode()
        result = 31 * result + this.HardwareID.contentHashCode()
        result = 31 * result + this.HardwareIDLength.hashCode()
        return result
    }
}

public data class WTS_VALIDATION_INFORMATIONW(
    public var ProductInfo: PRODUCT_INFOW = PRODUCT_INFOW(),
    public var License: UByteArray = UByteArray(16384),
    public var LicenseLength: UInt = 0u,
    public var HardwareID: UByteArray = UByteArray(20),
    public var HardwareIDLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_VALIDATION_INFORMATIONW) return false
        if (this.ProductInfo != other.ProductInfo) return false
        if (!this.License.contentEquals(other.License)) return false
        if (this.LicenseLength != other.LicenseLength) return false
        if (!this.HardwareID.contentEquals(other.HardwareID)) return false
        if (this.HardwareIDLength != other.HardwareIDLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProductInfo.hashCode()
        result = 31 * result + this.License.contentHashCode()
        result = 31 * result + this.LicenseLength.hashCode()
        result = 31 * result + this.HardwareID.contentHashCode()
        result = 31 * result + this.HardwareIDLength.hashCode()
        return result
    }
}

public data class pluginResource(
    public var alias: UShortArray = UShortArray(256),
    public var name: UShortArray = UShortArray(256),
    public var resourceFileContents: PWSTR = 0L,
    public var fileExtension: UShortArray = UShortArray(256),
    public var resourcePluginType: UShortArray = UShortArray(256),
    public var isDiscoverable: UByte = 0u,
    public var resourceType: Int = 0,
    public var pceIconSize: UInt = 0u,
    public var iconContents: Long = 0L,
    public var pcePluginBlobSize: UInt = 0u,
    public var blobContents: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is pluginResource) return false
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

public data class pluginResource2(
    public var resourceV1: pluginResource = pluginResource(),
    public var pceFileAssocListSize: UInt = 0u,
    public var fileAssocList: Long = 0L,
    public var securityDescriptor: PWSTR = 0L,
    public var pceFolderListSize: UInt = 0u,
    public var folderList: Long = 0L,
)

public data class pluginResource2FileAssociation(
    public var extName: UShortArray = UShortArray(256),
    public var primaryHandler: UByte = 0u,
    public var pceIconSize: UInt = 0u,
    public var iconContents: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is pluginResource2FileAssociation) return false
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
