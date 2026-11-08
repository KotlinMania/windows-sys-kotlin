package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT

public data class ACCESSTIMEOUT(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iTimeOutMSec: UInt = 0u,
)

public data class ExtendedProperty(public var PropertyName: BSTR = 0L, public var PropertyValue: BSTR = 0L)

public data class FILTERKEYS(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iWaitMSec: UInt = 0u,
    public var iDelayMSec: UInt = 0u,
    public var iRepeatMSec: UInt = 0u,
    public var iBounceMSec: UInt = 0u,
)

public data class HIGHCONTRASTA(
    public var cbSize: UInt = 0u,
    public var dwFlags: HIGHCONTRASTW_FLAGS = 0u,
    public var lpszDefaultScheme: PSTR = 0L,
)

public data class HIGHCONTRASTW(
    public var cbSize: UInt = 0u,
    public var dwFlags: HIGHCONTRASTW_FLAGS = 0u,
    public var lpszDefaultScheme: PWSTR = 0L,
)

public data class MOUSEKEYS(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iMaxSpeed: UInt = 0u,
    public var iTimeToMaxSpeed: UInt = 0u,
    public var iCtrlSpeed: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
)

public data class MSAAMENUINFO(
    public var dwMSAASignature: UInt = 0u,
    public var cchWText: UInt = 0u,
    public var pszWText: PWSTR = 0L,
)

public data class SERIALKEYSA(
    public var cbSize: UInt = 0u,
    public var dwFlags: SERIALKEYS_FLAGS = 0u,
    public var lpszActivePort: PSTR = 0L,
    public var lpszPort: PSTR = 0L,
    public var iBaudRate: UInt = 0u,
    public var iPortState: UInt = 0u,
    public var iActive: UInt = 0u,
)

public data class SERIALKEYSW(
    public var cbSize: UInt = 0u,
    public var dwFlags: SERIALKEYS_FLAGS = 0u,
    public var lpszActivePort: PWSTR = 0L,
    public var lpszPort: PWSTR = 0L,
    public var iBaudRate: UInt = 0u,
    public var iPortState: UInt = 0u,
    public var iActive: UInt = 0u,
)

public data class SOUNDSENTRYA(
    public var cbSize: UInt = 0u,
    public var dwFlags: SOUNDSENTRY_FLAGS = 0u,
    public var iFSTextEffect: SOUNDSENTRY_TEXT_EFFECT = 0u,
    public var iFSTextEffectMSec: UInt = 0u,
    public var iFSTextEffectColorBits: UInt = 0u,
    public var iFSGrafEffect: SOUND_SENTRY_GRAPHICS_EFFECT = 0u,
    public var iFSGrafEffectMSec: UInt = 0u,
    public var iFSGrafEffectColor: UInt = 0u,
    public var iWindowsEffect: SOUNDSENTRY_WINDOWS_EFFECT = 0u,
    public var iWindowsEffectMSec: UInt = 0u,
    public var lpszWindowsEffectDLL: PSTR = 0L,
    public var iWindowsEffectOrdinal: UInt = 0u,
)

public data class SOUNDSENTRYW(
    public var cbSize: UInt = 0u,
    public var dwFlags: SOUNDSENTRY_FLAGS = 0u,
    public var iFSTextEffect: SOUNDSENTRY_TEXT_EFFECT = 0u,
    public var iFSTextEffectMSec: UInt = 0u,
    public var iFSTextEffectColorBits: UInt = 0u,
    public var iFSGrafEffect: SOUND_SENTRY_GRAPHICS_EFFECT = 0u,
    public var iFSGrafEffectMSec: UInt = 0u,
    public var iFSGrafEffectColor: UInt = 0u,
    public var iWindowsEffect: SOUNDSENTRY_WINDOWS_EFFECT = 0u,
    public var iWindowsEffectMSec: UInt = 0u,
    public var lpszWindowsEffectDLL: PWSTR = 0L,
    public var iWindowsEffectOrdinal: UInt = 0u,
)

public data class STICKYKEYS(public var cbSize: UInt = 0u, public var dwFlags: STICKYKEYS_FLAGS = 0u)

public data class TOGGLEKEYS(public var cbSize: UInt = 0u, public var dwFlags: UInt = 0u)

public data class UIAutomationEventInfo(public var guid: GUID = GUID(), public var pProgrammaticName: PCWSTR = 0L)

public data class UIAutomationMethodInfo(
    public var pProgrammaticName: PCWSTR = 0L,
    public var doSetFocus: BOOL = 0,
    public var cInParameters: UInt = 0u,
    public var cOutParameters: UInt = 0u,
    public var pParameterTypes: Long = 0L,
    public var pParameterNames: Long = 0L,
)

public data class UIAutomationParameter(public var type: UIAutomationType = 0, public var pData: Long = 0L)

public data class UIAutomationPatternInfo(
    public var guid: GUID = GUID(),
    public var pProgrammaticName: PCWSTR = 0L,
    public var providerInterfaceId: GUID = GUID(),
    public var clientInterfaceId: GUID = GUID(),
    public var cProperties: UInt = 0u,
    public var pProperties: Long = 0L,
    public var cMethods: UInt = 0u,
    public var pMethods: Long = 0L,
    public var cEvents: UInt = 0u,
    public var pEvents: Long = 0L,
    public var pPatternHandler: Long = 0L,
)

public data class UIAutomationPropertyInfo(
    public var guid: GUID = GUID(),
    public var pProgrammaticName: PCWSTR = 0L,
    public var type: UIAutomationType = 0,
)

public data class UiaAndOrCondition(
    public var ConditionType: ConditionType = 0,
    public var ppConditions: Long = 0L,
    public var cConditions: Int = 0,
)

public data class UiaAsyncContentLoadedEventArgs(
    public var Type: EventArgsType = 0,
    public var EventId: Int = 0,
    public var AsyncContentLoadedState: AsyncContentLoadedState = 0,
    public var PercentComplete: Double = 0.0,
)

public data class UiaCacheRequest(
    public var pViewCondition: Long = 0L,
    public var Scope: TreeScope = 0,
    public var pProperties: Long = 0L,
    public var cProperties: Int = 0,
    public var pPatterns: Long = 0L,
    public var cPatterns: Int = 0,
    public var automationElementMode: AutomationElementMode = 0,
)

public data class UiaChangeInfo(
    public var uiaId: Int = 0,
    public var payload: VARIANT = VARIANT(),
    public var extraInfo: VARIANT = VARIANT(),
)

public data class UiaChangesEventArgs(
    public var Type: EventArgsType = 0,
    public var EventId: Int = 0,
    public var EventIdCount: Int = 0,
    public var pUiaChanges: Long = 0L,
)

public data class UiaCondition(public var ConditionType: ConditionType = 0)

public data class UiaEventArgs(public var Type: EventArgsType = 0, public var EventId: Int = 0)

public data class UiaFindParams(
    public var MaxDepth: Int = 0,
    public var FindFirst: BOOL = 0,
    public var ExcludeRoot: BOOL = 0,
    public var pFindCondition: Long = 0L,
)

public data class UiaNotCondition(public var ConditionType: ConditionType = 0, public var pCondition: Long = 0L)

public data class UiaPoint(public var x: Double = 0.0, public var y: Double = 0.0)

public data class UiaPropertyChangedEventArgs(
    public var Type: EventArgsType = 0,
    public var EventId: UIA_EVENT_ID = 0,
    public var PropertyId: Int = 0,
    public var OldValue: VARIANT = VARIANT(),
    public var NewValue: VARIANT = VARIANT(),
)

public data class UiaPropertyCondition(
    public var ConditionType: ConditionType = 0,
    public var PropertyId: UIA_PROPERTY_ID = 0,
    public var Value: VARIANT = VARIANT(),
    public var Flags: PropertyConditionFlags = 0,
)

public data class UiaRect(
    public var left: Double = 0.0,
    public var top: Double = 0.0,
    public var width: Double = 0.0,
    public var height: Double = 0.0,
)

public data class UiaStructureChangedEventArgs(
    public var Type: EventArgsType = 0,
    public var EventId: Int = 0,
    public var StructureChangeType: StructureChangeType = 0,
    public var pRuntimeId: Long = 0L,
    public var cRuntimeIdLen: Int = 0,
)

public data class UiaTextEditTextChangedEventArgs(
    public var Type: EventArgsType = 0,
    public var EventId: Int = 0,
    public var TextEditChangeType: TextEditChangeType = 0,
    public var pTextChange: Long = 0L,
)

public data class UiaWindowClosedEventArgs(
    public var Type: EventArgsType = 0,
    public var EventId: Int = 0,
    public var pRuntimeId: Long = 0L,
    public var cRuntimeIdLen: Int = 0,
)
