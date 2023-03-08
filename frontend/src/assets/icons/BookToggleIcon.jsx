const BookToggleIcon = () => {
  return (
    <svg
      width="29"
      height="22"
      viewBox="0 0 29 22"
      fill="none"
      xmlns="http://www.w3.org/2000/svg"
    >
      <g filter="url(#filter0_d_562_4)">
        <path
          d="M5.125 14.1875L14.5 4.8125L23.875 14.1875"
          stroke="#D56767"
          stroke-width="3"
        />
      </g>
      <defs>
        <filter
          id="filter0_d_562_4"
          x="0.0643311"
          y="0.691162"
          width="28.8713"
          height="20.557"
          filterUnits="userSpaceOnUse"
          color-interpolation-filters="sRGB"
        >
          <feFlood flood-opacity="0" result="BackgroundImageFix" />
          <feColorMatrix
            in="SourceAlpha"
            type="matrix"
            values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 127 0"
            result="hardAlpha"
          />
          <feOffset dy="2" />
          <feGaussianBlur stdDeviation="2" />
          <feComposite in2="hardAlpha" operator="out" />
          <feColorMatrix
            type="matrix"
            values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.25 0"
          />
          <feBlend
            mode="normal"
            in2="BackgroundImageFix"
            result="effect1_dropShadow_562_4"
          />
          <feBlend
            mode="normal"
            in="SourceGraphic"
            in2="effect1_dropShadow_562_4"
            result="shape"
          />
        </filter>
      </defs>
    </svg>
  );
};

export default BookToggleIcon;
