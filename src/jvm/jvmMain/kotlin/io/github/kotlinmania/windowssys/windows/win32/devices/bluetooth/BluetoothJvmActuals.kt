@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.bluetooth

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DevicesBluetoothJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32DevicesBluetoothJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(hwndparent: Long, hradio: Long, pbtbi: Long, pszpasskey: Long, ulpasskeylength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(hwndparentin: Long, hradioin: Long, pbtdiinout: Long, pbtoobdata: Long, authenticationrequirement: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(hwndparent: Long, hradio: Long, cdevices: Int, rgbtdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(hwndparent: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(hradio: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(hradio: Long, fenabled: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(hradio: Long, pbtdi: Long, pcserviceinout: Long, pguidservices: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(hfind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(pbtsp: Long, pbtdi: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(pbtfrp: Long, phradio: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(hfind: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(hfind: Long, phradio: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(hfind: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(hdevice: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(hdevice: Long, characteristic: Long, characteristicvaluedatasize: Int, characteristicvalue: Long, characteristicvaluesizerequired: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(hdevice: Long, service: Long, characteristicsbuffercount: Short, characteristicsbuffer: Long, characteristicsbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(hdevice: Long, descriptor: Long, descriptorvaluedatasize: Int, descriptorvalue: Long, descriptorvaluesizerequired: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(hdevice: Long, characteristic: Long, descriptorsbuffercount: Short, descriptorsbuffer: Long, descriptorsbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(hdevice: Long, parentservice: Long, includedservicesbuffercount: Short, includedservicesbuffer: Long, includedservicesbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(hdevice: Long, servicesbuffercount: Short, servicesbuffer: Long, servicesbufferactual: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(hservice: Long, eventtype: Int, eventparameterin: Long, callback: Long, callbackcontext: Long, peventhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(hdevice: Long, characteristic: Long, characteristicvalue: Long, reliablewritecontext: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(hdevice: Long, descriptor: Long, descriptorvalue: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(eventhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(hradio: Long, pbtdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(hradio: Long, pradioinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(hradio: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(hradio: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(majorversion: Byte, minorversion: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(pbtdi: Long, phreghandle: Long, pfncallback: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(pbtdiin: Long, phreghandleout: Long, pfncallbackin: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(paddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(psdpstream: Long, cbstreamsize: Int, pfncallback: Long, pvparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(precordstream: Long, cbrecordlength: Int, usattributeid: Short, pattributedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(pcontainerstream: Long, cbcontainerlength: Int, pelement: Long, pdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(psdpstream: Long, cbsdpstreamlength: Int, pdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(precordstream: Long, cbrecordlength: Int, pstringdata: Long, usstringoffset: Short, pszstring: Long, pcchstringlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(pbtsdp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(pbtsdp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(hradio: Long, pbtdi: Long, pszpasskey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(hradioin: Long, pauthresponse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(hradioin: Long, pclassguid: Long, ulinstance: Int, pserviceinfoin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(hradio: Long, pbtdi: Long, pguidservice: Long, dwserviceflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(hreghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(pbtdi: Long): Int
}

public actual fun bluetoothAuthenticateDevice(hwndparent: Hwnd, hradio: Handle, pbtbi: MutPtr, pszpasskey: Pcwstr, ulpasskeylength: UInt): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDevice(hwndparent.rawAddress, hradio.rawAddress, pbtbi.rawAddress, pszpasskey.rawAddress, ulpasskeylength.toInt()).toUInt()

public actual fun bluetoothAuthenticateDeviceEx(hwndparentin: Hwnd, hradioin: Handle, pbtdiinout: MutPtr, pbtoobdata: ConstPtr, authenticationrequirement: AuthenticationRequirements): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateDeviceEx(hwndparentin.rawAddress, hradioin.rawAddress, pbtdiinout.rawAddress, pbtoobdata.rawAddress, authenticationrequirement).toUInt()

public actual fun bluetoothAuthenticateMultipleDevices(hwndparent: Hwnd, hradio: Handle, cdevices: UInt, rgbtdi: MutPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothAuthenticateMultipleDevices(hwndparent.rawAddress, hradio.rawAddress, cdevices.toInt(), rgbtdi.rawAddress).toUInt()

public actual fun bluetoothDisplayDeviceProperties(hwndparent: Hwnd, pbtdi: MutPtr): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothDisplayDeviceProperties(hwndparent.rawAddress, pbtdi.rawAddress)

public actual fun bluetoothEnableDiscovery(hradio: Handle, fenabled: Bool): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothEnableDiscovery(hradio.rawAddress, fenabled)

public actual fun bluetoothEnableIncomingConnections(hradio: Handle, fenabled: Bool): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothEnableIncomingConnections(hradio.rawAddress, fenabled)

public actual fun bluetoothEnumerateInstalledServices(hradio: Handle, pbtdi: ConstPtr, pcserviceinout: MutPtr, pguidservices: MutPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothEnumerateInstalledServices(hradio.rawAddress, pbtdi.rawAddress, pcserviceinout.rawAddress, pguidservices.rawAddress).toUInt()

public actual fun bluetoothFindDeviceClose(hfind: HbluetoothDeviceFind): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothFindDeviceClose(hfind.rawAddress)

public actual fun bluetoothFindFirstDevice(pbtsp: ConstPtr, pbtdi: MutPtr): HbluetoothDeviceFind =
    MutPtr(WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstDevice(pbtsp.rawAddress, pbtdi.rawAddress))

public actual fun bluetoothFindFirstRadio(pbtfrp: ConstPtr, phradio: MutPtr): HbluetoothRadioFind =
    MutPtr(WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothFindFirstRadio(pbtfrp.rawAddress, phradio.rawAddress))

public actual fun bluetoothFindNextDevice(hfind: HbluetoothDeviceFind, pbtdi: MutPtr): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothFindNextDevice(hfind.rawAddress, pbtdi.rawAddress)

public actual fun bluetoothFindNextRadio(hfind: HbluetoothRadioFind, phradio: MutPtr): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothFindNextRadio(hfind.rawAddress, phradio.rawAddress)

public actual fun bluetoothFindRadioClose(hfind: HbluetoothRadioFind): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothFindRadioClose(hfind.rawAddress)

public actual fun bluetoothGATTAbortReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTAbortReliableWrite(hdevice.rawAddress, reliablewritecontext.toLong(), flags.toInt())

public actual fun bluetoothGATTBeginReliableWrite(hdevice: Handle, reliablewritecontext: MutPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTBeginReliableWrite(hdevice.rawAddress, reliablewritecontext.rawAddress, flags.toInt())

public actual fun bluetoothGATTEndReliableWrite(hdevice: Handle, reliablewritecontext: ULong, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTEndReliableWrite(hdevice.rawAddress, reliablewritecontext.toLong(), flags.toInt())

public actual fun bluetoothGATTGetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvaluedatasize: UInt, characteristicvalue: MutPtr, characteristicvaluesizerequired: MutPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristicValue(hdevice.rawAddress, characteristic.rawAddress, characteristicvaluedatasize.toInt(), characteristicvalue.rawAddress, characteristicvaluesizerequired.rawAddress, flags.toInt())

public actual fun bluetoothGATTGetCharacteristics(hdevice: Handle, service: ConstPtr, characteristicsbuffercount: UShort, characteristicsbuffer: MutPtr, characteristicsbufferactual: MutPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetCharacteristics(hdevice.rawAddress, service.rawAddress, characteristicsbuffercount.toShort(), characteristicsbuffer.rawAddress, characteristicsbufferactual.rawAddress, flags.toInt())

public actual fun bluetoothGATTGetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvaluedatasize: UInt, descriptorvalue: MutPtr, descriptorvaluesizerequired: MutPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptorValue(hdevice.rawAddress, descriptor.rawAddress, descriptorvaluedatasize.toInt(), descriptorvalue.rawAddress, descriptorvaluesizerequired.rawAddress, flags.toInt())

public actual fun bluetoothGATTGetDescriptors(hdevice: Handle, characteristic: ConstPtr, descriptorsbuffercount: UShort, descriptorsbuffer: MutPtr, descriptorsbufferactual: MutPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetDescriptors(hdevice.rawAddress, characteristic.rawAddress, descriptorsbuffercount.toShort(), descriptorsbuffer.rawAddress, descriptorsbufferactual.rawAddress, flags.toInt())

public actual fun bluetoothGATTGetIncludedServices(hdevice: Handle, parentservice: ConstPtr, includedservicesbuffercount: UShort, includedservicesbuffer: MutPtr, includedservicesbufferactual: MutPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetIncludedServices(hdevice.rawAddress, parentservice.rawAddress, includedservicesbuffercount.toShort(), includedservicesbuffer.rawAddress, includedservicesbufferactual.rawAddress, flags.toInt())

public actual fun bluetoothGATTGetServices(hdevice: Handle, servicesbuffercount: UShort, servicesbuffer: MutPtr, servicesbufferactual: MutPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTGetServices(hdevice.rawAddress, servicesbuffercount.toShort(), servicesbuffer.rawAddress, servicesbufferactual.rawAddress, flags.toInt())

public actual fun bluetoothGATTRegisterEvent(hservice: Handle, eventtype: BthLeGattEventType, eventparameterin: ConstPtr, callback: PfnbluetoothGattEventCallback, callbackcontext: ConstPtr, peventhandle: MutPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTRegisterEvent(hservice.rawAddress, eventtype, eventparameterin.rawAddress, 0L, callbackcontext.rawAddress, peventhandle.rawAddress, flags.toInt())

public actual fun bluetoothGATTSetCharacteristicValue(hdevice: Handle, characteristic: ConstPtr, characteristicvalue: ConstPtr, reliablewritecontext: ULong, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetCharacteristicValue(hdevice.rawAddress, characteristic.rawAddress, characteristicvalue.rawAddress, reliablewritecontext.toLong(), flags.toInt())

public actual fun bluetoothGATTSetDescriptorValue(hdevice: Handle, descriptor: ConstPtr, descriptorvalue: ConstPtr, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTSetDescriptorValue(hdevice.rawAddress, descriptor.rawAddress, descriptorvalue.rawAddress, flags.toInt())

public actual fun bluetoothGATTUnregisterEvent(eventhandle: Long, flags: UInt): Hresult =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGATTUnregisterEvent(eventhandle, flags.toInt())

public actual fun bluetoothGetDeviceInfo(hradio: Handle, pbtdi: MutPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGetDeviceInfo(hradio.rawAddress, pbtdi.rawAddress).toUInt()

public actual fun bluetoothGetRadioInfo(hradio: Handle, pradioinfo: MutPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothGetRadioInfo(hradio.rawAddress, pradioinfo.rawAddress).toUInt()

public actual fun bluetoothIsConnectable(hradio: Handle): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothIsConnectable(hradio.rawAddress)

public actual fun bluetoothIsDiscoverable(hradio: Handle): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothIsDiscoverable(hradio.rawAddress)

public actual fun bluetoothIsVersionAvailable(majorversion: UByte, minorversion: UByte): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothIsVersionAvailable(majorversion.toByte(), minorversion.toByte())

public actual fun bluetoothRegisterForAuthentication(pbtdi: ConstPtr, phreghandle: MutPtr, pfncallback: PfnAuthenticationCallback, pvparam: ConstPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthentication(pbtdi.rawAddress, phreghandle.rawAddress, 0L, pvparam.rawAddress).toUInt()

public actual fun bluetoothRegisterForAuthenticationEx(pbtdiin: ConstPtr, phreghandleout: MutPtr, pfncallbackin: PfnAuthenticationCallbackEx, pvparam: ConstPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothRegisterForAuthenticationEx(pbtdiin.rawAddress, phreghandleout.rawAddress, 0L, pvparam.rawAddress).toUInt()

public actual fun bluetoothRemoveDevice(paddress: ConstPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothRemoveDevice(paddress.rawAddress).toUInt()

public actual fun bluetoothSdpEnumAttributes(psdpstream: ConstPtr, cbstreamsize: UInt, pfncallback: PfnBluetoothEnumAttributesCallback, pvparam: ConstPtr): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSdpEnumAttributes(psdpstream.rawAddress, cbstreamsize.toInt(), 0L, pvparam.rawAddress)

public actual fun bluetoothSdpGetAttributeValue(precordstream: ConstPtr, cbrecordlength: UInt, usattributeid: UShort, pattributedata: MutPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetAttributeValue(precordstream.rawAddress, cbrecordlength.toInt(), usattributeid.toShort(), pattributedata.rawAddress).toUInt()

public actual fun bluetoothSdpGetContainerElementData(pcontainerstream: ConstPtr, cbcontainerlength: UInt, pelement: MutPtr, pdata: MutPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetContainerElementData(pcontainerstream.rawAddress, cbcontainerlength.toInt(), pelement.rawAddress, pdata.rawAddress).toUInt()

public actual fun bluetoothSdpGetElementData(psdpstream: ConstPtr, cbsdpstreamlength: UInt, pdata: MutPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetElementData(psdpstream.rawAddress, cbsdpstreamlength.toInt(), pdata.rawAddress).toUInt()

public actual fun bluetoothSdpGetString(precordstream: ConstPtr, cbrecordlength: UInt, pstringdata: ConstPtr, usstringoffset: UShort, pszstring: Pwstr, pcchstringlength: MutPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSdpGetString(precordstream.rawAddress, cbrecordlength.toInt(), pstringdata.rawAddress, usstringoffset.toShort(), pszstring.rawAddress, pcchstringlength.rawAddress).toUInt()

public actual fun bluetoothSelectDevices(pbtsdp: MutPtr): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevices(pbtsdp.rawAddress)

public actual fun bluetoothSelectDevicesFree(pbtsdp: MutPtr): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSelectDevicesFree(pbtsdp.rawAddress)

public actual fun bluetoothSendAuthenticationResponse(hradio: Handle, pbtdi: ConstPtr, pszpasskey: Pcwstr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponse(hradio.rawAddress, pbtdi.rawAddress, pszpasskey.rawAddress).toUInt()

public actual fun bluetoothSendAuthenticationResponseEx(hradioin: Handle, pauthresponse: ConstPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSendAuthenticationResponseEx(hradioin.rawAddress, pauthresponse.rawAddress).toUInt()

public actual fun bluetoothSetLocalServiceInfo(hradioin: Handle, pclassguid: ConstPtr, ulinstance: UInt, pserviceinfoin: ConstPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSetLocalServiceInfo(hradioin.rawAddress, pclassguid.rawAddress, ulinstance.toInt(), pserviceinfoin.rawAddress).toUInt()

public actual fun bluetoothSetServiceState(hradio: Handle, pbtdi: ConstPtr, pguidservice: ConstPtr, dwserviceflags: UInt): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothSetServiceState(hradio.rawAddress, pbtdi.rawAddress, pguidservice.rawAddress, dwserviceflags.toInt()).toUInt()

public actual fun bluetoothUnregisterAuthentication(hreghandle: Long): Bool =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothUnregisterAuthentication(hreghandle)

public actual fun bluetoothUpdateDeviceRecord(pbtdi: ConstPtr): UInt =
    WindowsWin32DevicesBluetoothJniBridge.windowssysWindowsWin32DevicesBluetoothBluetoothUpdateDeviceRecord(pbtdi.rawAddress).toUInt()
