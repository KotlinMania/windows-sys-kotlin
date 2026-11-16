package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val ANNO_CONTAINER: AnnoScope = 1

public val ANNO_THIS: AnnoScope = 0

public val ANRUS_ON_SCREEN_KEYBOARD_ACTIVE: AccUtilityStateFlags = 1u

public val ANRUS_PRIORITY_AUDIO_ACTIVE: AccUtilityStateFlags = 4u

public val ANRUS_PRIORITY_AUDIO_ACTIVE_NODUCK: AccUtilityStateFlags = 8u

public val ANRUS_PRIORITY_AUDIO_DYNAMIC_DUCK: UInt = 16u

public val ANRUS_TOUCH_MODIFICATION_ACTIVE: AccUtilityStateFlags = 2u

public val ACTIVE_END_END: ActiveEnd = 2

public val ACTIVE_END_NONE: ActiveEnd = 0

public val ACTIVE_END_START: ActiveEnd = 1

public val ANIMATION_STYLE_BLINKING_BACKGROUND: AnimationStyle = 2

public val ANIMATION_STYLE_LAS_VEGAS_LIGHTS: AnimationStyle = 1

public val ANIMATION_STYLE_MARCHING_BLACK_ANTS: AnimationStyle = 4

public val ANIMATION_STYLE_MARCHING_RED_ANTS: AnimationStyle = 5

public val ANIMATION_STYLE_NONE: AnimationStyle = 0

public val ANIMATION_STYLE_OTHER: AnimationStyle = -1

public val ANIMATION_STYLE_SHIMMER: AnimationStyle = 6

public val ANIMATION_STYLE_SPARKLE_TEXT: AnimationStyle = 3

public val ANNOTATION_TYPE_ADVANCED_PROOFING_ISSUE: UiaAnnotationtype = 60020

public val ANNOTATION_TYPE_AUTHOR: UiaAnnotationtype = 60019

public val ANNOTATION_TYPE_CIRCULAR_REFERENCE_ERROR: UiaAnnotationtype = 60022

public val ANNOTATION_TYPE_COMMENT: UiaAnnotationtype = 60003

public val ANNOTATION_TYPE_CONFLICTING_CHANGE: UiaAnnotationtype = 60018

public val ANNOTATION_TYPE_DATA_VALIDATION_ERROR: UiaAnnotationtype = 60021

public val ANNOTATION_TYPE_DELETION_CHANGE: UiaAnnotationtype = 60012

public val ANNOTATION_TYPE_EDITING_LOCKED_CHANGE: UiaAnnotationtype = 60016

public val ANNOTATION_TYPE_ENDNOTE: UiaAnnotationtype = 60009

public val ANNOTATION_TYPE_EXTERNAL_CHANGE: UiaAnnotationtype = 60017

public val ANNOTATION_TYPE_FOOTER: UiaAnnotationtype = 60007

public val ANNOTATION_TYPE_FOOTNOTE: UiaAnnotationtype = 60010

public val ANNOTATION_TYPE_FORMAT_CHANGE: UiaAnnotationtype = 60014

public val ANNOTATION_TYPE_FORMULA_ERROR: UiaAnnotationtype = 60004

public val ANNOTATION_TYPE_GRAMMAR_ERROR: UiaAnnotationtype = 60002

public val ANNOTATION_TYPE_HEADER: UiaAnnotationtype = 60006

public val ANNOTATION_TYPE_HIGHLIGHTED: UiaAnnotationtype = 60008

public val ANNOTATION_TYPE_INSERTION_CHANGE: UiaAnnotationtype = 60011

public val ANNOTATION_TYPE_MATHEMATICS: UiaAnnotationtype = 60023

public val ANNOTATION_TYPE_MOVE_CHANGE: UiaAnnotationtype = 60013

public val ANNOTATION_TYPE_SENSITIVE: UiaAnnotationtype = 60024

public val ANNOTATION_TYPE_SPELLING_ERROR: UiaAnnotationtype = 60001

public val ANNOTATION_TYPE_TRACK_CHANGES: UiaAnnotationtype = 60005

public val ANNOTATION_TYPE_UNKNOWN: UiaAnnotationtype = 60000

public val ANNOTATION_TYPE_UNSYNCED_CHANGE: UiaAnnotationtype = 60015

public val ASSERTIVE: LiveSetting = 2

public val ASYNC_CONTENT_LOADED_STATE_BEGINNING: AsyncContentLoadedState = 0

public val ASYNC_CONTENT_LOADED_STATE_COMPLETED: AsyncContentLoadedState = 2

public val ASYNC_CONTENT_LOADED_STATE_PROGRESS: AsyncContentLoadedState = 1

public val AUTOMATION_ELEMENT_MODE_FULL: AutomationElementMode = 1

public val AUTOMATION_ELEMENT_MODE_NONE: AutomationElementMode = 0

public val AUTOMATION_IDENTIFIER_TYPE_ANNOTATION: AutomationIdentifierType = 6

public val AUTOMATION_IDENTIFIER_TYPE_CHANGES: AutomationIdentifierType = 7

public val AUTOMATION_IDENTIFIER_TYPE_CONTROL_TYPE: AutomationIdentifierType = 3

public val AUTOMATION_IDENTIFIER_TYPE_EVENT: AutomationIdentifierType = 2

public val AUTOMATION_IDENTIFIER_TYPE_LANDMARK_TYPE: AutomationIdentifierType = 5

public val AUTOMATION_IDENTIFIER_TYPE_PATTERN: AutomationIdentifierType = 1

public val AUTOMATION_IDENTIFIER_TYPE_PROPERTY: AutomationIdentifierType = 0

public val AUTOMATION_IDENTIFIER_TYPE_STYLE: AutomationIdentifierType = 8

public val AUTOMATION_IDENTIFIER_TYPE_TEXT_ATTRIBUTE: AutomationIdentifierType = 4

public val BULLET_STYLE_DASH_BULLET: BulletStyle = 5

public val BULLET_STYLE_FILLED_ROUND_BULLET: BulletStyle = 2

public val BULLET_STYLE_FILLED_SQUARE_BULLET: BulletStyle = 4

public val BULLET_STYLE_HOLLOW_ROUND_BULLET: BulletStyle = 1

public val BULLET_STYLE_HOLLOW_SQUARE_BULLET: BulletStyle = 3

public val BULLET_STYLE_NONE: BulletStyle = 0

public val BULLET_STYLE_OTHER: BulletStyle = -1

public val CAP_STYLE_ALL_CAP: CapStyle = 2

public val CAP_STYLE_ALL_PETITE_CAPS: CapStyle = 3

public val CAP_STYLE_NONE: CapStyle = 0

public val CAP_STYLE_OTHER: CapStyle = -1

public val CAP_STYLE_PETITE_CAPS: CapStyle = 4

public val CAP_STYLE_SMALL_CAP: CapStyle = 1

public val CAP_STYLE_TITLING: CapStyle = 6

public val CAP_STYLE_UNICASE: CapStyle = 5

public val CARET_BIDI_MODE_LTR: CaretBidiMode = 0

public val CARET_BIDI_MODE_RTL: CaretBidiMode = 1

public val CARET_POSITION_BEGINNING_OF_LINE: CaretPosition = 2

public val CARET_POSITION_END_OF_LINE: CaretPosition = 1

public val CARET_POSITION_UNKNOWN: CaretPosition = 0

public val COALESCE_EVENTS_OPTIONS_DISABLED: CoalesceEventsOptions = 0

public val COALESCE_EVENTS_OPTIONS_ENABLED: CoalesceEventsOptions = 1

public val CONDITION_TYPE_AND: ConditionType = 3

public val CONDITION_TYPE_FALSE: ConditionType = 1

public val CONDITION_TYPE_NOT: ConditionType = 5

public val CONDITION_TYPE_OR: ConditionType = 4

public val CONDITION_TYPE_PROPERTY: ConditionType = 2

public val CONDITION_TYPE_TRUE: ConditionType = 0

public val CONNECTION_RECOVERY_BEHAVIOR_OPTIONS_DISABLED: ConnectionRecoveryBehaviorOptions = 0

public val CONNECTION_RECOVERY_BEHAVIOR_OPTIONS_ENABLED: ConnectionRecoveryBehaviorOptions = 1

public val DISPID_ACC_CHILD: Int = -5002

public val DISPID_ACC_CHILDCOUNT: Int = -5001

public val DISPID_ACC_DEFAULTACTION: Int = -5013

public val DISPID_ACC_DESCRIPTION: Int = -5005

public val DISPID_ACC_DODEFAULTACTION: Int = -5018

public val DISPID_ACC_FOCUS: Int = -5011

public val DISPID_ACC_HELP: Int = -5008

public val DISPID_ACC_HELPTOPIC: Int = -5009

public val DISPID_ACC_HITTEST: Int = -5017

public val DISPID_ACC_KEYBOARDSHORTCUT: Int = -5010

public val DISPID_ACC_LOCATION: Int = -5015

public val DISPID_ACC_NAME: Int = -5003

public val DISPID_ACC_NAVIGATE: Int = -5016

public val DISPID_ACC_PARENT: Int = -5000

public val DISPID_ACC_ROLE: Int = -5006

public val DISPID_ACC_SELECT: Int = -5014

public val DISPID_ACC_SELECTION: Int = -5012

public val DISPID_ACC_STATE: Int = -5007

public val DISPID_ACC_VALUE: Int = -5004

public val DOCK_POSITION_BOTTOM: DockPosition = 2

public val DOCK_POSITION_FILL: DockPosition = 4

public val DOCK_POSITION_LEFT: DockPosition = 1

public val DOCK_POSITION_NONE: DockPosition = 5

public val DOCK_POSITION_RIGHT: DockPosition = 3

public val DOCK_POSITION_TOP: DockPosition = 0

public val EVENT_ARGS_TYPE_ACTIVE_TEXT_POSITION_CHANGED: EventArgsType = 8

public val EVENT_ARGS_TYPE_ASYNC_CONTENT_LOADED: EventArgsType = 3

public val EVENT_ARGS_TYPE_CHANGES: EventArgsType = 6

public val EVENT_ARGS_TYPE_NOTIFICATION: EventArgsType = 7

public val EVENT_ARGS_TYPE_PROPERTY_CHANGED: EventArgsType = 1

public val EVENT_ARGS_TYPE_SIMPLE: EventArgsType = 0

public val EVENT_ARGS_TYPE_STRUCTURE_CHANGED: EventArgsType = 2

public val EVENT_ARGS_TYPE_STRUCTURED_MARKUP: EventArgsType = 9

public val EVENT_ARGS_TYPE_TEXT_EDIT_TEXT_CHANGED: EventArgsType = 5

public val EVENT_ARGS_TYPE_WINDOW_CLOSED: EventArgsType = 4

public val EXPAND_COLLAPSE_STATE_COLLAPSED: ExpandCollapseState = 0

public val EXPAND_COLLAPSE_STATE_EXPANDED: ExpandCollapseState = 1

public val EXPAND_COLLAPSE_STATE_LEAF_NODE: ExpandCollapseState = 3

public val EXPAND_COLLAPSE_STATE_PARTIALLY_EXPANDED: ExpandCollapseState = 2

public val FILL_TYPE_COLOR: FillType = 1

public val FILL_TYPE_GRADIENT: FillType = 2

public val FILL_TYPE_NONE: FillType = 0

public val FILL_TYPE_PATTERN: FillType = 4

public val FILL_TYPE_PICTURE: FillType = 3

public val FLOW_DIRECTIONS_BOTTOM_TO_TOP: FlowDirections = 2

public val FLOW_DIRECTIONS_DEFAULT: FlowDirections = 0

public val FLOW_DIRECTIONS_RIGHT_TO_LEFT: FlowDirections = 1

public val FLOW_DIRECTIONS_VERTICAL: FlowDirections = 4

public val HCF_AVAILABLE: HighcontrastwFlags = 2u

public val HCF_CONFIRMHOTKEY: HighcontrastwFlags = 8u

public val HCF_HIGHCONTRASTON: HighcontrastwFlags = 1u

public val HCF_HOTKEYACTIVE: HighcontrastwFlags = 4u

public val HCF_HOTKEYAVAILABLE: HighcontrastwFlags = 64u

public val HCF_HOTKEYSOUND: HighcontrastwFlags = 16u

public val HCF_INDICATOR: HighcontrastwFlags = 32u

public val HCF_OPTION_NOTHEMECHANGE: HighcontrastwFlags = 4096u

public val HEADING_LEVEL1: UiaHeadinglevelId = 80051

public val HEADING_LEVEL2: UiaHeadinglevelId = 80052

public val HEADING_LEVEL3: UiaHeadinglevelId = 80053

public val HEADING_LEVEL4: UiaHeadinglevelId = 80054

public val HEADING_LEVEL5: UiaHeadinglevelId = 80055

public val HEADING_LEVEL6: UiaHeadinglevelId = 80056

public val HEADING_LEVEL7: UiaHeadinglevelId = 80057

public val HEADING_LEVEL8: UiaHeadinglevelId = 80058

public val HEADING_LEVEL9: UiaHeadinglevelId = 80059

public val HEADING_LEVEL_NONE: UiaHeadinglevelId = 80050

public val HORIZONTAL_TEXT_ALIGNMENT_CENTERED: HorizontalTextAlignment = 1

public val HORIZONTAL_TEXT_ALIGNMENT_JUSTIFIED: HorizontalTextAlignment = 3

public val HORIZONTAL_TEXT_ALIGNMENT_LEFT: HorizontalTextAlignment = 0

public val HORIZONTAL_TEXT_ALIGNMENT_RIGHT: HorizontalTextAlignment = 2

public val MSAA_MENU_SIG: Int = -1441927155

public val NAVDIR_DOWN: UInt = 2u

public val NAVDIR_FIRSTCHILD: UInt = 7u

public val NAVDIR_LASTCHILD: UInt = 8u

public val NAVDIR_LEFT: UInt = 3u

public val NAVDIR_MAX: UInt = 9u

public val NAVDIR_MIN: UInt = 0u

public val NAVDIR_NEXT: UInt = 5u

public val NAVDIR_PREVIOUS: UInt = 6u

public val NAVDIR_RIGHT: UInt = 4u

public val NAVDIR_UP: UInt = 1u

public val NAVIGATE_DIRECTION_FIRST_CHILD: NavigateDirection = 3

public val NAVIGATE_DIRECTION_LAST_CHILD: NavigateDirection = 4

public val NAVIGATE_DIRECTION_NEXT_SIBLING: NavigateDirection = 1

public val NAVIGATE_DIRECTION_PARENT: NavigateDirection = 0

public val NAVIGATE_DIRECTION_PREVIOUS_SIBLING: NavigateDirection = 2

public val NORMALIZE_STATE_CUSTOM: NormalizeState = 2

public val NORMALIZE_STATE_NONE: NormalizeState = 0

public val NORMALIZE_STATE_VIEW: NormalizeState = 1

public val NOTIFICATION_KIND_ACTION_ABORTED: NotificationKind = 3

public val NOTIFICATION_KIND_ACTION_COMPLETED: NotificationKind = 2

public val NOTIFICATION_KIND_ITEM_ADDED: NotificationKind = 0

public val NOTIFICATION_KIND_ITEM_REMOVED: NotificationKind = 1

public val NOTIFICATION_KIND_OTHER: NotificationKind = 4

public val NOTIFICATION_PROCESSING_ALL: NotificationProcessing = 2

public val NOTIFICATION_PROCESSING_CURRENT_THEN_MOST_RECENT: NotificationProcessing = 4

public val NOTIFICATION_PROCESSING_IMPORTANT_ALL: NotificationProcessing = 0

public val NOTIFICATION_PROCESSING_IMPORTANT_MOST_RECENT: NotificationProcessing = 1

public val NOTIFICATION_PROCESSING_MOST_RECENT: NotificationProcessing = 3

public val OFF: LiveSetting = 0

public val ORIENTATION_TYPE_HORIZONTAL: OrientationType = 1

public val ORIENTATION_TYPE_NONE: OrientationType = 0

public val ORIENTATION_TYPE_VERTICAL: OrientationType = 2

public val OUTLINE_STYLES_EMBOSSED: OutlineStyles = 8

public val OUTLINE_STYLES_ENGRAVED: OutlineStyles = 4

public val OUTLINE_STYLES_NONE: OutlineStyles = 0

public val OUTLINE_STYLES_OUTLINE: OutlineStyles = 1

public val OUTLINE_STYLES_SHADOW: OutlineStyles = 2

public val POLITE: LiveSetting = 1

public val PROPERTY_CONDITION_FLAGS_IGNORE_CASE: PropertyConditionFlags = 1

public val PROPERTY_CONDITION_FLAGS_MATCH_SUBSTRING: PropertyConditionFlags = 2

public val PROPERTY_CONDITION_FLAGS_NONE: PropertyConditionFlags = 0

public val PROVIDER_OPTIONS_CLIENT_SIDE_PROVIDER: ProviderOptions = 1

public val PROVIDER_OPTIONS_HAS_NATIVE_I_ACCESSIBLE: ProviderOptions = 128

public val PROVIDER_OPTIONS_NON_CLIENT_AREA_PROVIDER: ProviderOptions = 4

public val PROVIDER_OPTIONS_OVERRIDE_PROVIDER: ProviderOptions = 8

public val PROVIDER_OPTIONS_PROVIDER_OWNS_SET_FOCUS: ProviderOptions = 16

public val PROVIDER_OPTIONS_REFUSE_NON_CLIENT_SUPPORT: ProviderOptions = 64

public val PROVIDER_OPTIONS_SERVER_SIDE_PROVIDER: ProviderOptions = 2

public val PROVIDER_OPTIONS_USE_CLIENT_COORDINATES: ProviderOptions = 256

public val PROVIDER_OPTIONS_USE_COM_THREADING: ProviderOptions = 32

public val PROVIDER_TYPE_BASE_HWND: ProviderType = 0

public val PROVIDER_TYPE_NON_CLIENT_AREA: ProviderType = 2

public val PROVIDER_TYPE_PROXY: ProviderType = 1

public val ROLE_SYSTEM_ALERT: UInt = 8u

public val ROLE_SYSTEM_ANIMATION: UInt = 54u

public val ROLE_SYSTEM_APPLICATION: UInt = 14u

public val ROLE_SYSTEM_BORDER: UInt = 19u

public val ROLE_SYSTEM_BUTTONDROPDOWN: UInt = 56u

public val ROLE_SYSTEM_BUTTONDROPDOWNGRID: UInt = 58u

public val ROLE_SYSTEM_BUTTONMENU: UInt = 57u

public val ROLE_SYSTEM_CARET: UInt = 7u

public val ROLE_SYSTEM_CELL: UInt = 29u

public val ROLE_SYSTEM_CHARACTER: UInt = 32u

public val ROLE_SYSTEM_CHART: UInt = 17u

public val ROLE_SYSTEM_CHECKBUTTON: UInt = 44u

public val ROLE_SYSTEM_CLIENT: UInt = 10u

public val ROLE_SYSTEM_CLOCK: UInt = 61u

public val ROLE_SYSTEM_COLUMN: UInt = 27u

public val ROLE_SYSTEM_COLUMNHEADER: UInt = 25u

public val ROLE_SYSTEM_COMBOBOX: UInt = 46u

public val ROLE_SYSTEM_CURSOR: UInt = 6u

public val ROLE_SYSTEM_DIAGRAM: UInt = 53u

public val ROLE_SYSTEM_DIAL: UInt = 49u

public val ROLE_SYSTEM_DIALOG: UInt = 18u

public val ROLE_SYSTEM_DOCUMENT: UInt = 15u

public val ROLE_SYSTEM_DROPLIST: UInt = 47u

public val ROLE_SYSTEM_EQUATION: UInt = 55u

public val ROLE_SYSTEM_GRAPHIC: UInt = 40u

public val ROLE_SYSTEM_GRIP: UInt = 4u

public val ROLE_SYSTEM_GROUPING: UInt = 20u

public val ROLE_SYSTEM_HELPBALLOON: UInt = 31u

public val ROLE_SYSTEM_HOTKEYFIELD: UInt = 50u

public val ROLE_SYSTEM_INDICATOR: UInt = 39u

public val ROLE_SYSTEM_IPADDRESS: UInt = 63u

public val ROLE_SYSTEM_LINK: UInt = 30u

public val ROLE_SYSTEM_LIST: UInt = 33u

public val ROLE_SYSTEM_LISTITEM: UInt = 34u

public val ROLE_SYSTEM_MENUBAR: UInt = 2u

public val ROLE_SYSTEM_MENUITEM: UInt = 12u

public val ROLE_SYSTEM_MENUPOPUP: UInt = 11u

public val ROLE_SYSTEM_OUTLINE: UInt = 35u

public val ROLE_SYSTEM_OUTLINEBUTTON: UInt = 64u

public val ROLE_SYSTEM_OUTLINEITEM: UInt = 36u

public val ROLE_SYSTEM_PAGETAB: UInt = 37u

public val ROLE_SYSTEM_PAGETABLIST: UInt = 60u

public val ROLE_SYSTEM_PANE: UInt = 16u

public val ROLE_SYSTEM_PROGRESSBAR: UInt = 48u

public val ROLE_SYSTEM_PROPERTYPAGE: UInt = 38u

public val ROLE_SYSTEM_PUSHBUTTON: UInt = 43u

public val ROLE_SYSTEM_RADIOBUTTON: UInt = 45u

public val ROLE_SYSTEM_ROW: UInt = 28u

public val ROLE_SYSTEM_ROWHEADER: UInt = 26u

public val ROLE_SYSTEM_SCROLLBAR: UInt = 3u

public val ROLE_SYSTEM_SEPARATOR: UInt = 21u

public val ROLE_SYSTEM_SLIDER: UInt = 51u

public val ROLE_SYSTEM_SOUND: UInt = 5u

public val ROLE_SYSTEM_SPINBUTTON: UInt = 52u

public val ROLE_SYSTEM_SPLITBUTTON: UInt = 62u

public val ROLE_SYSTEM_STATICTEXT: UInt = 41u

public val ROLE_SYSTEM_STATUSBAR: UInt = 23u

public val ROLE_SYSTEM_TABLE: UInt = 24u

public val ROLE_SYSTEM_TEXT: UInt = 42u

public val ROLE_SYSTEM_TITLEBAR: UInt = 1u

public val ROLE_SYSTEM_TOOLBAR: UInt = 22u

public val ROLE_SYSTEM_TOOLTIP: UInt = 13u

public val ROLE_SYSTEM_WHITESPACE: UInt = 59u

public val ROLE_SYSTEM_WINDOW: UInt = 9u

public val ROW_OR_COLUMN_MAJOR_COLUMN_MAJOR: RowOrColumnMajor = 1

public val ROW_OR_COLUMN_MAJOR_INDETERMINATE: RowOrColumnMajor = 2

public val ROW_OR_COLUMN_MAJOR_ROW_MAJOR: RowOrColumnMajor = 0

public val SELFLAG_ADDSELECTION: UInt = 8u

public val SELFLAG_EXTENDSELECTION: UInt = 4u

public val SELFLAG_NONE: UInt = 0u

public val SELFLAG_REMOVESELECTION: UInt = 16u

public val SELFLAG_TAKEFOCUS: UInt = 1u

public val SELFLAG_TAKESELECTION: UInt = 2u

public val SELFLAG_VALID: UInt = 31u

public val SERKF_AVAILABLE: SerialkeysFlags = 2u

public val SERKF_INDICATOR: SerialkeysFlags = 4u

public val SERKF_SERIALKEYSON: SerialkeysFlags = 1u

public val SKF_AUDIBLEFEEDBACK: StickykeysFlags = 64u

public val SKF_AVAILABLE: StickykeysFlags = 2u

public val SKF_CONFIRMHOTKEY: StickykeysFlags = 8u

public val SKF_HOTKEYACTIVE: StickykeysFlags = 4u

public val SKF_HOTKEYSOUND: StickykeysFlags = 16u

public val SKF_INDICATOR: StickykeysFlags = 32u

public val SKF_LALTLATCHED: StickykeysFlags = 268435456u

public val SKF_LALTLOCKED: StickykeysFlags = 1048576u

public val SKF_LCTLLATCHED: StickykeysFlags = 67108864u

public val SKF_LCTLLOCKED: StickykeysFlags = 262144u

public val SKF_LSHIFTLATCHED: StickykeysFlags = 16777216u

public val SKF_LSHIFTLOCKED: StickykeysFlags = 65536u

public val SKF_LWINLATCHED: StickykeysFlags = 1073741824u

public val SKF_LWINLOCKED: StickykeysFlags = 4194304u

public val SKF_RALTLATCHED: StickykeysFlags = 536870912u

public val SKF_RALTLOCKED: StickykeysFlags = 2097152u

public val SKF_RCTLLATCHED: StickykeysFlags = 134217728u

public val SKF_RCTLLOCKED: StickykeysFlags = 524288u

public val SKF_RSHIFTLATCHED: StickykeysFlags = 33554432u

public val SKF_RSHIFTLOCKED: StickykeysFlags = 131072u

public val SKF_RWINLATCHED: StickykeysFlags = 2147483648u

public val SKF_RWINLOCKED: StickykeysFlags = 8388608u

public val SKF_STICKYKEYSON: StickykeysFlags = 1u

public val SKF_TRISTATE: StickykeysFlags = 128u

public val SKF_TWOKEYSOFF: StickykeysFlags = 256u

public val SSF_AVAILABLE: SoundsentryFlags = 2u

public val SSF_INDICATOR: SoundsentryFlags = 4u

public val SSF_SOUNDSENTRYON: SoundsentryFlags = 1u

public val SSGF_DISPLAY: SoundSentryGraphicsEffect = 3u

public val SSGF_NONE: SoundSentryGraphicsEffect = 0u

public val SSTF_BORDER: SoundsentryTextEffect = 2u

public val SSTF_CHARS: SoundsentryTextEffect = 1u

public val SSTF_DISPLAY: SoundsentryTextEffect = 3u

public val SSTF_NONE: SoundsentryTextEffect = 0u

public val SSWF_CUSTOM: SoundsentryWindowsEffect = 4u

public val SSWF_DISPLAY: SoundsentryWindowsEffect = 3u

public val SSWF_NONE: SoundsentryWindowsEffect = 0u

public val SSWF_TITLE: SoundsentryWindowsEffect = 1u

public val SSWF_WINDOW: SoundsentryWindowsEffect = 2u

public val STATE_SYSTEM_HASPOPUP: UInt = 1073741824u

public val STATE_SYSTEM_NORMAL: UInt = 0u

public val SAY_AS_INTERPRET_AS_ADDRESS: SayAsInterpretAs = 11

public val SAY_AS_INTERPRET_AS_ALPHANUMERIC: SayAsInterpretAs = 12

public val SAY_AS_INTERPRET_AS_CARDINAL: SayAsInterpretAs = 2

public val SAY_AS_INTERPRET_AS_CURRENCY: SayAsInterpretAs = 8

public val SAY_AS_INTERPRET_AS_DATE: SayAsInterpretAs = 5

public val SAY_AS_INTERPRET_AS_DATE_DAY_MONTH: SayAsInterpretAs = 20

public val SAY_AS_INTERPRET_AS_DATE_DAY_MONTH_YEAR: SayAsInterpretAs = 16

public val SAY_AS_INTERPRET_AS_DATE_MONTH_DAY: SayAsInterpretAs = 21

public val SAY_AS_INTERPRET_AS_DATE_MONTH_DAY_YEAR: SayAsInterpretAs = 15

public val SAY_AS_INTERPRET_AS_DATE_MONTH_YEAR: SayAsInterpretAs = 19

public val SAY_AS_INTERPRET_AS_DATE_YEAR: SayAsInterpretAs = 22

public val SAY_AS_INTERPRET_AS_DATE_YEAR_MONTH: SayAsInterpretAs = 18

public val SAY_AS_INTERPRET_AS_DATE_YEAR_MONTH_DAY: SayAsInterpretAs = 17

public val SAY_AS_INTERPRET_AS_MEDIA: SayAsInterpretAs = 14

public val SAY_AS_INTERPRET_AS_NAME: SayAsInterpretAs = 13

public val SAY_AS_INTERPRET_AS_NET: SayAsInterpretAs = 9

public val SAY_AS_INTERPRET_AS_NONE: SayAsInterpretAs = 0

public val SAY_AS_INTERPRET_AS_NUMBER: SayAsInterpretAs = 4

public val SAY_AS_INTERPRET_AS_ORDINAL: SayAsInterpretAs = 3

public val SAY_AS_INTERPRET_AS_SPELL: SayAsInterpretAs = 1

public val SAY_AS_INTERPRET_AS_TELEPHONE: SayAsInterpretAs = 7

public val SAY_AS_INTERPRET_AS_TIME: SayAsInterpretAs = 6

public val SAY_AS_INTERPRET_AS_TIME_HOURS_MINUTES12: SayAsInterpretAs = 24

public val SAY_AS_INTERPRET_AS_TIME_HOURS_MINUTES24: SayAsInterpretAs = 26

public val SAY_AS_INTERPRET_AS_TIME_HOURS_MINUTES_SECONDS12: SayAsInterpretAs = 23

public val SAY_AS_INTERPRET_AS_TIME_HOURS_MINUTES_SECONDS24: SayAsInterpretAs = 25

public val SAY_AS_INTERPRET_AS_URL: SayAsInterpretAs = 10

public val SCROLL_AMOUNT_LARGE_DECREMENT: ScrollAmount = 0

public val SCROLL_AMOUNT_LARGE_INCREMENT: ScrollAmount = 3

public val SCROLL_AMOUNT_NO_AMOUNT: ScrollAmount = 2

public val SCROLL_AMOUNT_SMALL_DECREMENT: ScrollAmount = 1

public val SCROLL_AMOUNT_SMALL_INCREMENT: ScrollAmount = 4

public val STRUCTURE_CHANGE_TYPE_CHILD_ADDED: StructureChangeType = 0

public val STRUCTURE_CHANGE_TYPE_CHILD_REMOVED: StructureChangeType = 1

public val STRUCTURE_CHANGE_TYPE_CHILDREN_BULK_ADDED: StructureChangeType = 3

public val STRUCTURE_CHANGE_TYPE_CHILDREN_BULK_REMOVED: StructureChangeType = 4

public val STRUCTURE_CHANGE_TYPE_CHILDREN_INVALIDATED: StructureChangeType = 2

public val STRUCTURE_CHANGE_TYPE_CHILDREN_REORDERED: StructureChangeType = 5

public val STYLE_ID_BULLETED_LIST: UiaStyleId = 70015

public val STYLE_ID_CUSTOM: UiaStyleId = 70000

public val STYLE_ID_EMPHASIS: UiaStyleId = 70013

public val STYLE_ID_HEADING1: UiaStyleId = 70001

public val STYLE_ID_HEADING2: UiaStyleId = 70002

public val STYLE_ID_HEADING3: UiaStyleId = 70003

public val STYLE_ID_HEADING4: UiaStyleId = 70004

public val STYLE_ID_HEADING5: UiaStyleId = 70005

public val STYLE_ID_HEADING6: UiaStyleId = 70006

public val STYLE_ID_HEADING7: UiaStyleId = 70007

public val STYLE_ID_HEADING8: UiaStyleId = 70008

public val STYLE_ID_HEADING9: UiaStyleId = 70009

public val STYLE_ID_NORMAL: UiaStyleId = 70012

public val STYLE_ID_NUMBERED_LIST: UiaStyleId = 70016

public val STYLE_ID_QUOTE: UiaStyleId = 70014

public val STYLE_ID_SUBTITLE: UiaStyleId = 70011

public val STYLE_ID_TITLE: UiaStyleId = 70010

public val SUPPORTED_TEXT_SELECTION_MULTIPLE: SupportedTextSelection = 2

public val SUPPORTED_TEXT_SELECTION_NONE: SupportedTextSelection = 0

public val SUPPORTED_TEXT_SELECTION_SINGLE: SupportedTextSelection = 1

public val SYNCHRONIZED_INPUT_TYPE_KEY_DOWN: SynchronizedInputType = 2

public val SYNCHRONIZED_INPUT_TYPE_KEY_UP: SynchronizedInputType = 1

public val SYNCHRONIZED_INPUT_TYPE_LEFT_MOUSE_DOWN: SynchronizedInputType = 8

public val SYNCHRONIZED_INPUT_TYPE_LEFT_MOUSE_UP: SynchronizedInputType = 4

public val SYNCHRONIZED_INPUT_TYPE_RIGHT_MOUSE_DOWN: SynchronizedInputType = 32

public val SYNCHRONIZED_INPUT_TYPE_RIGHT_MOUSE_UP: SynchronizedInputType = 16

public val TEXT_DECORATION_LINE_STYLE_DASH: TextDecorationLineStyle = 5

public val TEXT_DECORATION_LINE_STYLE_DASH_DOT: TextDecorationLineStyle = 6

public val TEXT_DECORATION_LINE_STYLE_DASH_DOT_DOT: TextDecorationLineStyle = 7

public val TEXT_DECORATION_LINE_STYLE_DOT: TextDecorationLineStyle = 4

public val TEXT_DECORATION_LINE_STYLE_DOUBLE: TextDecorationLineStyle = 3

public val TEXT_DECORATION_LINE_STYLE_DOUBLE_WAVY: TextDecorationLineStyle = 11

public val TEXT_DECORATION_LINE_STYLE_LONG_DASH: TextDecorationLineStyle = 13

public val TEXT_DECORATION_LINE_STYLE_NONE: TextDecorationLineStyle = 0

public val TEXT_DECORATION_LINE_STYLE_OTHER: TextDecorationLineStyle = -1

public val TEXT_DECORATION_LINE_STYLE_SINGLE: TextDecorationLineStyle = 1

public val TEXT_DECORATION_LINE_STYLE_THICK_DASH: TextDecorationLineStyle = 14

public val TEXT_DECORATION_LINE_STYLE_THICK_DASH_DOT: TextDecorationLineStyle = 15

public val TEXT_DECORATION_LINE_STYLE_THICK_DASH_DOT_DOT: TextDecorationLineStyle = 16

public val TEXT_DECORATION_LINE_STYLE_THICK_DOT: TextDecorationLineStyle = 17

public val TEXT_DECORATION_LINE_STYLE_THICK_LONG_DASH: TextDecorationLineStyle = 18

public val TEXT_DECORATION_LINE_STYLE_THICK_SINGLE: TextDecorationLineStyle = 9

public val TEXT_DECORATION_LINE_STYLE_THICK_WAVY: TextDecorationLineStyle = 12

public val TEXT_DECORATION_LINE_STYLE_WAVY: TextDecorationLineStyle = 8

public val TEXT_DECORATION_LINE_STYLE_WORDS_ONLY: TextDecorationLineStyle = 2

public val TEXT_EDIT_CHANGE_TYPE_AUTO_COMPLETE: TextEditChangeType = 4

public val TEXT_EDIT_CHANGE_TYPE_AUTO_CORRECT: TextEditChangeType = 1

public val TEXT_EDIT_CHANGE_TYPE_COMPOSITION: TextEditChangeType = 2

public val TEXT_EDIT_CHANGE_TYPE_COMPOSITION_FINALIZED: TextEditChangeType = 3

public val TEXT_EDIT_CHANGE_TYPE_NONE: TextEditChangeType = 0

public val TEXT_PATTERN_RANGE_ENDPOINT_END: TextPatternRangeEndpoint = 1

public val TEXT_PATTERN_RANGE_ENDPOINT_START: TextPatternRangeEndpoint = 0

public val TEXT_UNIT_CHARACTER: TextUnit = 0

public val TEXT_UNIT_DOCUMENT: TextUnit = 6

public val TEXT_UNIT_FORMAT: TextUnit = 1

public val TEXT_UNIT_LINE: TextUnit = 3

public val TEXT_UNIT_PAGE: TextUnit = 5

public val TEXT_UNIT_PARAGRAPH: TextUnit = 4

public val TEXT_UNIT_WORD: TextUnit = 2

public val TOGGLE_STATE_INDETERMINATE: ToggleState = 2

public val TOGGLE_STATE_OFF: ToggleState = 0

public val TOGGLE_STATE_ON: ToggleState = 1

public val TREE_SCOPE_ANCESTORS: TreeScope = 16

public val TREE_SCOPE_CHILDREN: TreeScope = 2

public val TREE_SCOPE_DESCENDANTS: TreeScope = 4

public val TREE_SCOPE_ELEMENT: TreeScope = 1

public val TREE_SCOPE_NONE: TreeScope = 0

public val TREE_SCOPE_PARENT: TreeScope = 8

public val TREE_SCOPE_SUBTREE: TreeScope = 7

public val TREE_TRAVERSAL_OPTIONS_DEFAULT: TreeTraversalOptions = 0

public val TREE_TRAVERSAL_OPTIONS_LAST_TO_FIRST_ORDER: TreeTraversalOptions = 2

public val TREE_TRAVERSAL_OPTIONS_POST_ORDER: TreeTraversalOptions = 1

public val UIA_ACCELERATOR_KEY_PROPERTY_ID: UiaPropertyId = 30006

public val UIA_ACCESS_KEY_PROPERTY_ID: UiaPropertyId = 30007

public val UIA_ACTIVE_TEXT_POSITION_CHANGED_EVENT_ID: UiaEventId = 20036

public val UIA_AFTER_PARAGRAPH_SPACING_ATTRIBUTE_ID: UiaTextattributeId = 40042

public val UIA_ANIMATION_STYLE_ATTRIBUTE_ID: UiaTextattributeId = 40000

public val UIA_ANNOTATION_ANNOTATION_TYPE_ID_PROPERTY_ID: UiaPropertyId = 30113

public val UIA_ANNOTATION_ANNOTATION_TYPE_NAME_PROPERTY_ID: UiaPropertyId = 30114

public val UIA_ANNOTATION_AUTHOR_PROPERTY_ID: UiaPropertyId = 30115

public val UIA_ANNOTATION_DATE_TIME_PROPERTY_ID: UiaPropertyId = 30116

public val UIA_ANNOTATION_OBJECTS_ATTRIBUTE_ID: UiaTextattributeId = 40032

public val UIA_ANNOTATION_OBJECTS_PROPERTY_ID: UiaPropertyId = 30156

public val UIA_ANNOTATION_PATTERN_ID: UiaPatternId = 10023

public val UIA_ANNOTATION_TARGET_PROPERTY_ID: UiaPropertyId = 30117

public val UIA_ANNOTATION_TYPES_ATTRIBUTE_ID: UiaTextattributeId = 40031

public val UIA_ANNOTATION_TYPES_PROPERTY_ID: UiaPropertyId = 30155

public val UIA_APP_BAR_CONTROL_TYPE_ID: UiaControltypeId = 50040

public val UIA_ARIA_PROPERTIES_PROPERTY_ID: UiaPropertyId = 30102

public val UIA_ARIA_ROLE_PROPERTY_ID: UiaPropertyId = 30101

public val UIA_ASYNC_CONTENT_LOADED_EVENT_ID: UiaEventId = 20006

public val UIA_AUTOMATION_FOCUS_CHANGED_EVENT_ID: UiaEventId = 20005

public val UIA_AUTOMATION_ID_PROPERTY_ID: UiaPropertyId = 30011

public val UIA_AUTOMATION_PROPERTY_CHANGED_EVENT_ID: UiaEventId = 20004

public val UIA_BACKGROUND_COLOR_ATTRIBUTE_ID: UiaTextattributeId = 40001

public val UIA_BEFORE_PARAGRAPH_SPACING_ATTRIBUTE_ID: UiaTextattributeId = 40041

public val UIA_BOUNDING_RECTANGLE_PROPERTY_ID: UiaPropertyId = 30001

public val UIA_BULLET_STYLE_ATTRIBUTE_ID: UiaTextattributeId = 40002

public val UIA_BUTTON_CONTROL_TYPE_ID: UiaControltypeId = 50000

public val UIA_CALENDAR_CONTROL_TYPE_ID: UiaControltypeId = 50001

public val UIA_CAP_STYLE_ATTRIBUTE_ID: UiaTextattributeId = 40003

public val UIA_CARET_BIDI_MODE_ATTRIBUTE_ID: UiaTextattributeId = 40039

public val UIA_CARET_POSITION_ATTRIBUTE_ID: UiaTextattributeId = 40038

public val UIA_CENTER_POINT_PROPERTY_ID: UiaPropertyId = 30165

public val UIA_CHANGES_EVENT_ID: UiaEventId = 20034

public val UIA_CHECK_BOX_CONTROL_TYPE_ID: UiaControltypeId = 50002

public val UIA_CLASS_NAME_PROPERTY_ID: UiaPropertyId = 30012

public val UIA_CLICKABLE_POINT_PROPERTY_ID: UiaPropertyId = 30014

public val UIA_COMBO_BOX_CONTROL_TYPE_ID: UiaControltypeId = 50003

public val UIA_CONTROL_TYPE_PROPERTY_ID: UiaPropertyId = 30003

public val UIA_CONTROLLER_FOR_PROPERTY_ID: UiaPropertyId = 30104

public val UIA_CULTURE_ATTRIBUTE_ID: UiaTextattributeId = 40004

public val UIA_CULTURE_PROPERTY_ID: UiaPropertyId = 30015

public val UIA_CUSTOM_CONTROL_TYPE_ID: UiaControltypeId = 50025

public val UIA_CUSTOM_LANDMARK_TYPE_ID: UiaLandmarktypeId = 80000

public val UIA_CUSTOM_NAVIGATION_PATTERN_ID: UiaPatternId = 10033

public val UIA_DATA_GRID_CONTROL_TYPE_ID: UiaControltypeId = 50028

public val UIA_DATA_ITEM_CONTROL_TYPE_ID: UiaControltypeId = 50029

public val UIA_DESCRIBED_BY_PROPERTY_ID: UiaPropertyId = 30105

public val UIA_DOCK_DOCK_POSITION_PROPERTY_ID: UiaPropertyId = 30069

public val UIA_DOCK_PATTERN_ID: UiaPatternId = 10011

public val UIA_DOCUMENT_CONTROL_TYPE_ID: UiaControltypeId = 50030

public val UIA_DRAG_DROP_EFFECT_PROPERTY_ID: UiaPropertyId = 30139

public val UIA_DRAG_DROP_EFFECTS_PROPERTY_ID: UiaPropertyId = 30140

public val UIA_DRAG_GRABBED_ITEMS_PROPERTY_ID: UiaPropertyId = 30144

public val UIA_DRAG_IS_GRABBED_PROPERTY_ID: UiaPropertyId = 30138

public val UIA_DRAG_PATTERN_ID: UiaPatternId = 10030

public val UIA_DRAG_DRAG_CANCEL_EVENT_ID: UiaEventId = 20027

public val UIA_DRAG_DRAG_COMPLETE_EVENT_ID: UiaEventId = 20028

public val UIA_DRAG_DRAG_START_EVENT_ID: UiaEventId = 20026

public val UIA_DROP_TARGET_DROP_TARGET_EFFECT_PROPERTY_ID: UiaPropertyId = 30142

public val UIA_DROP_TARGET_DROP_TARGET_EFFECTS_PROPERTY_ID: UiaPropertyId = 30143

public val UIA_DROP_TARGET_PATTERN_ID: UiaPatternId = 10031

public val UIA_DROP_TARGET_DRAG_ENTER_EVENT_ID: UiaEventId = 20029

public val UIA_DROP_TARGET_DRAG_LEAVE_EVENT_ID: UiaEventId = 20030

public val UIA_DROP_TARGET_DROPPED_EVENT_ID: UiaEventId = 20031

public val UIA_E_ELEMENTNOTAVAILABLE: UInt = 2147746305u

public val UIA_E_ELEMENTNOTENABLED: UInt = 2147746304u

public val UIA_E_INVALIDOPERATION: UInt = 2148734217u

public val UIA_E_NOCLICKABLEPOINT: UInt = 2147746306u

public val UIA_E_NOTSUPPORTED: UInt = 2147746308u

public val UIA_E_PROXYASSEMBLYNOTLOADED: UInt = 2147746307u

public val UIA_E_TIMEOUT: UInt = 2148734213u

public val UIA_EDIT_CONTROL_TYPE_ID: UiaControltypeId = 50004

public val UIA_EXPAND_COLLAPSE_EXPAND_COLLAPSE_STATE_PROPERTY_ID: UiaPropertyId = 30070

public val UIA_EXPAND_COLLAPSE_PATTERN_ID: UiaPatternId = 10005

public val UIA_FILL_COLOR_PROPERTY_ID: UiaPropertyId = 30160

public val UIA_FILL_TYPE_PROPERTY_ID: UiaPropertyId = 30162

public val UIA_FLOWS_FROM_PROPERTY_ID: UiaPropertyId = 30148

public val UIA_FLOWS_TO_PROPERTY_ID: UiaPropertyId = 30106

public val UIA_FONT_NAME_ATTRIBUTE_ID: UiaTextattributeId = 40005

public val UIA_FONT_SIZE_ATTRIBUTE_ID: UiaTextattributeId = 40006

public val UIA_FONT_WEIGHT_ATTRIBUTE_ID: UiaTextattributeId = 40007

public val UIA_FOREGROUND_COLOR_ATTRIBUTE_ID: UiaTextattributeId = 40008

public val UIA_FORM_LANDMARK_TYPE_ID: UiaLandmarktypeId = 80001

public val UIA_FRAMEWORK_ID_PROPERTY_ID: UiaPropertyId = 30024

public val UIA_FULL_DESCRIPTION_PROPERTY_ID: UiaPropertyId = 30159

public val UIA_GRID_COLUMN_COUNT_PROPERTY_ID: UiaPropertyId = 30063

public val UIA_GRID_ITEM_COLUMN_PROPERTY_ID: UiaPropertyId = 30065

public val UIA_GRID_ITEM_COLUMN_SPAN_PROPERTY_ID: UiaPropertyId = 30067

public val UIA_GRID_ITEM_CONTAINING_GRID_PROPERTY_ID: UiaPropertyId = 30068

public val UIA_GRID_ITEM_PATTERN_ID: UiaPatternId = 10007

public val UIA_GRID_ITEM_ROW_PROPERTY_ID: UiaPropertyId = 30064

public val UIA_GRID_ITEM_ROW_SPAN_PROPERTY_ID: UiaPropertyId = 30066

public val UIA_GRID_PATTERN_ID: UiaPatternId = 10006

public val UIA_GRID_ROW_COUNT_PROPERTY_ID: UiaPropertyId = 30062

public val UIA_GROUP_CONTROL_TYPE_ID: UiaControltypeId = 50026

public val UIA_HAS_KEYBOARD_FOCUS_PROPERTY_ID: UiaPropertyId = 30008

public val UIA_HEADER_CONTROL_TYPE_ID: UiaControltypeId = 50034

public val UIA_HEADER_ITEM_CONTROL_TYPE_ID: UiaControltypeId = 50035

public val UIA_HEADING_LEVEL_PROPERTY_ID: UiaPropertyId = 30173

public val UIA_HELP_TEXT_PROPERTY_ID: UiaPropertyId = 30013

public val UIA_HORIZONTAL_TEXT_ALIGNMENT_ATTRIBUTE_ID: UiaTextattributeId = 40009

public val UIA_HOSTED_FRAGMENT_ROOTS_INVALIDATED_EVENT_ID: UiaEventId = 20025

public val UIA_HYPERLINK_CONTROL_TYPE_ID: UiaControltypeId = 50005

public val UIA_IAFP_DEFAULT: UInt = 0u

public val UIA_IAFP_UNWRAP_BRIDGE: UInt = 1u

public val UIA_IMAGE_CONTROL_TYPE_ID: UiaControltypeId = 50006

public val UIA_INDENTATION_FIRST_LINE_ATTRIBUTE_ID: UiaTextattributeId = 40010

public val UIA_INDENTATION_LEADING_ATTRIBUTE_ID: UiaTextattributeId = 40011

public val UIA_INDENTATION_TRAILING_ATTRIBUTE_ID: UiaTextattributeId = 40012

public val UIA_INPUT_DISCARDED_EVENT_ID: UiaEventId = 20022

public val UIA_INPUT_REACHED_OTHER_ELEMENT_EVENT_ID: UiaEventId = 20021

public val UIA_INPUT_REACHED_TARGET_EVENT_ID: UiaEventId = 20020

public val UIA_INVOKE_PATTERN_ID: UiaPatternId = 10000

public val UIA_INVOKE_INVOKED_EVENT_ID: UiaEventId = 20009

public val UIA_IS_ACTIVE_ATTRIBUTE_ID: UiaTextattributeId = 40036

public val UIA_IS_ANNOTATION_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30118

public val UIA_IS_CONTENT_ELEMENT_PROPERTY_ID: UiaPropertyId = 30017

public val UIA_IS_CONTROL_ELEMENT_PROPERTY_ID: UiaPropertyId = 30016

public val UIA_IS_CUSTOM_NAVIGATION_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30151

public val UIA_IS_DATA_VALID_FOR_FORM_PROPERTY_ID: UiaPropertyId = 30103

public val UIA_IS_DIALOG_PROPERTY_ID: UiaPropertyId = 30174

public val UIA_IS_DOCK_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30027

public val UIA_IS_DRAG_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30137

public val UIA_IS_DROP_TARGET_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30141

public val UIA_IS_ENABLED_PROPERTY_ID: UiaPropertyId = 30010

public val UIA_IS_EXPAND_COLLAPSE_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30028

public val UIA_IS_GRID_ITEM_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30029

public val UIA_IS_GRID_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30030

public val UIA_IS_HIDDEN_ATTRIBUTE_ID: UiaTextattributeId = 40013

public val UIA_IS_INVOKE_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30031

public val UIA_IS_ITALIC_ATTRIBUTE_ID: UiaTextattributeId = 40014

public val UIA_IS_ITEM_CONTAINER_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30108

public val UIA_IS_KEYBOARD_FOCUSABLE_PROPERTY_ID: UiaPropertyId = 30009

public val UIA_IS_LEGACY_I_ACCESSIBLE_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30090

public val UIA_IS_MULTIPLE_VIEW_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30032

public val UIA_IS_OBJECT_MODEL_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30112

public val UIA_IS_OFFSCREEN_PROPERTY_ID: UiaPropertyId = 30022

public val UIA_IS_PASSWORD_PROPERTY_ID: UiaPropertyId = 30019

public val UIA_IS_PERIPHERAL_PROPERTY_ID: UiaPropertyId = 30150

public val UIA_IS_RANGE_VALUE_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30033

public val UIA_IS_READ_ONLY_ATTRIBUTE_ID: UiaTextattributeId = 40015

public val UIA_IS_REQUIRED_FOR_FORM_PROPERTY_ID: UiaPropertyId = 30025

public val UIA_IS_SCROLL_ITEM_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30035

public val UIA_IS_SCROLL_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30034

public val UIA_IS_SELECTION_ITEM_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30036

public val UIA_IS_SELECTION_PATTERN2AVAILABLE_PROPERTY_ID: UiaPropertyId = 30168

public val UIA_IS_SELECTION_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30037

public val UIA_IS_SPREADSHEET_ITEM_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30132

public val UIA_IS_SPREADSHEET_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30128

public val UIA_IS_STYLES_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30127

public val UIA_IS_SUBSCRIPT_ATTRIBUTE_ID: UiaTextattributeId = 40016

public val UIA_IS_SUPERSCRIPT_ATTRIBUTE_ID: UiaTextattributeId = 40017

public val UIA_IS_SYNCHRONIZED_INPUT_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30110

public val UIA_IS_TABLE_ITEM_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30039

public val UIA_IS_TABLE_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30038

public val UIA_IS_TEXT_CHILD_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30136

public val UIA_IS_TEXT_EDIT_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30149

public val UIA_IS_TEXT_PATTERN2AVAILABLE_PROPERTY_ID: UiaPropertyId = 30119

public val UIA_IS_TEXT_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30040

public val UIA_IS_TOGGLE_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30041

public val UIA_IS_TRANSFORM_PATTERN2AVAILABLE_PROPERTY_ID: UiaPropertyId = 30134

public val UIA_IS_TRANSFORM_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30042

public val UIA_IS_VALUE_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30043

public val UIA_IS_VIRTUALIZED_ITEM_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30109

public val UIA_IS_WINDOW_PATTERN_AVAILABLE_PROPERTY_ID: UiaPropertyId = 30044

public val UIA_ITEM_CONTAINER_PATTERN_ID: UiaPatternId = 10019

public val UIA_ITEM_STATUS_PROPERTY_ID: UiaPropertyId = 30026

public val UIA_ITEM_TYPE_PROPERTY_ID: UiaPropertyId = 30021

public val UIA_LABELED_BY_PROPERTY_ID: UiaPropertyId = 30018

public val UIA_LANDMARK_TYPE_PROPERTY_ID: UiaPropertyId = 30157

public val UIA_LAYOUT_INVALIDATED_EVENT_ID: UiaEventId = 20008

public val UIA_LEGACY_I_ACCESSIBLE_CHILD_ID_PROPERTY_ID: UiaPropertyId = 30091

public val UIA_LEGACY_I_ACCESSIBLE_DEFAULT_ACTION_PROPERTY_ID: UiaPropertyId = 30100

public val UIA_LEGACY_I_ACCESSIBLE_DESCRIPTION_PROPERTY_ID: UiaPropertyId = 30094

public val UIA_LEGACY_I_ACCESSIBLE_HELP_PROPERTY_ID: UiaPropertyId = 30097

public val UIA_LEGACY_I_ACCESSIBLE_KEYBOARD_SHORTCUT_PROPERTY_ID: UiaPropertyId = 30098

public val UIA_LEGACY_I_ACCESSIBLE_NAME_PROPERTY_ID: UiaPropertyId = 30092

public val UIA_LEGACY_I_ACCESSIBLE_PATTERN_ID: UiaPatternId = 10018

public val UIA_LEGACY_I_ACCESSIBLE_ROLE_PROPERTY_ID: UiaPropertyId = 30095

public val UIA_LEGACY_I_ACCESSIBLE_SELECTION_PROPERTY_ID: UiaPropertyId = 30099

public val UIA_LEGACY_I_ACCESSIBLE_STATE_PROPERTY_ID: UiaPropertyId = 30096

public val UIA_LEGACY_I_ACCESSIBLE_VALUE_PROPERTY_ID: UiaPropertyId = 30093

public val UIA_LEVEL_PROPERTY_ID: UiaPropertyId = 30154

public val UIA_LINE_SPACING_ATTRIBUTE_ID: UiaTextattributeId = 40040

public val UIA_LINK_ATTRIBUTE_ID: UiaTextattributeId = 40035

public val UIA_LIST_CONTROL_TYPE_ID: UiaControltypeId = 50008

public val UIA_LIST_ITEM_CONTROL_TYPE_ID: UiaControltypeId = 50007

public val UIA_LIVE_REGION_CHANGED_EVENT_ID: UiaEventId = 20024

public val UIA_LIVE_SETTING_PROPERTY_ID: UiaPropertyId = 30135

public val UIA_LOCALIZED_CONTROL_TYPE_PROPERTY_ID: UiaPropertyId = 30004

public val UIA_LOCALIZED_LANDMARK_TYPE_PROPERTY_ID: UiaPropertyId = 30158

public val UIA_MAIN_LANDMARK_TYPE_ID: UiaLandmarktypeId = 80002

public val UIA_MARGIN_BOTTOM_ATTRIBUTE_ID: UiaTextattributeId = 40018

public val UIA_MARGIN_LEADING_ATTRIBUTE_ID: UiaTextattributeId = 40019

public val UIA_MARGIN_TOP_ATTRIBUTE_ID: UiaTextattributeId = 40020

public val UIA_MARGIN_TRAILING_ATTRIBUTE_ID: UiaTextattributeId = 40021

public val UIA_MENU_BAR_CONTROL_TYPE_ID: UiaControltypeId = 50010

public val UIA_MENU_CLOSED_EVENT_ID: UiaEventId = 20007

public val UIA_MENU_CONTROL_TYPE_ID: UiaControltypeId = 50009

public val UIA_MENU_ITEM_CONTROL_TYPE_ID: UiaControltypeId = 50011

public val UIA_MENU_MODE_END_EVENT_ID: UiaEventId = 20019

public val UIA_MENU_MODE_START_EVENT_ID: UiaEventId = 20018

public val UIA_MENU_OPENED_EVENT_ID: UiaEventId = 20003

public val UIA_MULTIPLE_VIEW_CURRENT_VIEW_PROPERTY_ID: UiaPropertyId = 30071

public val UIA_MULTIPLE_VIEW_PATTERN_ID: UiaPatternId = 10008

public val UIA_MULTIPLE_VIEW_SUPPORTED_VIEWS_PROPERTY_ID: UiaPropertyId = 30072

public val UIA_NAME_PROPERTY_ID: UiaPropertyId = 30005

public val UIA_NATIVE_WINDOW_HANDLE_PROPERTY_ID: UiaPropertyId = 30020

public val UIA_NAVIGATION_LANDMARK_TYPE_ID: UiaLandmarktypeId = 80003

public val UIA_NOTIFICATION_EVENT_ID: UiaEventId = 20035

public val UIA_OBJECT_MODEL_PATTERN_ID: UiaPatternId = 10022

public val UIA_OPTIMIZE_FOR_VISUAL_CONTENT_PROPERTY_ID: UiaPropertyId = 30111

public val UIA_ORIENTATION_PROPERTY_ID: UiaPropertyId = 30023

public val UIA_OUTLINE_COLOR_PROPERTY_ID: UiaPropertyId = 30161

public val UIA_OUTLINE_STYLES_ATTRIBUTE_ID: UiaTextattributeId = 40022

public val UIA_OUTLINE_THICKNESS_PROPERTY_ID: UiaPropertyId = 30164

public val UIA_OVERLINE_COLOR_ATTRIBUTE_ID: UiaTextattributeId = 40023

public val UIA_OVERLINE_STYLE_ATTRIBUTE_ID: UiaTextattributeId = 40024

public val UIA_PFIA_DEFAULT: UInt = 0u

public val UIA_PFIA_UNWRAP_BRIDGE: UInt = 1u

public val UIA_PANE_CONTROL_TYPE_ID: UiaControltypeId = 50033

public val UIA_POSITION_IN_SET_PROPERTY_ID: UiaPropertyId = 30152

public val UIA_PROCESS_ID_PROPERTY_ID: UiaPropertyId = 30002

public val UIA_PROGRESS_BAR_CONTROL_TYPE_ID: UiaControltypeId = 50012

public val UIA_PROVIDER_DESCRIPTION_PROPERTY_ID: UiaPropertyId = 30107

public val UIA_RADIO_BUTTON_CONTROL_TYPE_ID: UiaControltypeId = 50013

public val UIA_RANGE_VALUE_IS_READ_ONLY_PROPERTY_ID: UiaPropertyId = 30048

public val UIA_RANGE_VALUE_LARGE_CHANGE_PROPERTY_ID: UiaPropertyId = 30051

public val UIA_RANGE_VALUE_MAXIMUM_PROPERTY_ID: UiaPropertyId = 30050

public val UIA_RANGE_VALUE_MINIMUM_PROPERTY_ID: UiaPropertyId = 30049

public val UIA_RANGE_VALUE_PATTERN_ID: UiaPatternId = 10003

public val UIA_RANGE_VALUE_SMALL_CHANGE_PROPERTY_ID: UiaPropertyId = 30052

public val UIA_RANGE_VALUE_VALUE_PROPERTY_ID: UiaPropertyId = 30047

public val UIA_ROTATION_PROPERTY_ID: UiaPropertyId = 30166

public val UIA_RUNTIME_ID_PROPERTY_ID: UiaPropertyId = 30000

public val UIA_SAY_AS_INTERPRET_AS_ATTRIBUTE_ID: UiaTextattributeId = 40043

public val UIA_SAY_AS_INTERPRET_AS_METADATA_ID: UiaMetadataId = 100000

public val UIA_SCROLL_BAR_CONTROL_TYPE_ID: UiaControltypeId = 50014

public val UIA_SCROLL_HORIZONTAL_SCROLL_PERCENT_PROPERTY_ID: UiaPropertyId = 30053

public val UIA_SCROLL_HORIZONTAL_VIEW_SIZE_PROPERTY_ID: UiaPropertyId = 30054

public val UIA_SCROLL_HORIZONTALLY_SCROLLABLE_PROPERTY_ID: UiaPropertyId = 30057

public val UIA_SCROLL_ITEM_PATTERN_ID: UiaPatternId = 10017

public val UIA_SCROLL_PATTERN_ID: UiaPatternId = 10004

public val UIA_SCROLL_PATTERN_NO_SCROLL: Double = -1.0

public val UIA_SCROLL_VERTICAL_SCROLL_PERCENT_PROPERTY_ID: UiaPropertyId = 30055

public val UIA_SCROLL_VERTICAL_VIEW_SIZE_PROPERTY_ID: UiaPropertyId = 30056

public val UIA_SCROLL_VERTICALLY_SCROLLABLE_PROPERTY_ID: UiaPropertyId = 30058

public val UIA_SEARCH_LANDMARK_TYPE_ID: UiaLandmarktypeId = 80004

public val UIA_SELECTION2CURRENT_SELECTED_ITEM_PROPERTY_ID: UiaPropertyId = 30171

public val UIA_SELECTION2FIRST_SELECTED_ITEM_PROPERTY_ID: UiaPropertyId = 30169

public val UIA_SELECTION2ITEM_COUNT_PROPERTY_ID: UiaPropertyId = 30172

public val UIA_SELECTION2LAST_SELECTED_ITEM_PROPERTY_ID: UiaPropertyId = 30170

public val UIA_SELECTION_ACTIVE_END_ATTRIBUTE_ID: UiaTextattributeId = 40037

public val UIA_SELECTION_CAN_SELECT_MULTIPLE_PROPERTY_ID: UiaPropertyId = 30060

public val UIA_SELECTION_IS_SELECTION_REQUIRED_PROPERTY_ID: UiaPropertyId = 30061

public val UIA_SELECTION_ITEM_IS_SELECTED_PROPERTY_ID: UiaPropertyId = 30079

public val UIA_SELECTION_ITEM_PATTERN_ID: UiaPatternId = 10010

public val UIA_SELECTION_ITEM_SELECTION_CONTAINER_PROPERTY_ID: UiaPropertyId = 30080

public val UIA_SELECTION_ITEM_ELEMENT_ADDED_TO_SELECTION_EVENT_ID: UiaEventId = 20010

public val UIA_SELECTION_ITEM_ELEMENT_REMOVED_FROM_SELECTION_EVENT_ID: UiaEventId = 20011

public val UIA_SELECTION_ITEM_ELEMENT_SELECTED_EVENT_ID: UiaEventId = 20012

public val UIA_SELECTION_PATTERN2ID: UiaPatternId = 10034

public val UIA_SELECTION_PATTERN_ID: UiaPatternId = 10001

public val UIA_SELECTION_SELECTION_PROPERTY_ID: UiaPropertyId = 30059

public val UIA_SELECTION_INVALIDATED_EVENT_ID: UiaEventId = 20013

public val UIA_SEMANTIC_ZOOM_CONTROL_TYPE_ID: UiaControltypeId = 50039

public val UIA_SEPARATOR_CONTROL_TYPE_ID: UiaControltypeId = 50038

public val UIA_SIZE_OF_SET_PROPERTY_ID: UiaPropertyId = 30153

public val UIA_SIZE_PROPERTY_ID: UiaPropertyId = 30167

public val UIA_SLIDER_CONTROL_TYPE_ID: UiaControltypeId = 50015

public val UIA_SPINNER_CONTROL_TYPE_ID: UiaControltypeId = 50016

public val UIA_SPLIT_BUTTON_CONTROL_TYPE_ID: UiaControltypeId = 50031

public val UIA_SPREADSHEET_ITEM_ANNOTATION_OBJECTS_PROPERTY_ID: UiaPropertyId = 30130

public val UIA_SPREADSHEET_ITEM_ANNOTATION_TYPES_PROPERTY_ID: UiaPropertyId = 30131

public val UIA_SPREADSHEET_ITEM_FORMULA_PROPERTY_ID: UiaPropertyId = 30129

public val UIA_SPREADSHEET_ITEM_PATTERN_ID: UiaPatternId = 10027

public val UIA_SPREADSHEET_PATTERN_ID: UiaPatternId = 10026

public val UIA_STATUS_BAR_CONTROL_TYPE_ID: UiaControltypeId = 50017

public val UIA_STRIKETHROUGH_COLOR_ATTRIBUTE_ID: UiaTextattributeId = 40025

public val UIA_STRIKETHROUGH_STYLE_ATTRIBUTE_ID: UiaTextattributeId = 40026

public val UIA_STRUCTURE_CHANGED_EVENT_ID: UiaEventId = 20002

public val UIA_STYLE_ID_ATTRIBUTE_ID: UiaTextattributeId = 40034

public val UIA_STYLE_NAME_ATTRIBUTE_ID: UiaTextattributeId = 40033

public val UIA_STYLES_EXTENDED_PROPERTIES_PROPERTY_ID: UiaPropertyId = 30126

public val UIA_STYLES_FILL_COLOR_PROPERTY_ID: UiaPropertyId = 30122

public val UIA_STYLES_FILL_PATTERN_COLOR_PROPERTY_ID: UiaPropertyId = 30125

public val UIA_STYLES_FILL_PATTERN_STYLE_PROPERTY_ID: UiaPropertyId = 30123

public val UIA_STYLES_PATTERN_ID: UiaPatternId = 10025

public val UIA_STYLES_SHAPE_PROPERTY_ID: UiaPropertyId = 30124

public val UIA_STYLES_STYLE_ID_PROPERTY_ID: UiaPropertyId = 30120

public val UIA_STYLES_STYLE_NAME_PROPERTY_ID: UiaPropertyId = 30121

public val UIA_SUMMARY_CHANGE_ID: UiaChangeId = 90000

public val UIA_SYNCHRONIZED_INPUT_PATTERN_ID: UiaPatternId = 10021

public val UIA_SYSTEM_ALERT_EVENT_ID: UiaEventId = 20023

public val UIA_TAB_CONTROL_TYPE_ID: UiaControltypeId = 50018

public val UIA_TAB_ITEM_CONTROL_TYPE_ID: UiaControltypeId = 50019

public val UIA_TABLE_COLUMN_HEADERS_PROPERTY_ID: UiaPropertyId = 30082

public val UIA_TABLE_CONTROL_TYPE_ID: UiaControltypeId = 50036

public val UIA_TABLE_ITEM_COLUMN_HEADER_ITEMS_PROPERTY_ID: UiaPropertyId = 30085

public val UIA_TABLE_ITEM_PATTERN_ID: UiaPatternId = 10013

public val UIA_TABLE_ITEM_ROW_HEADER_ITEMS_PROPERTY_ID: UiaPropertyId = 30084

public val UIA_TABLE_PATTERN_ID: UiaPatternId = 10012

public val UIA_TABLE_ROW_HEADERS_PROPERTY_ID: UiaPropertyId = 30081

public val UIA_TABLE_ROW_OR_COLUMN_MAJOR_PROPERTY_ID: UiaPropertyId = 30083

public val UIA_TABS_ATTRIBUTE_ID: UiaTextattributeId = 40027

public val UIA_TEXT_CHILD_PATTERN_ID: UiaPatternId = 10029

public val UIA_TEXT_CONTROL_TYPE_ID: UiaControltypeId = 50020

public val UIA_TEXT_EDIT_PATTERN_ID: UiaPatternId = 10032

public val UIA_TEXT_EDIT_CONVERSION_TARGET_CHANGED_EVENT_ID: UiaEventId = 20033

public val UIA_TEXT_EDIT_TEXT_CHANGED_EVENT_ID: UiaEventId = 20032

public val UIA_TEXT_FLOW_DIRECTIONS_ATTRIBUTE_ID: UiaTextattributeId = 40028

public val UIA_TEXT_PATTERN2ID: UiaPatternId = 10024

public val UIA_TEXT_PATTERN_ID: UiaPatternId = 10014

public val UIA_TEXT_TEXT_CHANGED_EVENT_ID: UiaEventId = 20015

public val UIA_TEXT_TEXT_SELECTION_CHANGED_EVENT_ID: UiaEventId = 20014

public val UIA_THUMB_CONTROL_TYPE_ID: UiaControltypeId = 50027

public val UIA_TITLE_BAR_CONTROL_TYPE_ID: UiaControltypeId = 50037

public val UIA_TOGGLE_PATTERN_ID: UiaPatternId = 10015

public val UIA_TOGGLE_TOGGLE_STATE_PROPERTY_ID: UiaPropertyId = 30086

public val UIA_TOOL_BAR_CONTROL_TYPE_ID: UiaControltypeId = 50021

public val UIA_TOOL_TIP_CLOSED_EVENT_ID: UiaEventId = 20001

public val UIA_TOOL_TIP_CONTROL_TYPE_ID: UiaControltypeId = 50022

public val UIA_TOOL_TIP_OPENED_EVENT_ID: UiaEventId = 20000

public val UIA_TRANSFORM2CAN_ZOOM_PROPERTY_ID: UiaPropertyId = 30133

public val UIA_TRANSFORM2ZOOM_LEVEL_PROPERTY_ID: UiaPropertyId = 30145

public val UIA_TRANSFORM2ZOOM_MAXIMUM_PROPERTY_ID: UiaPropertyId = 30147

public val UIA_TRANSFORM2ZOOM_MINIMUM_PROPERTY_ID: UiaPropertyId = 30146

public val UIA_TRANSFORM_CAN_MOVE_PROPERTY_ID: UiaPropertyId = 30087

public val UIA_TRANSFORM_CAN_RESIZE_PROPERTY_ID: UiaPropertyId = 30088

public val UIA_TRANSFORM_CAN_ROTATE_PROPERTY_ID: UiaPropertyId = 30089

public val UIA_TRANSFORM_PATTERN2ID: UiaPatternId = 10028

public val UIA_TRANSFORM_PATTERN_ID: UiaPatternId = 10016

public val UIA_TREE_CONTROL_TYPE_ID: UiaControltypeId = 50023

public val UIA_TREE_ITEM_CONTROL_TYPE_ID: UiaControltypeId = 50024

public val UIA_UNDERLINE_COLOR_ATTRIBUTE_ID: UiaTextattributeId = 40029

public val UIA_UNDERLINE_STYLE_ATTRIBUTE_ID: UiaTextattributeId = 40030

public val UIA_VALUE_IS_READ_ONLY_PROPERTY_ID: UiaPropertyId = 30046

public val UIA_VALUE_PATTERN_ID: UiaPatternId = 10002

public val UIA_VALUE_VALUE_PROPERTY_ID: UiaPropertyId = 30045

public val UIA_VIRTUALIZED_ITEM_PATTERN_ID: UiaPatternId = 10020

public val UIA_VISUAL_EFFECTS_PROPERTY_ID: UiaPropertyId = 30163

public val UIA_WINDOW_CAN_MAXIMIZE_PROPERTY_ID: UiaPropertyId = 30073

public val UIA_WINDOW_CAN_MINIMIZE_PROPERTY_ID: UiaPropertyId = 30074

public val UIA_WINDOW_CONTROL_TYPE_ID: UiaControltypeId = 50032

public val UIA_WINDOW_IS_MODAL_PROPERTY_ID: UiaPropertyId = 30077

public val UIA_WINDOW_IS_TOPMOST_PROPERTY_ID: UiaPropertyId = 30078

public val UIA_WINDOW_PATTERN_ID: UiaPatternId = 10009

public val UIA_WINDOW_WINDOW_INTERACTION_STATE_PROPERTY_ID: UiaPropertyId = 30076

public val UIA_WINDOW_WINDOW_VISUAL_STATE_PROPERTY_ID: UiaPropertyId = 30075

public val UIA_WINDOW_WINDOW_CLOSED_EVENT_ID: UiaEventId = 20017

public val UIA_WINDOW_WINDOW_OPENED_EVENT_ID: UiaEventId = 20016

public val UI_AUTOMATION_TYPE_ARRAY: UIAutomationType = 65536

public val UI_AUTOMATION_TYPE_BOOL: UIAutomationType = 2

public val UI_AUTOMATION_TYPE_BOOL_ARRAY: UIAutomationType = 65538

public val UI_AUTOMATION_TYPE_DOUBLE: UIAutomationType = 4

public val UI_AUTOMATION_TYPE_DOUBLE_ARRAY: UIAutomationType = 65540

public val UI_AUTOMATION_TYPE_ELEMENT: UIAutomationType = 7

public val UI_AUTOMATION_TYPE_ELEMENT_ARRAY: UIAutomationType = 65543

public val UI_AUTOMATION_TYPE_INT: UIAutomationType = 1

public val UI_AUTOMATION_TYPE_INT_ARRAY: UIAutomationType = 65537

public val UI_AUTOMATION_TYPE_OUT: UIAutomationType = 131072

public val UI_AUTOMATION_TYPE_OUT_BOOL: UIAutomationType = 131074

public val UI_AUTOMATION_TYPE_OUT_BOOL_ARRAY: UIAutomationType = 196610

public val UI_AUTOMATION_TYPE_OUT_DOUBLE: UIAutomationType = 131076

public val UI_AUTOMATION_TYPE_OUT_DOUBLE_ARRAY: UIAutomationType = 196612

public val UI_AUTOMATION_TYPE_OUT_ELEMENT: UIAutomationType = 131079

public val UI_AUTOMATION_TYPE_OUT_ELEMENT_ARRAY: UIAutomationType = 196615

public val UI_AUTOMATION_TYPE_OUT_INT: UIAutomationType = 131073

public val UI_AUTOMATION_TYPE_OUT_INT_ARRAY: UIAutomationType = 196609

public val UI_AUTOMATION_TYPE_OUT_POINT: UIAutomationType = 131077

public val UI_AUTOMATION_TYPE_OUT_POINT_ARRAY: UIAutomationType = 196613

public val UI_AUTOMATION_TYPE_OUT_RECT: UIAutomationType = 131078

public val UI_AUTOMATION_TYPE_OUT_RECT_ARRAY: UIAutomationType = 196614

public val UI_AUTOMATION_TYPE_OUT_STRING: UIAutomationType = 131075

public val UI_AUTOMATION_TYPE_OUT_STRING_ARRAY: UIAutomationType = 196611

public val UI_AUTOMATION_TYPE_POINT: UIAutomationType = 5

public val UI_AUTOMATION_TYPE_POINT_ARRAY: UIAutomationType = 65541

public val UI_AUTOMATION_TYPE_RECT: UIAutomationType = 6

public val UI_AUTOMATION_TYPE_RECT_ARRAY: UIAutomationType = 65542

public val UI_AUTOMATION_TYPE_STRING: UIAutomationType = 3

public val UI_AUTOMATION_TYPE_STRING_ARRAY: UIAutomationType = 65539

public val UIA_APPEND_RUNTIME_ID: UInt = 3u

public val UIA_ROOT_OBJECT_ID: Int = -25

public val VISUAL_EFFECTS_BEVEL: VisualEffects = 16

public val VISUAL_EFFECTS_GLOW: VisualEffects = 4

public val VISUAL_EFFECTS_NONE: VisualEffects = 0

public val VISUAL_EFFECTS_REFLECTION: VisualEffects = 2

public val VISUAL_EFFECTS_SHADOW: VisualEffects = 1

public val VISUAL_EFFECTS_SOFT_EDGES: VisualEffects = 8

public val WINDOW_INTERACTION_STATE_BLOCKED_BY_MODAL_WINDOW: WindowInteractionState = 3

public val WINDOW_INTERACTION_STATE_CLOSING: WindowInteractionState = 1

public val WINDOW_INTERACTION_STATE_NOT_RESPONDING: WindowInteractionState = 4

public val WINDOW_INTERACTION_STATE_READY_FOR_USER_INTERACTION: WindowInteractionState = 2

public val WINDOW_INTERACTION_STATE_RUNNING: WindowInteractionState = 0

public val WINDOW_VISUAL_STATE_MAXIMIZED: WindowVisualState = 1

public val WINDOW_VISUAL_STATE_MINIMIZED: WindowVisualState = 2

public val WINDOW_VISUAL_STATE_NORMAL: WindowVisualState = 0

public val ZOOM_UNIT_LARGE_DECREMENT: ZoomUnit = 1

public val ZOOM_UNIT_LARGE_INCREMENT: ZoomUnit = 3

public val ZOOM_UNIT_NO_AMOUNT: ZoomUnit = 0

public val ZOOM_UNIT_SMALL_DECREMENT: ZoomUnit = 2

public val ZOOM_UNIT_SMALL_INCREMENT: ZoomUnit = 4

public val ACCELERATOR_KEY_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x514865df25574cb9uL, 0xaeed6ced084ce52cuL))

public val ACCESS_KEY_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6827b12a7f94a15uL, 0x917cffa5ad3eb0a7uL))

public val ACTIVE_TEXT_POSITION_CHANGED_EVENT_GUID: Guid = Guid.fromU128(U128(0xa5c09e9cc77d4f25uL, 0xb491e5bb7017cbd4uL))

public val ANNOTATION_OBJECTS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x310910c87c6e4f20uL, 0xbecd4aaf6d191156uL))

public val ANNOTATION_TYPES_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x64b71f7653c44696uL, 0xa21920e940c9a176uL))

public val ANNOTATION_ADVANCED_PROOFING_ISSUE_GUID: Guid = Guid.fromU128(U128(0xdac7b72cc0f24b84uL, 0xb90d5fafc0f0ef1cuL))

public val ANNOTATION_ANNOTATION_TYPE_ID_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x20ae484f69ef4c48uL, 0x8f5bc4938b206ac7uL))

public val ANNOTATION_ANNOTATION_TYPE_NAME_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x9b8188925ac94af9uL, 0xaa96f58a77b058e3uL))

public val ANNOTATION_AUTHOR_GUID: Guid = Guid.fromU128(U128(0xf161d3a7f81b4128uL, 0xb17f71f690914520uL))

public val ANNOTATION_AUTHOR_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x7a5284629c5c4a03uL, 0xa9748b307a9937f2uL))

public val ANNOTATION_CIRCULAR_REFERENCE_ERROR_GUID: Guid = Guid.fromU128(U128(0x25bd9cf417454659uL, 0xba67727f0318c616uL))

public val ANNOTATION_COMMENT_GUID: Guid = Guid.fromU128(U128(0xfd2fda3026b34c06uL, 0x8bc798f1532e46fduL))

public val ANNOTATION_CONFLICTING_CHANGE_GUID: Guid = Guid.fromU128(U128(0x98af8802517c459fuL, 0xaf13016d3fab877euL))

public val ANNOTATION_CUSTOM_GUID: Guid = Guid.fromU128(U128(0x9ec8275039314952uL, 0x85bc1dbff78a43e3uL))

public val ANNOTATION_DATA_VALIDATION_ERROR_GUID: Guid = Guid.fromU128(U128(0xc8649fa89775437euL, 0xad46e709d93c2343uL))

public val ANNOTATION_DATE_TIME_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x99b5ca5d1acf414buL, 0xa4d06b350b047578uL))

public val ANNOTATION_DELETION_CHANGE_GUID: Guid = Guid.fromU128(U128(0xbe3d5b05951d42e7uL, 0x901dadc8c2cf34d0uL))

public val ANNOTATION_EDITING_LOCKED_CHANGE_GUID: Guid = Guid.fromU128(U128(0xc31f3e1c74234dacuL, 0x834841f099ff6f64uL))

public val ANNOTATION_ENDNOTE_GUID: Guid = Guid.fromU128(U128(0x7565725c2d994839uL, 0x960d33d3b866aba5uL))

public val ANNOTATION_EXTERNAL_CHANGE_GUID: Guid = Guid.fromU128(U128(0x75a05b315f1142fduL, 0x887ddfa010db2392uL))

public val ANNOTATION_FOOTER_GUID: Guid = Guid.fromU128(U128(0xcceab046183347aauL, 0x8080701ed0b0c832uL))

public val ANNOTATION_FOOTNOTE_GUID: Guid = Guid.fromU128(U128(0x3de10e21412542dbuL, 0x8620be8083080624uL))

public val ANNOTATION_FORMAT_CHANGE_GUID: Guid = Guid.fromU128(U128(0xeb247345d4f141ceuL, 0x8e52f79b69635e48uL))

public val ANNOTATION_FORMULA_ERROR_GUID: Guid = Guid.fromU128(U128(0x956119820cab46d5uL, 0xa2f0e30d1905f8bfuL))

public val ANNOTATION_GRAMMAR_ERROR_GUID: Guid = Guid.fromU128(U128(0x757a048d451841c6uL, 0x854cdc009b7cfb53uL))

public val ANNOTATION_HEADER_GUID: Guid = Guid.fromU128(U128(0x867b409bb2164472uL, 0xa219525e310681f8uL))

public val ANNOTATION_HIGHLIGHTED_GUID: Guid = Guid.fromU128(U128(0x757c884e80834081uL, 0x8b9ce87f5072f0e4uL))

public val ANNOTATION_INSERTION_CHANGE_GUID: Guid = Guid.fromU128(U128(0xdbeb3a6df154164uL, 0xa3c0e21a8ce931c4uL))

public val ANNOTATION_MATHEMATICS_GUID: Guid = Guid.fromU128(U128(0xeaab634b26d040c1uL, 0x807357ca1c633c9buL))

public val ANNOTATION_MOVE_CHANGE_GUID: Guid = Guid.fromU128(U128(0x9da587eb23e54490uL, 0xb3851a22ddc8b187uL))

public val ANNOTATION_PATTERN_GUID: Guid = Guid.fromU128(U128(0xf6c72ad7356c4850uL, 0x9291316f608a8c84uL))

public val ANNOTATION_SENSITIVE_GUID: Guid = Guid.fromU128(U128(0x37f4c04f0f124464uL, 0x929c828fd15292e3uL))

public val ANNOTATION_SPELLING_ERROR_GUID: Guid = Guid.fromU128(U128(0xae85567e9ece423fuL, 0x81b796c43d53e50euL))

public val ANNOTATION_TARGET_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb71b302d210444aduL, 0x9c5c092b4907d70fuL))

public val ANNOTATION_TRACK_CHANGES_GUID: Guid = Guid.fromU128(U128(0x21e6e888dc144016uL, 0xac27190553c8c470uL))

public val ANNOTATION_UNSYNCED_CHANGE_GUID: Guid = Guid.fromU128(U128(0x1851116a0e474b30uL, 0x8cb5d7dae4fbcd1buL))

public val APP_BAR_CONTROL_GUID: Guid = Guid.fromU128(U128(0x6114908dcc024d37uL, 0x875bb530c7139554uL))

public val ARIA_PROPERTIES_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x4213678ce0254922uL, 0xbeb5e43ba08e6221uL))

public val ARIA_ROLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xdd207b95be4a4e0duL, 0xb72763ace94b6916uL))

public val ASYNC_CONTENT_LOADED_EVENT_GUID: Guid = Guid.fromU128(U128(0x5fdee11cd2fa4fb9uL, 0x904e5cbee894d5efuL))

public val AUTOMATION_FOCUS_CHANGED_EVENT_GUID: Guid = Guid.fromU128(U128(0xb68a1f17f60d41a7uL, 0xa3ccb05292155fe0uL))

public val AUTOMATION_ID_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc82c0500b60e4310uL, 0xa267303c531f8ee5uL))

public val AUTOMATION_PROPERTY_CHANGED_EVENT_GUID: Guid = Guid.fromU128(U128(0x2527fba18d7a4630uL, 0xa4cce66315942f52uL))

public val BOUNDING_RECTANGLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x7bbfe8b23bfc48dduL, 0xb729c794b846e9a1uL))

public val BUTTON_CONTROL_GUID: Guid = Guid.fromU128(U128(0x5a78e369c6a14f33uL, 0xa9d779f20d0c788euL))

public val C_ACC_PROP_SERVICES: Guid = Guid.fromU128(U128(0xb5f8350b054848b1uL, 0xa6ee88bd00b4a5e7uL))

public val CLSID_ACC_PROP_SERVICES: Guid = Guid.fromU128(U128(0xb5f8350b054848b1uL, 0xa6ee88bd00b4a5e7uL))

public val CUI_AUTOMATION: Guid = Guid.fromU128(U128(0xff48dba460ef4201uL, 0xaa8754103eef594euL))

public val CUI_AUTOMATION8: Guid = Guid.fromU128(U128(0xe22ad333b25f460cuL, 0x83d00581107395c9uL))

public val CUI_AUTOMATION_REGISTRAR: Guid = Guid.fromU128(U128(0x6e29fabf997742d1uL, 0x8d0eca7e61ad87e6uL))

public val CALENDAR_CONTROL_GUID: Guid = Guid.fromU128(U128(0x8913eb8800e546bcuL, 0x8e4e14a786e165a1uL))

public val CENTER_POINT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xcb00c08540c4edbuL, 0x944526359ea69785uL))

public val CHANGES_EVENT_GUID: Guid = Guid.fromU128(U128(0x7df26714614f4e05uL, 0x9488716c5ba19436uL))

public val CHANGES_SUMMARY_GUID: Guid = Guid.fromU128(U128(0x313d65a6e60f4d62uL, 0x986155afd728d207uL))

public val CHECK_BOX_CONTROL_GUID: Guid = Guid.fromU128(U128(0xfb50f922a3db49c0uL, 0x8bc306dad55778e2uL))

public val CLASS_NAME_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x157b7215894f4b65uL, 0x84e2aac0da08b16buL))

public val CLICKABLE_POINT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x196903bb2034818uL, 0xa9f3f08e675f2341uL))

public val COMBO_BOX_CONTROL_GUID: Guid = Guid.fromU128(U128(0x54cb426c2f334fffuL, 0xaaa1aef60dac5debuL))

public val CONTROL_TYPE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xca774fea28ac4bc2uL, 0x94caacec6d6c10a3uL))

public val CONTROLLER_FOR_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x51124c8aa5d24f13uL, 0x9be67fa8ba9d3a90uL))

public val CULTURE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe2d74f273d794dc2uL, 0xb88b3044963a8afbuL))

public val CUSTOM_NAVIGATION_PATTERN_GUID: Guid = Guid.fromU128(U128(0xafea938a621e4054uL, 0xbb2c2f46114dac3fuL))

public val CUSTOM_CONTROL_GUID: Guid = Guid.fromU128(U128(0xf29ea0c3adb7430auL, 0xba90e52c7313e6eduL))

public val DATA_GRID_CONTROL_GUID: Guid = Guid.fromU128(U128(0x84b783afd1034b0auL, 0x8415e73942410f4buL))

public val DATA_ITEM_CONTROL_GUID: Guid = Guid.fromU128(U128(0xa0177842d94f42a5uL, 0x814b6068addc8da5uL))

public val DESCRIBED_BY_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x7c5865b8999240fduL, 0x8db06bf1d317f998uL))

public val DOCK_DOCK_POSITION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6d67f02ec0b04b10uL, 0xb5b918d6ecf98760uL))

public val DOCK_PATTERN_GUID: Guid = Guid.fromU128(U128(0x9cbaa84683c8428duL, 0x827f7e6063fe0620uL))

public val DOCUMENT_CONTROL_GUID: Guid = Guid.fromU128(U128(0x3cd6bb6f6f084562uL, 0xb229e4e2fc7a9eb4uL))

public val DRAG_DRAG_CANCEL_EVENT_GUID: Guid = Guid.fromU128(U128(0xc3ede6fa34514e0fuL, 0x9e71df9c280a4657uL))

public val DRAG_DRAG_COMPLETE_EVENT_GUID: Guid = Guid.fromU128(U128(0x38e96188ef1f463euL, 0x91ca3a7792c29cafuL))

public val DRAG_DRAG_START_EVENT_GUID: Guid = Guid.fromU128(U128(0x883a480b3aa9429duL, 0x95e4d9c8d011f0dduL))

public val DRAG_DROP_EFFECT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x646f277948d34b23uL, 0x89024bf100005df3uL))

public val DRAG_DROP_EFFECTS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xf5d611567ce649beuL, 0xa8369269dcec920fuL))

public val DRAG_GRABBED_ITEMS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x77c1562c7b864b21uL, 0x9ed73cefda6f4c43uL))

public val DRAG_IS_GRABBED_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x45f206f375cc4ccauL, 0xa9b9fcdfb982d8a2uL))

public val DRAG_PATTERN_GUID: Guid = Guid.fromU128(U128(0xc0bee21fccb34feduL, 0x995b114f6e3d2728uL))

public val DROP_TARGET_DRAG_ENTER_EVENT_GUID: Guid = Guid.fromU128(U128(0xaad9319b032c4a88uL, 0x961d1cf579581e34uL))

public val DROP_TARGET_DRAG_LEAVE_EVENT_GUID: Guid = Guid.fromU128(U128(0xf82eb1524a24988uL, 0x9217de162aee272buL))

public val DROP_TARGET_DROP_TARGET_EFFECT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8bb75975a0ca4981uL, 0xb81887fc66e9509duL))

public val DROP_TARGET_DROP_TARGET_EFFECTS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xbc1dd4edcb8945f1uL, 0xa592e03b08ae790fuL))

public val DROP_TARGET_DROPPED_EVENT_GUID: Guid = Guid.fromU128(U128(0x622cead81edb4a3duL, 0xabbcbe2211ff68b5uL))

public val DROP_TARGET_PATTERN_GUID: Guid = Guid.fromU128(U128(0xbcbec56bd344b7buL, 0x9fd52659905ea3dcuL))

public val EDIT_CONTROL_GUID: Guid = Guid.fromU128(U128(0x6504a5c82c864f87uL, 0xae7b1abddc810cf9uL))

public val EXPAND_COLLAPSE_EXPAND_COLLAPSE_STATE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x275a4c4885a74f69uL, 0xaba0af157610002buL))

public val EXPAND_COLLAPSE_PATTERN_GUID: Guid = Guid.fromU128(U128(0xae05efa2f9d1428auL, 0x834c53a5c52f9b8buL))

public val FILL_COLOR_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6e0ec4d0e2a84a56uL, 0x9de7953389933b39uL))

public val FILL_TYPE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc6fc74e48cb9429cuL, 0xa9e19bc4ac372b62uL))

public val FLOWS_FROM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x5c6844f19de48f8uL, 0x95fa880d5b0fd615uL))

public val FLOWS_TO_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe4f33d20559a47fbuL, 0xa830f9cb4ff1a70auL))

public val FRAMEWORK_ID_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xdbfd99007e1a4f58uL, 0xb61b7063120f773buL))

public val FULL_DESCRIPTION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xd4450ff6aef4f33uL, 0x95dd7befa72a4391uL))

public val GRID_ITEM_COLUMN_SPAN_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x583ea3f586d04b08uL, 0xa6ec2c5463ffc109uL))

public val GRID_ITEM_COLUMN_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc774c15c62c04519uL, 0x8bdc47be573c8ad5uL))

public val GRID_ITEM_PARENT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x9d912252b97f4eccuL, 0x8510ea0e33427c72uL))

public val GRID_ITEM_PATTERN_GUID: Guid = Guid.fromU128(U128(0xf2d5c877a4624957uL, 0xa2a52c96b303bc63uL))

public val GRID_ITEM_ROW_SPAN_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x4582291c466b4e93uL, 0x8e833d1715ec0c5euL))

public val GRID_ITEM_ROW_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6223972ac9454563uL, 0x9329fdc974af2553uL))

public val GRID_COLUMN_COUNT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xfe96f37544aa4536uL, 0xac7a2a75d71a3efcuL))

public val GRID_PATTERN_GUID: Guid = Guid.fromU128(U128(0x260a2ccb93a84e44uL, 0xa4c13df397f2b02buL))

public val GRID_ROW_COUNT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x2a9505bfc2eb4fb6uL, 0xb3568245ae53703euL))

public val GROUP_CONTROL_GUID: Guid = Guid.fromU128(U128(0xad50aa1ce8c84774uL, 0xae1bdd86df0b3bdcuL))

public val HAS_KEYBOARD_FOCUS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xcf8afd393f464800uL, 0x9656b2bf12529905uL))

public val HEADER_ITEM_CONTROL_GUID: Guid = Guid.fromU128(U128(0xe6bc12cb7c8e49cfuL, 0xb1684a93a32bebb0uL))

public val HEADER_CONTROL_GUID: Guid = Guid.fromU128(U128(0x5b90cbce78fb4614uL, 0x82b6554d74718e67uL))

public val HEADING_LEVEL_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x29084272aaaf4a30uL, 0x87963c12f62b6bbbuL))

public val HELP_TEXT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8555685097745c7uL, 0xa7a6abaf5684121auL))

public val HOSTED_FRAGMENT_ROOTS_INVALIDATED_EVENT_GUID: Guid = Guid.fromU128(U128(0xe6bdb03e09214ec5uL, 0x8dcfeae877b0426buL))

public val HYPERLINK_CONTROL_GUID: Guid = Guid.fromU128(U128(0x8a56022cb00d4d15uL, 0x8ff05b6b266e5e02uL))

public val IIS_CONTROL_ACCESSIBLE: Guid = Guid.fromU128(U128(0x38c682a6973143f2uL, 0x9faee901e641b101uL))

public val IIS_IS_OLEACC_PROXY: Guid = Guid.fromU128(U128(0x902697fa80e44560uL, 0x802aa13f22a64709uL))

public val IMAGE_CONTROL_GUID: Guid = Guid.fromU128(U128(0x2d3736e46b164c57uL, 0xa962f93260a75243uL))

public val INPUT_DISCARDED_EVENT_GUID: Guid = Guid.fromU128(U128(0x7f36c3677b18417cuL, 0x97e39d58ddc944abuL))

public val INPUT_REACHED_OTHER_ELEMENT_EVENT_GUID: Guid = Guid.fromU128(U128(0xed201d8a4e6c415euL, 0xa8742460c9b66ba8uL))

public val INPUT_REACHED_TARGET_EVENT_GUID: Guid = Guid.fromU128(U128(0x93ed549a054940f0uL, 0xbedb28e44f7de2a3uL))

public val INVOKE_INVOKED_EVENT_GUID: Guid = Guid.fromU128(U128(0xdfd699f0c91549dduL, 0xb422dde785c3d24buL))

public val INVOKE_PATTERN_GUID: Guid = Guid.fromU128(U128(0xd976c2fc66ea4a6euL, 0xb28fc24c7546ad37uL))

public val IS_ANNOTATION_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb5b32386d5c41b6uL, 0xbcc45e807f6551c4uL))

public val IS_CONTENT_ELEMENT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x4bda64a8f5d8480buL, 0x8155ef2e89adb672uL))

public val IS_CONTROL_ELEMENT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x95f35085abcc4afduL, 0xa5f4dbb46c230fdbuL))

public val IS_CUSTOM_NAVIGATION_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8f8e80d4235148e0uL, 0x874a54aa7313889auL))

public val IS_DATA_VALID_FOR_FORM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x445ac684c3fc4dd9uL, 0xacf8845a579296bauL))

public val IS_DIALOG_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x9d0dfb9b84364501uL, 0xbbbbe534a4fb3b3fuL))

public val IS_DOCK_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x2600a4c42ff84c96uL, 0xae318fe619a13c6cuL))

public val IS_DRAG_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe997a7b71d394ca7uL, 0xbe0f277fcf5605ccuL))

public val IS_DROP_TARGET_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x686b62e8e194aafuL, 0x873d384f6d3b92beuL))

public val IS_ENABLED_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x2109427fda604feduL, 0xbf1b264bdce6eb3auL))

public val IS_EXPAND_COLLAPSE_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x929d380652874725uL, 0xaa16222afc63d595uL))

public val IS_GRID_ITEM_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x5a43e524f9a24b12uL, 0x84c8b48a3efedd34uL))

public val IS_GRID_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x5622c26cf0ef4f3buL, 0x97cb714c0868588buL))

public val IS_INVOKE_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x4e72573883644679uL, 0xaa6cf3f41931f750uL))

public val IS_ITEM_CONTAINER_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x624b5ca7fe404957uL, 0xa01920c4cf11920fuL))

public val IS_KEYBOARD_FOCUSABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xf7b8552a08594b37uL, 0xb9cb51e72092f29fuL))

public val IS_LEGACY_I_ACCESSIBLE_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xd8ebd0c7929a4ee7uL, 0x8d3ad3d94413027buL))

public val IS_MULTIPLE_VIEW_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xff0a31eb8e25469duL, 0x8d6ee771a27c1b90uL))

public val IS_OBJECT_MODEL_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6b21d89b2841412fuL, 0x8ef215ca952318bauL))

public val IS_OFFSCREEN_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x3c3d160db7942dbuL, 0xa2ef1c231eede507uL))

public val IS_PASSWORD_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe8482eb1687c497buL, 0xbebc03be53ec1454uL))

public val IS_PERIPHERAL_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xda7582767ed549d4uL, 0x8e68ecc9a2d300dduL))

public val IS_RANGE_VALUE_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xfda4244aeb4d43ffuL, 0xb5aded36d373ec4cuL))

public val IS_REQUIRED_FOR_FORM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x4f5f43cf59fb4bdeuL, 0xa270602e5e1141e9uL))

public val IS_SCROLL_ITEM_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x1cad1a0509274b76uL, 0x97e10fcdb209b98auL))

public val IS_SCROLL_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x3ebb7b4a828a4b57uL, 0x9d222fea1632ed0duL))

public val IS_SELECTION_ITEM_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8becd62d0bc34109uL, 0xbee28e6715290e68uL))

public val IS_SELECTION_PATTERN2AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x490806fb6e894a47uL, 0x8319d266e511f021uL))

public val IS_SELECTION_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xf588acbec7694838uL, 0x9a602686dc1188c4uL))

public val IS_SPREADSHEET_ITEM_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x9fe79b2a2f9443fduL, 0x996b549e316f4acduL))

public val IS_SPREADSHEET_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6ff43732e4b44555uL, 0x97bcecdbbc4d1888uL))

public val IS_STRUCTURED_MARKUP_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb0d4c1962c0b489cuL, 0xb165a405928c6f3duL))

public val IS_STYLES_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x27f353d3459c4b59uL, 0xa49050611dacafb5uL))

public val IS_SYNCHRONIZED_INPUT_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x75d69cc5d2bf4943uL, 0x876eb45b62a6cc66uL))

public val IS_TABLE_ITEM_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xeb36b40d8ea4489buL, 0xa013e60d5951fe34uL))

public val IS_TABLE_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xcb83575f45c24048uL, 0x9c76159715a139dfuL))

public val IS_TEXT_CHILD_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x559e65df30ff43b5uL, 0xb5ed5b283b80c7e9uL))

public val IS_TEXT_EDIT_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x7843425c8b32484cuL, 0x9ab5e3200571ffdauL))

public val IS_TEXT_PATTERN2AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x41cf921de3f14b22uL, 0x9c81e1c3ed331c22uL))

public val IS_TEXT_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xfbe2d69daff64a45uL, 0x82e2fc92a82f5917uL))

public val IS_TOGGLE_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x78686d53fcd04b83uL, 0x9b785832ce63bb5buL))

public val IS_TRANSFORM_PATTERN2AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x25980b4bbe044710uL, 0xab4afda31dbd2895uL))

public val IS_TRANSFORM_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xa7f78804d68b4077uL, 0xa5c67a5ea1ac31c5uL))

public val IS_VALUE_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb5020a72119473buL, 0xbe375ceb98bbfb22uL))

public val IS_VIRTUALIZED_ITEM_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x302cb1512ac845d6uL, 0x977bd2b3a5a53f20uL))

public val IS_WINDOW_PATTERN_AVAILABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe7a57bb158884155uL, 0x98dcb422fd57f2bcuL))

public val ITEM_CONTAINER_PATTERN_GUID: Guid = Guid.fromU128(U128(0x3d13da0f8b9a4a99uL, 0x85fac5c9a69f1ed4uL))

public val ITEM_STATUS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x51de0321397343e7uL, 0x89130b08e813c37fuL))

public val ITEM_TYPE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xcdda434d6222413buL, 0xa68a325dd1d40f39uL))

public val LIBID_ACCESSIBILITY: Guid = Guid.fromU128(U128(0x1ea4dbf03c3b11cfuL, 0x810c00aa00389b71uL))

public val LABELED_BY_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe5b8924bfc8a4a35uL, 0x8031cf78ac43e55euL))

public val LANDMARK_TYPE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x454045f26f6149f7uL, 0xa4f8b5f0cf82da1euL))

public val LAYOUT_INVALIDATED_EVENT_GUID: Guid = Guid.fromU128(U128(0xed7d6544a6bd4595uL, 0x9bae3d28946cc715uL))

public val LEGACY_I_ACCESSIBLE_CHILD_ID_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x9a191b5d9ef24787uL, 0xa459dcde885dd4e8uL))

public val LEGACY_I_ACCESSIBLE_DEFAULT_ACTION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x3b331729eaad4502uL, 0xb85f92615622913cuL))

public val LEGACY_I_ACCESSIBLE_DESCRIPTION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x464484187d704ea9uL, 0x9d27b7e775cf2ad7uL))

public val LEGACY_I_ACCESSIBLE_HELP_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x94402352161c4b77uL, 0xa98da872cc33947auL))

public val LEGACY_I_ACCESSIBLE_KEYBOARD_SHORTCUT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8f6909ac00b84259uL, 0xa41c966266d43a8auL))

public val LEGACY_I_ACCESSIBLE_NAME_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xcaeb063d40ae4869uL, 0xaa5a1b8e5d666739uL))

public val LEGACY_I_ACCESSIBLE_PATTERN_GUID: Guid = Guid.fromU128(U128(0x54cc0a9f339548afuL, 0xba8d73f85690f3e0uL))

public val LEGACY_I_ACCESSIBLE_ROLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6856e59fcbaf4e31uL, 0x93e8bcbf6f7e491cuL))

public val LEGACY_I_ACCESSIBLE_SELECTION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8aa8b1e0089140ccuL, 0x8b0690d7d4166219uL))

public val LEGACY_I_ACCESSIBLE_STATE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xdf98585422814340uL, 0xab9cc60e2c5803f6uL))

public val LEGACY_I_ACCESSIBLE_VALUE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb5c5b0b682174a77uL, 0x97a5190a85ed0156uL))

public val LEVEL_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x242ac529cd36400fuL, 0xaad97876ef3af627uL))

public val LIST_ITEM_CONTROL_GUID: Guid = Guid.fromU128(U128(0x7b3717f244d14a58uL, 0x98a8f12a9b8f78e2uL))

public val LIST_CONTROL_GUID: Guid = Guid.fromU128(U128(0x9b149ee17cca4cfcuL, 0x9af1cac7bddd3031uL))

public val LIVE_REGION_CHANGED_EVENT_GUID: Guid = Guid.fromU128(U128(0x102d5e90e6a941b6uL, 0xb1c5a9b1929d9510uL))

public val LIVE_SETTING_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc12bcd8e2a8e4950uL, 0x8ae73625111d58ebuL))

public val LOCALIZED_CONTROL_TYPE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8763404fa1bd452auL, 0x89c43f01d3833806uL))

public val LOCALIZED_LANDMARK_TYPE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x7ac81980eafb4fb2uL, 0xbf91f485bef5e8e1uL))

public val MENU_BAR_CONTROL_GUID: Guid = Guid.fromU128(U128(0xcc3842500e7b4ae8uL, 0x95aea08f261b52eeuL))

public val MENU_CLOSED_EVENT_GUID: Guid = Guid.fromU128(U128(0x3cf1266e15824041uL, 0xacd788a35a965297uL))

public val MENU_ITEM_CONTROL_GUID: Guid = Guid.fromU128(U128(0xf45225d3d0a049d8uL, 0x98349a000d2aeddcuL))

public val MENU_MODE_END_EVENT_GUID: Guid = Guid.fromU128(U128(0x9ecd4c9f80dd47b8uL, 0x82675aec06bb2cffuL))

public val MENU_MODE_START_EVENT_GUID: Guid = Guid.fromU128(U128(0x18d7c631166a4ac9uL, 0xae3bef4b5420e681uL))

public val MENU_OPENED_EVENT_GUID: Guid = Guid.fromU128(U128(0xebe2e94566ca4ed1uL, 0x9ff82ad7df0a1b08uL))

public val MENU_CONTROL_GUID: Guid = Guid.fromU128(U128(0x2e9b14400ea841fduL, 0xb374c1ea6f503cd1uL))

public val MULTIPLE_VIEW_CURRENT_VIEW_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x7a81a67ab94f4875uL, 0x918b65c8d2f998e5uL))

public val MULTIPLE_VIEW_PATTERN_GUID: Guid = Guid.fromU128(U128(0x547a6ae4113f47c4uL, 0x850fdb4dfa466b1duL))

public val MULTIPLE_VIEW_SUPPORTED_VIEWS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8d5db9fdce3c4ae7uL, 0xb788400a3c645547uL))

public val NAME_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc3a6921b4a9944f1uL, 0xbca661187052c431uL))

public val NEW_NATIVE_WINDOW_HANDLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x5196b33b380a4982uL, 0x95e191f3ef60e024uL))

public val NOTIFICATION_EVENT_GUID: Guid = Guid.fromU128(U128(0x72c5a2f79788480fuL, 0xb8eb4dee00f6186fuL))

public val OBJECT_MODEL_PATTERN_GUID: Guid = Guid.fromU128(U128(0x3e04acfe08fc47ecuL, 0x96bc353fa3b34aa7uL))

public val OPTIMIZE_FOR_VISUAL_CONTENT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6a852250c75a4e5duL, 0xb858e381b0f78861uL))

public val ORIENTATION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xa01eee6238844415uL, 0x887e678ec21e39bauL))

public val OUTLINE_COLOR_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc395d6c04b554762uL, 0xa073fd303a634f52uL))

public val OUTLINE_THICKNESS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x13e67cc7dac24888uL, 0xbdd3375c62fa9618uL))

public val PROPID_ACC_DEFAULTACTION: Guid = Guid.fromU128(U128(0x180c072bc27f43c7uL, 0x9922f63562a4632buL))

public val PROPID_ACC_DESCRIPTION: Guid = Guid.fromU128(U128(0x4d48dfe4bd3f491fuL, 0xa648492d6f20c588uL))

public val PROPID_ACC_DESCRIPTIONMAP: Guid = Guid.fromU128(U128(0x1ff1435f8a14477buL, 0xb226a0abe279975duL))

public val PROPID_ACC_DODEFAULTACTION: Guid = Guid.fromU128(U128(0x1ba095232e3b49a6uL, 0xa05959682a3c48fduL))

public val PROPID_ACC_FOCUS: Guid = Guid.fromU128(U128(0x6eb335df1c294127uL, 0xb12cdee9fd157f2buL))

public val PROPID_ACC_HELP: Guid = Guid.fromU128(U128(0xc831e11f44db4a99uL, 0x9768cb8f978b7231uL))

public val PROPID_ACC_HELPTOPIC: Guid = Guid.fromU128(U128(0x787d13798ede440buL, 0x8aec11f7bf9030b3uL))

public val PROPID_ACC_KEYBOARDSHORTCUT: Guid = Guid.fromU128(U128(0x7d9bceee7d1e4979uL, 0x93825180f4172c34uL))

public val PROPID_ACC_NAME: Guid = Guid.fromU128(U128(0x608d3df881284aa7uL, 0xa428f55e49267291uL))

public val PROPID_ACC_NAV_DOWN: Guid = Guid.fromU128(U128(0x31670ed3cdf48d2uL, 0x9613138f2dd8a668uL))

public val PROPID_ACC_NAV_FIRSTCHILD: Guid = Guid.fromU128(U128(0xcfd02558557b4c67uL, 0x84f92a09fce40749uL))

public val PROPID_ACC_NAV_LASTCHILD: Guid = Guid.fromU128(U128(0x302ecaa548d54f8duL, 0xb6711a8d20a77832uL))

public val PROPID_ACC_NAV_LEFT: Guid = Guid.fromU128(U128(0x228086cb82f14a39uL, 0x8705dcdc0fff92f5uL))

public val PROPID_ACC_NAV_NEXT: Guid = Guid.fromU128(U128(0x1cdc54558cd94c92uL, 0xa3713939a2fe3eeeuL))

public val PROPID_ACC_NAV_PREV: Guid = Guid.fromU128(U128(0x776d3891c73b4480uL, 0xb3f6076a16a15af6uL))

public val PROPID_ACC_NAV_RIGHT: Guid = Guid.fromU128(U128(0xcd211d9fe1cb4fe5uL, 0xa77c920b884d095buL))

public val PROPID_ACC_NAV_UP: Guid = Guid.fromU128(U128(0x16e1a2b1a4e4767uL, 0x86123386f66935ecuL))

public val PROPID_ACC_PARENT: Guid = Guid.fromU128(U128(0x474c22b6ffc2467auL, 0xb1b5e958b4657330uL))

public val PROPID_ACC_ROLE: Guid = Guid.fromU128(U128(0xcb905ff27bd14c05uL, 0xb3c8e6c241364d70uL))

public val PROPID_ACC_ROLEMAP: Guid = Guid.fromU128(U128(0xf79acda2140d4fe6uL, 0x8914208476328269uL))

public val PROPID_ACC_SELECTION: Guid = Guid.fromU128(U128(0xb99d073cd731405buL, 0x9061d95e8f842984uL))

public val PROPID_ACC_STATE: Guid = Guid.fromU128(U128(0xa8d4d5b00a2142d0uL, 0xa5c0514e984f457buL))

public val PROPID_ACC_STATEMAP: Guid = Guid.fromU128(U128(0x43946c5e0ac04042uL, 0xb52507bbdbe17fa7uL))

public val PROPID_ACC_VALUE: Guid = Guid.fromU128(U128(0x123fe443211a4615uL, 0x9527c45a7e93717auL))

public val PROPID_ACC_VALUEMAP: Guid = Guid.fromU128(U128(0xda1c3d79fc5c420euL, 0xb3999d1533549e75uL))

public val PANE_CONTROL_GUID: Guid = Guid.fromU128(U128(0x5c2b3f5b918242a3uL, 0x8dec8c04c1ee634duL))

public val POSITION_IN_SET_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x33d1dc54641e4d76uL, 0xa6b113f341c1f896uL))

public val PROCESS_ID_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x404999989c314245uL, 0xa40387320e59eaf6uL))

public val PROGRESS_BAR_CONTROL_GUID: Guid = Guid.fromU128(U128(0x228c9f86c36c47bbuL, 0x9fb6a5834bfc53a4uL))

public val PROVIDER_DESCRIPTION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xdca5708ac16b4cd9uL, 0xb889beb16a804904uL))

public val RADIO_BUTTON_CONTROL_GUID: Guid = Guid.fromU128(U128(0x3bdb49dbfe2c4483uL, 0xb3e1e57f219440c6uL))

public val RANGE_VALUE_IS_READ_ONLY_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x25fa1055debf4373uL, 0xa79e1f1a1908d3c4uL))

public val RANGE_VALUE_LARGE_CHANGE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xa1f963253a3d4b44uL, 0x8e1f4a46d9844019uL))

public val RANGE_VALUE_MAXIMUM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x19319914f9794b35uL, 0xa1a6d37e05433473uL))

public val RANGE_VALUE_MINIMUM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x78cbd3b2684d4860uL, 0xaf93d1f95cb022fduL))

public val RANGE_VALUE_PATTERN_GUID: Guid = Guid.fromU128(U128(0x18b00d87b1c9476auL, 0xbfbd5f0bdb926f63uL))

public val RANGE_VALUE_SMALL_CHANGE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x81c2c45739414107uL, 0x9975139760f7c072uL))

public val RANGE_VALUE_VALUE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x131f5d98c50c489duL, 0xabe5ae220898c5f7uL))

public val ROTATION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x767cdc7daec04110uL, 0xad3230edd403492euL))

public val RUNTIME_ID_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xa39eebfa7fba4c89uL, 0xb4d4b99e2de7d160uL))

public val SID_CONTROL_ELEMENT_PROVIDER: Guid = Guid.fromU128(U128(0xf4791d68e2544ba3uL, 0x9a5326a5c5497946uL))

public val SID_IS_UI_AUTOMATION_OBJECT: Guid = Guid.fromU128(U128(0xb96fdb8572044724uL, 0x842bc7059dedb9d0uL))

public val SCROLL_BAR_CONTROL_GUID: Guid = Guid.fromU128(U128(0xdaf34b3650654946uL, 0xb22f92595fc0751auL))

public val SCROLL_ITEM_PATTERN_GUID: Guid = Guid.fromU128(U128(0x4591d005a8034d5cuL, 0xb4d58d2800f906a7uL))

public val SCROLL_HORIZONTAL_SCROLL_PERCENT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc7c13c0eeb2147ffuL, 0xacc4b5a3350f5191uL))

public val SCROLL_HORIZONTAL_VIEW_SIZE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x70c2e5d4fcb04713uL, 0xa9aaaf92ff79e4cduL))

public val SCROLL_HORIZONTALLY_SCROLLABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8b92514728cd49aeuL, 0xbd63f44118d2e719uL))

public val SCROLL_PATTERN_GUID: Guid = Guid.fromU128(U128(0x895fa4b4759d4c50uL, 0x8e1503460672003cuL))

public val SCROLL_VERTICAL_SCROLL_PERCENT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x6c8d7099b2a84948uL, 0xbff73cf9058bfefbuL))

public val SCROLL_VERTICAL_VIEW_SIZE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xde6a2e22d8c740c5uL, 0x83bae5f681d53108uL))

public val SCROLL_VERTICALLY_SCROLLABLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x8916479800684315uL, 0xb89a1e7cfbbc3dfcuL))

public val SELECTION2_CURRENT_SELECTED_ITEM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x34257c2683b541a6uL, 0x939cae841c136236uL))

public val SELECTION2_FIRST_SELECTED_ITEM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xcc24ea67369c4e55uL, 0x9ff738da69540c29uL))

public val SELECTION2_ITEM_COUNT_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xbb49eb9f456d4048uL, 0xb5919c2026b84636uL))

public val SELECTION2_LAST_SELECTED_ITEM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xcf7bda902d8349f8uL, 0x860c9ce394cf89b4uL))

public val SELECTION_ITEM_ELEMENT_ADDED_TO_SELECTION_EVENT_EVENT_GUID: Guid = Guid.fromU128(U128(0x3c822dd1c4074dbauL, 0x91dd79d4aed0aec6uL))

public val SELECTION_ITEM_ELEMENT_REMOVED_FROM_SELECTION_EVENT_EVENT_GUID: Guid = Guid.fromU128(U128(0x97fa8a9707941afuL, 0x8b9c0934d8305e5cuL))

public val SELECTION_ITEM_ELEMENT_SELECTED_EVENT_EVENT_GUID: Guid = Guid.fromU128(U128(0xb9c7dbfb4ebe4532uL, 0xaaf4008cf647233cuL))

public val SELECTION_ITEM_IS_SELECTED_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xf122835fcd5f43dfuL, 0xb79d4b849e9e6020uL))

public val SELECTION_ITEM_PATTERN_GUID: Guid = Guid.fromU128(U128(0x9bc64eeb87c74b28uL, 0x94bb4d9fa437b6efuL))

public val SELECTION_ITEM_SELECTION_CONTAINER_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xa4365b6e9c1e4b63uL, 0x8b53c2421dd1e8fbuL))

public val SELECTION_CAN_SELECT_MULTIPLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x49d73da5c8834500uL, 0x883d8fcf8daf6cbeuL))

public val SELECTION_INVALIDATED_EVENT_EVENT_GUID: Guid = Guid.fromU128(U128(0xcac1490416b44b53uL, 0x8e474cb1df267bb7uL))

public val SELECTION_IS_SELECTION_REQUIRED_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb1ae442263fe44e7uL, 0xa5a5a738c829b19auL))

public val SELECTION_PATTERN2_GUID: Guid = Guid.fromU128(U128(0xfba25cabab9849f7uL, 0xa7dcfe539dc15be7uL))

public val SELECTION_PATTERN_GUID: Guid = Guid.fromU128(U128(0x66e3b7e8d8214d25uL, 0x8761435d2c8b253fuL))

public val SELECTION_SELECTION_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xaa6dc2a20e2b4d38uL, 0x96d534e470b81853uL))

public val SEMANTIC_ZOOM_CONTROL_GUID: Guid = Guid.fromU128(U128(0x5fd34a43061e42c8uL, 0xb5899dccf74bc43auL))

public val SEPARATOR_CONTROL_GUID: Guid = Guid.fromU128(U128(0x8767eba32a634ab0uL, 0xac8daa50e23de978uL))

public val SIZE_OF_SET_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x1600d33c3b9f4369uL, 0x9431aa293f344cf1uL))

public val SIZE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x2b5f761df8854404uL, 0x973f9b1d98e36d8fuL))

public val SLIDER_CONTROL_GUID: Guid = Guid.fromU128(U128(0xb033c24b3b354ceauL, 0xb609763682fa660buL))

public val SPINNER_CONTROL_GUID: Guid = Guid.fromU128(U128(0x60cc4b383cb14161uL, 0xb442c6b726c17825uL))

public val SPLIT_BUTTON_CONTROL_GUID: Guid = Guid.fromU128(U128(0x7011f01f4ace4901uL, 0xb461920a6f1ca650uL))

public val SPREADSHEET_ITEM_ANNOTATION_OBJECTS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xa3194c38c9bc4604uL, 0x9396ae3f9f457f7buL))

public val SPREADSHEET_ITEM_ANNOTATION_TYPES_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc70c51d0d6024b45uL, 0xafbcb4712b96d72buL))

public val SPREADSHEET_ITEM_FORMULA_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe602e47d1b474beauL, 0x87cf3b0b0b5c15b6uL))

public val SPREADSHEET_ITEM_PATTERN_GUID: Guid = Guid.fromU128(U128(0x32cf83fff1a84a8cuL, 0x8658d47ba74e20bauL))

public val SPREADSHEET_PATTERN_GUID: Guid = Guid.fromU128(U128(0x6a5b24c99d1e4b85uL, 0x9e44c02e3169b10buL))

public val STATUS_BAR_CONTROL_GUID: Guid = Guid.fromU128(U128(0xd45e7d1b5873475fuL, 0x95a40433e1f1b00auL))

public val STRUCTURE_CHANGED_EVENT_GUID: Guid = Guid.fromU128(U128(0x599779613edd4b11uL, 0xb13b676b2a2a6ca9uL))

public val STRUCTURED_MARKUP_COMPOSITION_COMPLETE_EVENT_GUID: Guid = Guid.fromU128(U128(0xc48a3c17677a4047uL, 0xa68dfc1257528aefuL))

public val STRUCTURED_MARKUP_DELETED_EVENT_GUID: Guid = Guid.fromU128(U128(0xf9d0a020e1c14ecfuL, 0xb9aa52efde7e41e1uL))

public val STRUCTURED_MARKUP_PATTERN_GUID: Guid = Guid.fromU128(U128(0xabbd087886654f5cuL, 0x94fc36e7d8bb706buL))

public val STRUCTURED_MARKUP_SELECTION_CHANGED_EVENT_GUID: Guid = Guid.fromU128(U128(0xa7c815f7ff9f41c7uL, 0xa3a7ab6cbfdb4903uL))

public val STYLE_ID_BULLETED_LIST_GUID: Guid = Guid.fromU128(U128(0x5963ed6464264632uL, 0x8cafa32ad402d91auL))

public val STYLE_ID_CUSTOM_GUID: Guid = Guid.fromU128(U128(0xef2edd3ea9994b7cuL, 0xa37809bbd52a3516uL))

public val STYLE_ID_EMPHASIS_GUID: Guid = Guid.fromU128(U128(0xca6e7dbe355e4820uL, 0x95a0925f041d3470uL))

public val STYLE_ID_HEADING1_GUID: Guid = Guid.fromU128(U128(0x7f7e8f6968664621uL, 0x930c9a5d0ca5961cuL))

public val STYLE_ID_HEADING2_GUID: Guid = Guid.fromU128(U128(0xbaa9b2415c69469duL, 0x85ad474737b52b14uL))

public val STYLE_ID_HEADING3_GUID: Guid = Guid.fromU128(U128(0xbf8be9d2d8b84ec5uL, 0x8c529cfb0d035970uL))

public val STYLE_ID_HEADING4_GUID: Guid = Guid.fromU128(U128(0x8436ffc0957845fcuL, 0x83a4ff40053315dduL))

public val STYLE_ID_HEADING5_GUID: Guid = Guid.fromU128(U128(0x909f424d0dbf406euL, 0x97bb4e773d9798f7uL))

public val STYLE_ID_HEADING6_GUID: Guid = Guid.fromU128(U128(0x89d234595d5b4824uL, 0xa42011d3ed82e40fuL))

public val STYLE_ID_HEADING7_GUID: Guid = Guid.fromU128(U128(0xa3790473e9ae422duL, 0xb8e33b675c6181a4uL))

public val STYLE_ID_HEADING8_GUID: Guid = Guid.fromU128(U128(0x2bc14145a40c4881uL, 0x84aef2235685380cuL))

public val STYLE_ID_HEADING9_GUID: Guid = Guid.fromU128(U128(0xc70d9133bb2a43d3uL, 0x8ac633657884b0f0uL))

public val STYLE_ID_NORMAL_GUID: Guid = Guid.fromU128(U128(0xcd14d429e45e4475uL, 0xa1c57f9e6be96ebauL))

public val STYLE_ID_NUMBERED_LIST_GUID: Guid = Guid.fromU128(U128(0x1e96dbd564c343d0uL, 0xb1eeb53b06e3eddfuL))

public val STYLE_ID_QUOTE_GUID: Guid = Guid.fromU128(U128(0x5d1c21ea81954f6cuL, 0x87ea5dabece64c1duL))

public val STYLE_ID_SUBTITLE_GUID: Guid = Guid.fromU128(U128(0xb5d9fc175d6f4420uL, 0xb4397cb19ad434e2uL))

public val STYLE_ID_TITLE_GUID: Guid = Guid.fromU128(U128(0x15d8201affcf481fuL, 0xb0a130b63be98f07uL))

public val STYLES_EXTENDED_PROPERTIES_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xf451cda0ba0a4681uL, 0xb0b00dbdb53e58f3uL))

public val STYLES_FILL_COLOR_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x63eff97aa1c54b1duL, 0x84ebb765f2edd632uL))

public val STYLES_FILL_PATTERN_COLOR_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x939a59fe8fbd4e75uL, 0xa271ac4595195163uL))

public val STYLES_FILL_PATTERN_STYLE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x81cf651f482b4451uL, 0xa30ae1545e554fb8uL))

public val STYLES_PATTERN_GUID: Guid = Guid.fromU128(U128(0x1ae62655da724d60uL, 0xa153e5aa6988e3bfuL))

public val STYLES_SHAPE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xc71a23f8778c400duL, 0x84583b543e526984uL))

public val STYLES_STYLE_ID_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xda82852f38174233uL, 0x82af02279e72cc77uL))

public val STYLES_STYLE_NAME_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x1c12b03505d14f55uL, 0x9e8e1489f3ff550duL))

public val SYNCHRONIZED_INPUT_PATTERN_GUID: Guid = Guid.fromU128(U128(0x5c288a6c47b488buL, 0xb65333977a551b8buL))

public val SYSTEM_ALERT_EVENT_GUID: Guid = Guid.fromU128(U128(0xd271545d7a3a47a7uL, 0x847481d29a2451c9uL))

public val TAB_ITEM_CONTROL_GUID: Guid = Guid.fromU128(U128(0x2c6a634f921b4e6euL, 0xb26e08fcb0798f4cuL))

public val TAB_CONTROL_GUID: Guid = Guid.fromU128(U128(0x38cd1f2d337a4bd2uL, 0xa5e3adb469e30bd3uL))

public val TABLE_ITEM_COLUMN_HEADER_ITEMS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x967a56a374b6431euL, 0x8de699c411031c58uL))

public val TABLE_ITEM_PATTERN_GUID: Guid = Guid.fromU128(U128(0xdf1343bd18884a29uL, 0xa50cb92e6de37f6fuL))

public val TABLE_ITEM_ROW_HEADER_ITEMS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb3f853a005744cd8uL, 0xbcd7ed5923572d97uL))

public val TABLE_COLUMN_HEADERS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xaff1d72b968d42b1uL, 0xb459150b299da664uL))

public val TABLE_CONTROL_GUID: Guid = Guid.fromU128(U128(0x773bfa0e5bc44debuL, 0x921bde7b3206229euL))

public val TABLE_PATTERN_GUID: Guid = Guid.fromU128(U128(0xc415218ea028461euL, 0xaa928f925cf79351uL))

public val TABLE_ROW_HEADERS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xd9e35b876eb84562uL, 0xaac6a8a9075236a8uL))

public val TABLE_ROW_OR_COLUMN_MAJOR_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x83be75c329fe4a30uL, 0x85e12a6277fd106euL))

public val TEXT_CHILD_PATTERN_GUID: Guid = Guid.fromU128(U128(0x7533cab73bfe41efuL, 0x9e85e2638cbe169euL))

public val TEXT_EDIT_CONVERSION_TARGET_CHANGED_EVENT_GUID: Guid = Guid.fromU128(U128(0x3388c183ed4f4c8buL, 0x9baa364d51d8847fuL))

public val TEXT_EDIT_PATTERN_GUID: Guid = Guid.fromU128(U128(0x69f3ff895af94c75uL, 0x9340f2de292e4591uL))

public val TEXT_EDIT_TEXT_CHANGED_EVENT_GUID: Guid = Guid.fromU128(U128(0x120b0308ec224eb8uL, 0x9c989867cda1b165uL))

public val TEXT_AFTER_PARAGRAPH_SPACING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x588cbb38e62f497cuL, 0xb5d1ccdf0ee823d8uL))

public val TEXT_AFTER_SPACING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x588cbb38e62f497cuL, 0xb5d1ccdf0ee823d8uL))

public val TEXT_ANIMATION_STYLE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x628209f07c9a4d57uL, 0xbe641f1836571ff5uL))

public val TEXT_ANNOTATION_OBJECTS_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xff41cf68e7ab40b9uL, 0x8c7272a8ed94017duL))

public val TEXT_ANNOTATION_TYPES_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xad2eb431ee4e4be1uL, 0xa7ba5559155a73efuL))

public val TEXT_BACKGROUND_COLOR_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xfdc49a07583d4f17uL, 0xad2777fc832a3c0buL))

public val TEXT_BEFORE_PARAGRAPH_SPACING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xbe7b0ab1c8224a24uL, 0x85e9c8f2650fc79cuL))

public val TEXT_BEFORE_SPACING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xbe7b0ab1c8224a24uL, 0x85e9c8f2650fc79cuL))

public val TEXT_BULLET_STYLE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xc1097c90d5c44237uL, 0x97813bec8ba54e48uL))

public val TEXT_CAP_STYLE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xfb059c5092cc49a5uL, 0xba8f0aa872bba2f3uL))

public val TEXT_CARET_BIDI_MODE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x929ee7a651d34715uL, 0x96dcb694fa24a168uL))

public val TEXT_CARET_POSITION_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xb227b13198894752uL, 0xa91b733efdc5c5a0uL))

public val TEXT_CONTROL_GUID: Guid = Guid.fromU128(U128(0xae9772dcd3314f09uL, 0xbe207e6dfaf07b0auL))

public val TEXT_CULTURE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xc2025af9a42d4ceduL, 0xa1fbc6746315222euL))

public val TEXT_FONT_NAME_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x64e63ba8f2e5476euL, 0xa4771734feaaf726uL))

public val TEXT_FONT_SIZE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xdc5eeeff05064673uL, 0x93f2377e4a8e01f1uL))

public val TEXT_FONT_WEIGHT_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x6fc02359b3164f5fuL, 0xb401f1ce55741853uL))

public val TEXT_FOREGROUND_COLOR_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x72d1c95d5e60471auL, 0x96b16c1b3b77a436uL))

public val TEXT_HORIZONTAL_TEXT_ALIGNMENT_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x4ea6161fba3477auL, 0x952abb326d026a5buL))

public val TEXT_INDENTATION_FIRST_LINE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x206f9ad5c1d3424auL, 0x81826da9a7f3d632uL))

public val TEXT_INDENTATION_LEADING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x5cf66bac2d454a4buL, 0xb6c9f7221d2815b0uL))

public val TEXT_INDENTATION_TRAILING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x97ff6c0f1ce4408auL, 0xb67b94d83eb69bf2uL))

public val TEXT_IS_ACTIVE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xf5a4e533e1b8436buL, 0x935db57aa3f558c4uL))

public val TEXT_IS_HIDDEN_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x360182fbbdd747f6uL, 0xab6919e33f8a3344uL))

public val TEXT_IS_ITALIC_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xfce12a5613364a34uL, 0x96631bab47239320uL))

public val TEXT_IS_READ_ONLY_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xa738156bca3e495euL, 0x9514833c440feb11uL))

public val TEXT_IS_SUBSCRIPT_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xf0ead8588f53413cuL, 0x873f1a7d7f5e0de4uL))

public val TEXT_IS_SUPERSCRIPT_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xda706ee4b3aa4645uL, 0xa41fcd25157dea76uL))

public val TEXT_LINE_SPACING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x63ff70aed9434b47uL, 0x8ab7a7a033d3214buL))

public val TEXT_LINK_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xb38ef51d9e8d4e46uL, 0x914456ebe177329buL))

public val TEXT_MARGIN_BOTTOM_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x7ee593c472b44cacuL, 0x92713ed24b0e4d42uL))

public val TEXT_MARGIN_LEADING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x9e9242d05ed04900uL, 0x8e8aeecc03835afcuL))

public val TEXT_MARGIN_TOP_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x683d936fc9b94a9auL, 0xb3d9d20d33311e2auL))

public val TEXT_MARGIN_TRAILING_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xaf522f98999d40afuL, 0xa5b20169d0342002uL))

public val TEXT_OUTLINE_STYLES_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x5b675b27db8946feuL, 0x970c614d523bb97duL))

public val TEXT_OVERLINE_COLOR_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x83ab383afd4340dauL, 0xab3eecf8165cbb6duL))

public val TEXT_OVERLINE_STYLE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xa234d66617e427fuL, 0x871de1ff1e0c213fuL))

public val TEXT_PATTERN2_GUID: Guid = Guid.fromU128(U128(0x498479a25b22448duL, 0xb6e4647490860698uL))

public val TEXT_PATTERN_GUID: Guid = Guid.fromU128(U128(0x8615f05d7de544fduL, 0xa6792ca4b46033a8uL))

public val TEXT_SAY_AS_INTERPRET_AS_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xb38ad6aceee14b6euL, 0x88cc014cefa93fcbuL))

public val TEXT_SELECTION_ACTIVE_END_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x1f668cc39bbf416buL, 0xb0a2f89f86f6612cuL))

public val TEXT_STRIKETHROUGH_COLOR_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xbfe15a188c414c5auL, 0x9a0b04af0e07f487uL))

public val TEXT_STRIKETHROUGH_STYLE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x72913ef1da004f01uL, 0x899cac5a8577a307uL))

public val TEXT_STYLE_ID_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x14c300dec32b449buL, 0xab7cb0e0789aea5duL))

public val TEXT_STYLE_NAME_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x22c9e0914d6645d8uL, 0xa828737bab4c98a7uL))

public val TEXT_TABS_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x2e68d00b92fe42d8uL, 0x899aa784aa4454a1uL))

public val TEXT_TEXT_CHANGED_EVENT_EVENT_GUID: Guid = Guid.fromU128(U128(0x4a342082f48348c4uL, 0xac11a84b435e2a84uL))

public val TEXT_TEXT_FLOW_DIRECTIONS_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x8bdf8739f420423euL, 0xaf7720a5d973a907uL))

public val TEXT_TEXT_SELECTION_CHANGED_EVENT_EVENT_GUID: Guid = Guid.fromU128(U128(0x918edaa171b349aeuL, 0x974179beb8d358f3uL))

public val TEXT_UNDERLINE_COLOR_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0xbfa12c73fde24473uL, 0xbf641036d6aa0f45uL))

public val TEXT_UNDERLINE_STYLE_ATTRIBUTE_GUID: Guid = Guid.fromU128(U128(0x5f3b21c0ede444bduL, 0x9c363853038cbfebuL))

public val THUMB_CONTROL_GUID: Guid = Guid.fromU128(U128(0x701ca877e3104dd6uL, 0xb644797e4faea213uL))

public val TITLE_BAR_CONTROL_GUID: Guid = Guid.fromU128(U128(0x98aa55bf3bb04b65uL, 0x836e2ea30dbc171fuL))

public val TOGGLE_PATTERN_GUID: Guid = Guid.fromU128(U128(0xb419760e2f443ffuL, 0x8c5f9457c82b56e9uL))

public val TOGGLE_TOGGLE_STATE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb23cdc5222c24c6cuL, 0x9dedf5c422479edeuL))

public val TOOL_BAR_CONTROL_GUID: Guid = Guid.fromU128(U128(0x8f06b751e1824e98uL, 0x88932284543a7dceuL))

public val TOOL_TIP_CLOSED_EVENT_GUID: Guid = Guid.fromU128(U128(0x276d71ef24a949b6uL, 0x8e97da98b401bbcduL))

public val TOOL_TIP_OPENED_EVENT_GUID: Guid = Guid.fromU128(U128(0x3f4b97ff2edc451duL, 0xbca495a3188d5b03uL))

public val TOOL_TIP_CONTROL_GUID: Guid = Guid.fromU128(U128(0x5ddc6d121374768uL, 0x98ea73f52f7134f3uL))

public val TRANFORM_PATTERN2_GUID: Guid = Guid.fromU128(U128(0x8afcfd07a36944deuL, 0x988b2f7ff49fb8a8uL))

public val TRANSFORM2_CAN_ZOOM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xf357e890a7564359uL, 0x9ca686702bf8f381uL))

public val TRANSFORM2_ZOOM_LEVEL_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xeee29f1af4a24b5buL, 0xac6595cf93283387uL))

public val TRANSFORM2_ZOOM_MAXIMUM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x42ab6b77ceb04ecauL, 0xb82a6cfa5fa1fc08uL))

public val TRANSFORM2_ZOOM_MINIMUM_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x742ccc164ad14e07uL, 0x96feb122c6e6b22buL))

public val TRANSFORM_CAN_MOVE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x1b75824d208b4fdfuL, 0xbccdf1f4e5741f4fuL))

public val TRANSFORM_CAN_RESIZE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xbb98dca54c1a41d4uL, 0xa4f6ebc128644180uL))

public val TRANSFORM_CAN_ROTATE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x10079b483849476fuL, 0xac9644a95c8440d9uL))

public val TRANSFORM_PATTERN_GUID: Guid = Guid.fromU128(U128(0x24b46fdb587e49f1uL, 0x9c4ad8e98b664b7buL))

public val TREE_ITEM_CONTROL_GUID: Guid = Guid.fromU128(U128(0x62c9feb98ffc4878uL, 0xa3a496b030315c18uL))

public val TREE_CONTROL_GUID: Guid = Guid.fromU128(U128(0x7561349cd24143f4uL, 0x9908b5f091bee611uL))

public val VALUE_IS_READ_ONLY_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xeb090f30e24c4799uL, 0xa7050d247bc037f8uL))

public val VALUE_PATTERN_GUID: Guid = Guid.fromU128(U128(0x17faad9ec877475buL, 0xb93377332779b637uL))

public val VALUE_VALUE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe95f5e64269f4a85uL, 0xba994092c3ea2986uL))

public val VIRTUALIZED_ITEM_PATTERN_GUID: Guid = Guid.fromU128(U128(0xf510173e2e7145e9uL, 0xa6e562f6ed8289d5uL))

public val VISUAL_EFFECTS_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xe61a8565aad946d7uL, 0x9e704e8a8420d420uL))

public val WINDOW_CAN_MAXIMIZE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x64fff53f635d41c1uL, 0x950ccb5adfbe28e3uL))

public val WINDOW_CAN_MINIMIZE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xb73b462559884b97uL, 0xb4c2a6fe6e78c8c6uL))

public val WINDOW_CONTROL_GUID: Guid = Guid.fromU128(U128(0xe13a7242f4624f4duL, 0xaec153b28d6c3290uL))

public val WINDOW_IS_MODAL_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xff4e689237b94fcauL, 0x8532ffe674ecfeeduL))

public val WINDOW_IS_TOPMOST_PROPERTY_GUID: Guid = Guid.fromU128(U128(0xef7d85d309374962uL, 0x9241b62345f24041uL))

public val WINDOW_PATTERN_GUID: Guid = Guid.fromU128(U128(0x27901735c7604994uL, 0xad115919e606b110uL))

public val WINDOW_WINDOW_CLOSED_EVENT_GUID: Guid = Guid.fromU128(U128(0xedf141f8fa674e22uL, 0xbbf7944e05735ee2uL))

public val WINDOW_WINDOW_INTERACTION_STATE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x4fed26a404554fa2uL, 0xb21cc4da2db1ff9cuL))

public val WINDOW_WINDOW_OPENED_EVENT_GUID: Guid = Guid.fromU128(U128(0xd3e81d06de454f2fuL, 0x9633de9e02fb65afuL))

public val WINDOW_WINDOW_VISUAL_STATE_PROPERTY_GUID: Guid = Guid.fromU128(U128(0x4ab7905fe860453euL, 0xa30af6431e5daad5uL))
